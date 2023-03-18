package com.msdosadmin.NMSL_Overlay;

import static com.msdosadmin.NMSL_Overlay.NMSL.panel;

import java.awt.Color;

import javax.swing.border.LineBorder;

public class RianbowPanel extends Thread {

	public RianbowPanel() {
	}

	@Override
	public void run() {
		try {
			while (true) {
				int nmsl = 0;
				for (nmsl = 0; nmsl < 255; nmsl++) {
					panel.setBorder(new LineBorder(new Color(255, nmsl, 0), 4));
					this.sleep(10);
				}
				for (nmsl = 255; nmsl > 0; nmsl--) {
					panel.setBorder(new LineBorder(new Color(nmsl, 255, 255), 4));
					this.sleep(10);
				}
				for (nmsl = 0; nmsl < 255; nmsl++) {
					panel.setBorder(new LineBorder(new Color(0, 255, nmsl), 4));
					this.sleep(10);
				}
				for (nmsl = 255; nmsl > 0; nmsl--) {
					panel.setBorder(new LineBorder(new Color(0, nmsl, 255), 4));
					this.sleep(10);
				}
				for (nmsl = 0; nmsl < 255; nmsl++) {
					panel.setBorder(new LineBorder(new Color(nmsl, 0, 255), 4));
					this.sleep(10);
				}
				for (nmsl = 255; nmsl > 0; nmsl--) {
					panel.setBorder(new LineBorder(new Color(255, 0, nmsl), 4));
					this.sleep(10);
				}
			}
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
