package com.msdosadmin.NMSL_Overlay;

public class AddPlayer extends Thread {
	private String name;
	private boolean no;

	public AddPlayer(String name, boolean notice) {
		this.name = name;
		no = notice;
	}

	@Override
	public void run() {
		System.out.println("多线程接受参数 - " + name);
		Tools.add(name);
		NMSL.panel_1.repaint();
		if (no) {
			NMSL.min++;
			NMSL.getprog.setValue(NMSL.min);
			NMSL.prognum.setText(NMSL.min + "/" + NMSL.max);
			NMSL.frame.repaint();
		}
	}
}
