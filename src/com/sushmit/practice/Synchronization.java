package com.sushmit.practice;

public class Synchronization {

	public synchronized void nonStaticMethod() {
		System.out.println("Non-tatic: " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
	}
	
	public static synchronized void staticMethod() {
		System.out.println("Static: " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
	}
	
	public static void main(String[] args) {
		Synchronization obj1 = new Synchronization();
		Synchronization obj2 = new Synchronization();
		
		new Thread(() -> obj1.nonStaticMethod()).start();
		
		new Thread(()-> obj2.nonStaticMethod()).start();
		
		new Thread(Synchronization::staticMethod).start();
		
		new Thread(Synchronization::staticMethod).start();
	}
}
