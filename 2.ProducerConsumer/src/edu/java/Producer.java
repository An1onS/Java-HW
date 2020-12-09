package edu.java;

public class Producer implements Runnable{

	private final Warehouse warehouse;
	private final int cycles;
	public Producer(Warehouse warehouse, int cycles){
		this.warehouse = warehouse;
		this.cycles = cycles;
	}
	@Override
	public void run() {
		for(int i = 0; i < cycles; i++){
			warehouse.put();
		}
	}
}
