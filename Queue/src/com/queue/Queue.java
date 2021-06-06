package com.queue;

public interface Queue {
	
	public void enQueue(int data);
	public int deQueue();
	public boolean isFull();
	public boolean isEmpty();
	public int size();
	public void print();

}
