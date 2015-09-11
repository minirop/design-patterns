package com.formation.observer;

public class MainObserver {

	public static void main(String[] args) {
		DataStore ds = new DataStore();
		Screen scr = new Screen();
		ds.addObserver(scr);
		ds.setData("data 1");
		ds.setData("data 2");
	}

}
