package com.citi;

import java.util.HashMap;
import java.util.Map;

class LFUCache {

	final int capacity;
	int curSize;
	int minFrequency;
	Map<Integer, DDLNode> cache;
	Map<Integer, DoublyLinkedList> frequencyMap;
	
    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.curSize = 0;
        this.minFrequency = 0;
        
        this.cache = new HashMap<>();
        this.frequencyMap = new HashMap<>();
    }
    
    public void updateNode(DDLNode curNode) {
    	int curFreq = curNode.frequency;
    	DoublyLinkedList curList = frequencyMap.get(curFreq);
    	curList.removeNode(curNode);
    	
    	if(curFreq == minFrequency && curList.listSize == 0) {
    		minFrequency++;
    	}
    	
    	curNode.frequency++;
    	
    	DoublyLinkedList newList = frequencyMap.getOrDefault(curNode.frequency, new DoublyLinkedList());
    	newList.addNode(curNode);
    	frequencyMap.put(curNode.frequency, newList);
    }
    
    public int get(int key) {
        DDLNode curNode = cache.get(key);
        if(curNode == null) {
        	return -1;
        }
        
        updateNode(curNode);
        return curNode.val;
    }
    
    public void put(int key, int value) {
        if(capacity == 0) {
        	return;
        }
        
        if(cache.containsKey(key)) {
        	DDLNode curNode = cache.get(key);
        	curNode.val = value;
        	updateNode(curNode);
        }else {
        	curSize++;
        	if(curSize > capacity) {
        		DoublyLinkedList minFreqList = frequencyMap.get(minFrequency);
        		cache.remove(minFreqList.tail.prev.key);
        		minFreqList.removeNode(minFreqList.tail.prev);
        		curSize--;
        	}
        	
        	minFrequency =1;
        	DDLNode newNode = new DDLNode(key, value);
        	
        	DoublyLinkedList curList = 	frequencyMap.getOrDefault(1, new DoublyLinkedList());
        	curList.addNode(newNode);
        	frequencyMap.put(1, curList);
        	cache.put(key, newNode);
        }
    }
    
    class DDLNode{
    	int key, val, frequency;
    	DDLNode next, prev;
    	
    	public DDLNode(int key, int val) {
    		this.key = key;
    		this.val = val;
    		this.frequency = 1;
    	}
    }
    
    class DoublyLinkedList{
    	int listSize;
    	DDLNode head, tail;
    	
    	public DoublyLinkedList() {
    		this.listSize = 0;
    		this.head = new DDLNode(0, 0);
    		this.tail = new DDLNode(0, 0);
    		head.next = tail;
    		tail.prev = head;
    	}
    	
    	public void addNode(DDLNode curNode) {
    		DDLNode nextNode = head.next;
    		curNode.next = nextNode;
    		curNode.prev = head;
    		head.next = curNode;
    		nextNode.prev = curNode;
    		listSize++;
    	}
    	
    	public void removeNode(DDLNode curNode) {
    		DDLNode prevNode = curNode.prev;
    		DDLNode nextNode = curNode.next;
    		prevNode.next = nextNode;
    		nextNode.prev = prevNode;
    		listSize--;
    	}
    }
    
    public static void main(String[] args) {

        LFUCache cache = new LFUCache(2);

        cache.put(1, 1); // cache = {1=1}
        cache.put(2, 2); // cache = {1=1, 2=2}

        System.out.println(cache.get(1)); // returns 1 (freq of 1 becomes 2)

        cache.put(3, 3); 
        // evicts key 2 (freq=1 is lowest), cache = {1=1, 3=3}

        System.out.println(cache.get(2)); // returns -1 (not found)
        System.out.println(cache.get(3)); // returns 3 (freq becomes 2)

        cache.put(4, 4); 
        // both 1 and 3 have freq=2, LRU among them is 1 → evict 1
        // cache = {3=3, 4=4}

        System.out.println(cache.get(1)); // returns -1
        System.out.println(cache.get(3)); // returns 3
        System.out.println(cache.get(4)); // returns 4
    }
}