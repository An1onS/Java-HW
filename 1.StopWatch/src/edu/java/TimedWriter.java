package edu.java;

import java.util.Date;
import java.util.TimerTask;

class TimedWriter extends TimerTask {

	private final int    time;
	private final String name;

	public TimedWriter(int time, String name) {
		this.time = time;
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Time " + name + ":" + new Date());
		if (time > 1) {
			System.out.println("-------------------------------------");
		}
	}
}
