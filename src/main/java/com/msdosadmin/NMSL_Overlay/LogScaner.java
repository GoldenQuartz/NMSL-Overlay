package com.msdosadmin.NMSL_Overlay;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.input.ReversedLinesFileReader;

public class LogScaner extends Thread {
	private String lastLine = "";
	private String llastLine = "";

	public LogScaner() {

	}

	@Override
	public void run() {
		while (true) {
			try {
				for (int i = 0; i < 36; i++) {// 36 除了6 还是6
					ReversedLinesFileReader reversedLinesReader = new ReversedLinesFileReader(new File(NMSL.loglocate), Charset.defaultCharset());
					String alastLine = reversedLinesReader.readLine();
					// System.out.println(alastLine);
					if (alastLine.indexOf("[CHAT] ONLINE:") > -1) {
						// System.out.println(alastLine);
						lastLine = alastLine.replace(alastLine.substring(0, alastLine.indexOf("[CHAT] ONLINE:")), "");
						// System.out.println(lastLine);
						if (lastLine.indexOf("[CHAT] ONLINE:") > -1 && !llastLine.equals(lastLine)) {
							llastLine = lastLine;
							String ava = lastLine.replace(" ", "").replace("[CHAT]ONLINE:", "");
							List<String> cnm = new ArrayList<>();
							cnm = Arrays.asList(ava.split(","));
							if (cnm.indexOf(NMSL.username) > -1) {
								Collections.swap(cnm, cnm.indexOf(NMSL.username), 0);
							}
							NMSL.max = cnm.size();
							System.out.println("玩家列表 - " + cnm);
							Tools.clearList(false);
							NMSL.getprog.setMaximum(NMSL.max);
							NMSL.min = 0;
							NMSL.getprog.setValue(NMSL.min);
							NMSL.prognum.setText(NMSL.min + "/" + NMSL.max);
							NMSL.frame.repaint();
							for (int kao = 0; kao < cnm.size(); kao++) {
								String qnm = cnm.get(kao);
								System.out.println((kao + 1) + " - " + qnm);
								if (kao == 0) {
									NMSL.name_1.setText(qnm);
								} else if (kao == 1) {
									NMSL.name_2.setText(qnm);
								} else if (kao == 2) {
									NMSL.name_3.setText(qnm);
								} else if (kao == 3) {
									NMSL.name_4.setText(qnm);
								} else if (kao == 4) {
									NMSL.name_5.setText(qnm);
								} else if (kao == 5) {
									NMSL.name_6.setText(qnm);
								} else if (kao == 6) {
									NMSL.name_7.setText(qnm);
								} else if (kao == 7) {
									NMSL.name_8.setText(qnm);
								} else if (kao == 8) {
									NMSL.name_9.setText(qnm);
								} else if (kao == 9) {
									NMSL.name_10.setText(qnm);
								} else if (kao == 10) {
									NMSL.name_11.setText(qnm);
								} else if (kao == 11) {
									NMSL.name_12.setText(qnm);
								} else if (kao == 12) {
									NMSL.name_13.setText(qnm);
								} else if (kao == 13) {
									NMSL.name_14.setText(qnm);
								} else if (kao == 14) {
									NMSL.name_15.setText(qnm);
								} else if (kao == 15) {
									NMSL.name_16.setText(qnm);
								}
								AddPlayer s = new AddPlayer(qnm, true);
								s.start();
								this.sleep(40);
							}
							break;
						}
					}
				}
				this.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
