package edu.java;

public class Consumer implements Runnable{

	private final Warehouse warehouse;
	private final int cycles;
	public Consumer(Warehouse warehouse, int cycles){
		this.warehouse = warehouse;
		this.cycles = cycles;
	}

	@Override
	public void run() {
		for(int i = 0; i < cycles; i++){
			warehouse.take();
		}
	}
}
