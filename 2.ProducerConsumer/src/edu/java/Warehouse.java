package edu.java;

public class Warehouse {
	private       int itemsCount;
	private final int capacity;
	public Warehouse(int capacity){
		this.capacity = capacity;
	}
	public synchronized void put(){
		while (itemsCount >= capacity){
			try {
				wait();
			} catch (InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
		}
		itemsCount++;
		System.out.println("Producer stored product");
		System.out.println("Products stored: "+itemsCount);
		System.out.println("--------------------------");
		notify();
	}
	public synchronized void take(){
		while (itemsCount < 1){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		itemsCount--;
		//Integer x = queue.take();
		System.out.println("Product was consumed");
		System.out.println("Products stored: "+ itemsCount);
		System.out.println("-----------------------");
		notify();
		//return queue.take();
	}
}
