package edu.java;

public class Main {

    public static void main(String[] args) {
        final int CAPACITY = 5;
        final int CYCLES = 1000;

        Warehouse warehouse = new Warehouse(CAPACITY);

        Thread producer = new Thread(new Producer(warehouse, CYCLES));
        Thread consumer = new Thread(new Consumer(warehouse, CYCLES));

        producer.start();
        consumer.start();

        try {
            producer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
