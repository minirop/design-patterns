package com.formation.launcher;

import com.formation.classes.Utilisateur;
import com.formation.creation.Singleton;

public class Launcher {
	public static Utilisateur user = null;

	public static void main(String[] args) {
		user = Singleton.Instance("com.formation.classes.Pouet");

		int numberofthread = 2000;
		Thread[] ts = new Thread[numberofthread];
		for (int i = 0; i < numberofthread; i++) {
			ts[i] = new Thread(new Runnable() {

				@Override
				public void run() {
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					for (int i = 0; i < 10000; i++) {
						Utilisateur user2 = Singleton.Instance("com.formation.classes.Pouet");
						if (user2 != user) {
							System.err.println("ERROR");
						}
					}
				}
			});
			ts[i].start();
		}
		for (int i = 0; i < numberofthread; i++) {
			try {
				ts[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("ENDED");

	}

}
