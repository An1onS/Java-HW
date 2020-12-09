package edu.java;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Main {
	private static final int TIMEOUT = 60;
	public static void main(String[] args) {
		TimerTask timerTask1 = new TimedWriter(1, "1s");
		TimerTask timerTask2 = new TimedWriter(5, "5s");
		Timer     timer      = new Timer(true);

		timer.scheduleAtFixedRate(timerTask1, 0, 1000);
		timer.scheduleAtFixedRate(timerTask2, 0, 5000);

		try {
			TimeUnit.SECONDS.sleep(TIMEOUT);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		timer.cancel();
		System.out.println("Работа завершена");
	}
}
