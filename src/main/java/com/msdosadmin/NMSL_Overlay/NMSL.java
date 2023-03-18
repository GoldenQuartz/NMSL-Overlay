package com.msdosadmin.NMSL_Overlay;

import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dialog.ModalExclusionType;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class NMSL {
	// 这里没有注释 有注释的全是我去某某论坛Ctrl+C的

	public static JFrame frame;
	public JLabel logo = new JLabel(new ImageIcon(NMSL.class.getResource("/resourse/NMSL_small.png")));
	public static JPanel panel;
	public static int mouseAtX;
	public static int mouseAtY;
	private int sb = 0;
	private JLabel lblNewLabel_2;
	private JPasswordField keyinput;
	public JPanel lists;
	public JPanel hypixelAPI;
	public static JProgressBar getprog;
	public static JLabel prognum;
	public static Panel panel_2;

	public static int oobe = 0;
	private JTextField idinput;
	private JTextField clientinput;
	public static JPanel setting;
	public static String username;
	public static String loglocate;
	public static String key;
	public static JPanel panel_1;
	public static HashMap componentMap;

	public static int max;
	public static int min;

	public static JLabel tag1_1;
	public static JLabel tag2_1;
	public static JLabel name_1;
	public static JLabel lv_1;
	public static JLabel fkdr_1;
	public static JLabel fk_1;
	public static JLabel wlr_1;
	public static JLabel win_1;
	public static JLabel bblr_1;
	public static JLabel bb_1;
	public static JLabel bl_1;
	public static JLabel tag1_2;
	public static JLabel tag2_2;
	public static JLabel name_2;
	public static JLabel lv_2;
	public static JLabel fkdr_2;
	public static JLabel fk_2;
	public static JLabel wlr_2;
	public static JLabel win_2;
	public static JLabel bblr_2;
	public static JLabel bb_2;
	public static JLabel bl_2;
	public static JLabel tag1_3;
	public static JLabel tag2_3;
	public static JLabel name_3;
	public static JLabel lv_3;
	public static JLabel fkdr_3;
	public static JLabel fk_3;
	public static JLabel wlr_3;
	public static JLabel win_3;
	public static JLabel bblr_3;
	public static JLabel bb_3;
	public static JLabel bl_3;
	public static JLabel tag1_4;
	public static JLabel tag2_4;
	public static JLabel name_4;
	public static JLabel lv_4;
	public static JLabel fkdr_4;
	public static JLabel fk_4;
	public static JLabel wlr_4;
	public static JLabel win_4;
	public static JLabel bblr_4;
	public static JLabel bb_4;
	public static JLabel bl_4;
	public static JLabel tag1_5;
	public static JLabel tag2_5;
	public static JLabel name_5;
	public static JLabel lv_5;
	public static JLabel fkdr_5;
	public static JLabel fk_5;
	public static JLabel wlr_5;
	public static JLabel win_5;
	public static JLabel bblr_5;
	public static JLabel bb_5;
	public static JLabel bl_5;
	public static JLabel tag1_6;
	public static JLabel tag2_6;
	public static JLabel name_6;
	public static JLabel lv_6;
	public static JLabel fkdr_6;
	public static JLabel fk_6;
	public static JLabel wlr_6;
	public static JLabel win_6;
	public static JLabel bblr_6;
	public static JLabel bb_6;
	public static JLabel bl_6;
	public static JLabel tag1_7;
	public static JLabel tag2_7;
	public static JLabel name_7;
	public static JLabel lv_7;
	public static JLabel fkdr_7;
	public static JLabel fk_7;
	public static JLabel wlr_7;
	public static JLabel win_7;
	public static JLabel bblr_7;
	public static JLabel bb_7;
	public static JLabel bl_7;
	public static JLabel tag1_8;
	public static JLabel tag2_8;
	public static JLabel name_8;
	public static JLabel lv_8;
	public static JLabel fkdr_8;
	public static JLabel fk_8;
	public static JLabel wlr_8;
	public static JLabel win_8;
	public static JLabel bblr_8;
	public static JLabel bb_8;
	public static JLabel bl_8;
	public static JLabel tag1_9;
	public static JLabel tag2_9;
	public static JLabel name_9;
	public static JLabel lv_9;
	public static JLabel fkdr_9;
	public static JLabel fk_9;
	public static JLabel wlr_9;
	public static JLabel win_9;
	public static JLabel bblr_9;
	public static JLabel bb_9;
	public static JLabel bl_9;
	public static JLabel tag1_10;
	public static JLabel tag2_10;
	public static JLabel name_10;
	public static JLabel lv_10;
	public static JLabel fkdr_10;
	public static JLabel fk_10;
	public static JLabel wlr_10;
	public static JLabel win_10;
	public static JLabel bblr_10;
	public static JLabel bb_10;
	public static JLabel bl_10;
	public static JLabel tag1_11;
	public static JLabel tag2_11;
	public static JLabel name_11;
	public static JLabel lv_11;
	public static JLabel fkdr_11;
	public static JLabel fk_11;
	public static JLabel wlr_11;
	public static JLabel win_11;
	public static JLabel bblr_11;
	public static JLabel bb_11;
	public static JLabel bl_11;
	public static JLabel tag1_12;
	public static JLabel tag2_12;
	public static JLabel name_12;
	public static JLabel lv_12;
	public static JLabel fkdr_12;
	public static JLabel fk_12;
	public static JLabel wlr_12;
	public static JLabel win_12;
	public static JLabel bblr_12;
	public static JLabel bb_12;
	public static JLabel bl_12;
	public static JLabel tag1_13;
	public static JLabel tag2_13;
	public static JLabel name_13;
	public static JLabel lv_13;
	public static JLabel fkdr_13;
	public static JLabel fk_13;
	public static JLabel wlr_13;
	public static JLabel win_13;
	public static JLabel bblr_13;
	public static JLabel bb_13;
	public static JLabel bl_13;
	public static JLabel tag1_14;
	public static JLabel tag2_14;
	public static JLabel name_14;
	public static JLabel lv_14;
	public static JLabel fkdr_14;
	public static JLabel fk_14;
	public static JLabel wlr_14;
	public static JLabel win_14;
	public static JLabel bblr_14;
	public static JLabel bb_14;
	public static JLabel bl_14;
	public static JLabel tag1_15;
	public static JLabel tag2_15;
	public static JLabel name_15;
	public static JLabel lv_15;
	public static JLabel fkdr_15;
	public static JLabel fk_15;
	public static JLabel wlr_15;
	public static JLabel win_15;
	public static JLabel bblr_15;
	public static JLabel bb_15;
	public static JLabel bl_15;
	public static JLabel tag1_16;
	public static JLabel tag2_16;
	public static JLabel name_16;
	public static JLabel lv_16;
	public static JLabel fkdr_16;
	public static JLabel fk_16;
	public static JLabel wlr_16;
	public static JLabel win_16;
	public static JLabel bblr_16;
	public static JLabel bb_16;
	public static JLabel bl_16;
	public static JLabel PS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					NMSL window = new NMSL();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws IOException
	 */
	public NMSL() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws IOException
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		frame.setBounds(100, 100, 785, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true); // 窗口去边框
		frame.setAlwaysOnTop(true); // 设置窗口总在最前
		frame.setBackground(new Color(0, 0, 0, 0));
		frame.getContentPane().setLayout(null);
		JLabel cnm = logo;
		logo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sb++;
				logo.setToolTipText("" + sb);
				if (sb == 114) {
					JOptionPane.showMessageDialog(null, "点什么呢 logo就是logo 你甜蜜的已经点了114下了 NMSL!", "NMSL", JOptionPane.ERROR_MESSAGE);
				} else if (sb > 114) {
					JOptionPane.showMessageDialog(null, "NMSL你有完没完！[doge]", "NMSL!!!!!!", JOptionPane.ERROR_MESSAGE);
					logo.setToolTipText("LOGO已经被你点费力（悲");
				}
			}
		});
		logo.setToolTipText("NMSL overlay LOGO awa");
		cnm.setBounds(21, 23, 133, 38);
		frame.getContentPane().add(cnm);

		JLabel lblNewLabel = new JLabel("Overlay");
		lblNewLabel.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		lblNewLabel.setForeground(new Color(102, 0, 204));
		lblNewLabel.setBounds(155, 28, 110, 38);
		frame.getContentPane().add(lblNewLabel);

		lists = new JPanel();
		lists.setBounds(15, 68, 755, 425);
		frame.getContentPane().add(lists);
		lists.setBackground(new Color(151, 151, 151, 120));
		lists.setLayout(null);

		getprog = new JProgressBar();
		getprog.setToolTipText("进度条，会显示当前任务的进度");
		getprog.setBounds(0, 398, 677, 27);
		getprog.setForeground(new Color(127, 255, 0, 189));
		lists.add(getprog);
		getprog.setBorder(new LineBorder(new Color(65, 62, 67), 2));
		getprog.setBackground(new Color(0, 0, 0, 1));
		getprog.setMaximum(0);
		getprog.setMinimum(0);
		getprog.setMaximum(1);
		getprog.setMinimum(0);

		panel_1 = new JPanel();
		panel_1.setForeground(new Color(51, 102, 153));
		panel_1.setBounds(0, 27, 755, 401);
		panel_1.setBackground(new Color(151, 151, 151, 3));
		lists.add(panel_1);
		panel_1.setLayout(null);

		tag1_1 = new JLabel("T");
		tag1_1.setFont(new Font("等线", Font.BOLD, 15));
		tag1_1.setForeground(Color.WHITE);
		tag1_1.setBounds(44, 10, 20, 20);
		panel_1.add(tag1_1);

		tag2_1 = new JLabel("T");
		tag2_1.setFont(new Font("等线", Font.BOLD, 15));
		tag2_1.setForeground(Color.WHITE);
		tag2_1.setBounds(20, 10, 20, 20);
		panel_1.add(tag2_1);

		lv_1 = new JLabel("T");
		lv_1.setFont(new Font("等线", Font.BOLD, 15));
		lv_1.setForeground(Color.WHITE);
		lv_1.setBounds(111, 10, 48, 20);
		panel_1.add(lv_1);

		name_1 = new JLabel("T");
		name_1.setFont(new Font("等线", Font.BOLD, 15));
		name_1.setForeground(Color.WHITE);
		name_1.setBounds(163, 10, 119, 20);
		panel_1.add(name_1);

		fkdr_1 = new JLabel("T");
		fkdr_1.setFont(new Font("等线", Font.BOLD, 15));
		fkdr_1.setForeground(Color.WHITE);
		fkdr_1.setBounds(281, 10, 53, 20);
		panel_1.add(fkdr_1);

		fk_1 = new JLabel("T");
		fk_1.setFont(new Font("等线", Font.BOLD, 15));
		fk_1.setForeground(Color.WHITE);
		fk_1.setBounds(345, 10, 48, 20);
		panel_1.add(fk_1);

		wlr_1 = new JLabel("T");
		wlr_1.setFont(new Font("等线", Font.BOLD, 15));
		wlr_1.setForeground(Color.WHITE);
		wlr_1.setBounds(402, 10, 48, 20);
		panel_1.add(wlr_1);

		win_1 = new JLabel("T");
		win_1.setFont(new Font("等线", Font.BOLD, 15));
		win_1.setForeground(Color.WHITE);
		win_1.setBounds(460, 10, 48, 20);
		panel_1.add(win_1);

		bblr_1 = new JLabel("T");
		bblr_1.setFont(new Font("等线", Font.BOLD, 15));
		bblr_1.setForeground(Color.WHITE);
		bblr_1.setBounds(514, 10, 48, 20);
		panel_1.add(bblr_1);

		bb_1 = new JLabel("T");
		bb_1.setFont(new Font("等线", Font.BOLD, 15));
		bb_1.setForeground(Color.WHITE);
		bb_1.setBounds(572, 10, 77, 20);
		panel_1.add(bb_1);

		bl_1 = new JLabel("T");
		bl_1.setFont(new Font("等线", Font.BOLD, 15));
		bl_1.setForeground(Color.WHITE);
		bl_1.setBounds(657, 10, 77, 20);
		panel_1.add(bl_1);

		tag1_2 = new JLabel("T");
		tag1_2.setFont(new Font("等线", Font.BOLD, 15));
		tag1_2.setForeground(Color.WHITE);
		tag1_2.setBounds(43, 27, 20, 20);
		panel_1.add(tag1_2);

		tag2_2 = new JLabel("T");
		tag2_2.setFont(new Font("等线", Font.BOLD, 15));
		tag2_2.setForeground(Color.WHITE);
		tag2_2.setBounds(19, 27, 20, 20);
		panel_1.add(tag2_2);

		lv_2 = new JLabel("T");
		lv_2.setFont(new Font("等线", Font.BOLD, 15));
		lv_2.setForeground(Color.WHITE);
		lv_2.setBounds(110, 27, 48, 20);
		panel_1.add(lv_2);

		name_2 = new JLabel("T");
		name_2.setFont(new Font("等线", Font.BOLD, 15));
		name_2.setForeground(Color.WHITE);
		name_2.setBounds(162, 27, 119, 20);
		panel_1.add(name_2);

		fkdr_2 = new JLabel("T");
		fkdr_2.setFont(new Font("等线", Font.BOLD, 15));
		fkdr_2.setForeground(Color.WHITE);
		fkdr_2.setBounds(280, 27, 53, 20);
		panel_1.add(fkdr_2);

		fk_2 = new JLabel("T");
		fk_2.setFont(new Font("等线", Font.BOLD, 15));
		fk_2.setForeground(Color.WHITE);
		fk_2.setBounds(344, 27, 48, 20);
		panel_1.add(fk_2);

		wlr_2 = new JLabel("T");
		wlr_2.setFont(new Font("等线", Font.BOLD, 15));
		wlr_2.setForeground(Color.WHITE);
		wlr_2.setBounds(401, 27, 48, 20);
		panel_1.add(wlr_2);

		win_2 = new JLabel("T");
		win_2.setFont(new Font("等线", Font.BOLD, 15));
		win_2.setForeground(Color.WHITE);
		win_2.setBounds(459, 27, 48, 20);
		panel_1.add(win_2);

		bblr_2 = new JLabel("T");
		bblr_2.setFont(new Font("等线", Font.BOLD, 15));
		bblr_2.setForeground(Color.WHITE);
		bblr_2.setBounds(513, 27, 48, 20);
		panel_1.add(bblr_2);

		bb_2 = new JLabel("T");
		bb_2.setFont(new Font("等线", Font.BOLD, 15));
		bb_2.setForeground(Color.WHITE);
		bb_2.setBounds(571, 27, 77, 20);
		panel_1.add(bb_2);

		bl_2 = new JLabel("T");
		bl_2.setFont(new Font("等线", Font.BOLD, 15));
		bl_2.setForeground(Color.WHITE);
		bl_2.setBounds(656, 27, 77, 20);
		panel_1.add(bl_2);

		tag1_3 = new JLabel("T");
		tag1_3.setFont(new Font("等线", Font.BOLD, 15));
		tag1_3.setForeground(Color.WHITE);
		tag1_3.setBounds(43, 44, 20, 20);
		panel_1.add(tag1_3);

		tag2_3 = new JLabel("T");
		tag2_3.setFont(new Font("等线", Font.BOLD, 15));
		tag2_3.setForeground(Color.WHITE);
		tag2_3.setBounds(19, 44, 20, 20);
		panel_1.add(tag2_3);

		lv_3 = new JLabel("T");
		lv_3.setFont(new Font("等线", Font.BOLD, 15));
		lv_3.setForeground(Color.WHITE);
		lv_3.setBounds(110, 44, 48, 20);
		panel_1.add(lv_3);

		name_3 = new JLabel("T");
		name_3.setFont(new Font("等线", Font.BOLD, 15));
		name_3.setForeground(Color.WHITE);
		name_3.setBounds(162, 44, 119, 20);
		panel_1.add(name_3);

		fkdr_3 = new JLabel("T");
		fkdr_3.setFont(new Font("等线", Font.BOLD, 15));
		fkdr_3.setForeground(Color.WHITE);
		fkdr_3.setBounds(280, 44, 53, 20);
		panel_1.add(fkdr_3);

		fk_3 = new JLabel("T");
		fk_3.setFont(new Font("等线", Font.BOLD, 15));
		fk_3.setForeground(Color.WHITE);
		fk_3.setBounds(344, 44, 48, 20);
		panel_1.add(fk_3);

		wlr_3 = new JLabel("T");
		wlr_3.setFont(new Font("等线", Font.BOLD, 15));
		wlr_3.setForeground(Color.WHITE);
		wlr_3.setBounds(401, 44, 48, 20);
		panel_1.add(wlr_3);

		win_3 = new JLabel("T");
		win_3.setFont(new Font("等线", Font.BOLD, 15));
		win_3.setForeground(Color.WHITE);
		win_3.setBounds(459, 44, 48, 20);
		panel_1.add(win_3);

		bblr_3 = new JLabel("T");
		bblr_3.setFont(new Font("等线", Font.BOLD, 15));
		bblr_3.setForeground(Color.WHITE);
		bblr_3.setBounds(513, 44, 48, 20);
		panel_1.add(bblr_3);

		bb_3 = new JLabel("T");
		bb_3.setFont(new Font("等线", Font.BOLD, 15));
		bb_3.setForeground(Color.WHITE);
		bb_3.setBounds(571, 44, 77, 20);
		panel_1.add(bb_3);

		bl_3 = new JLabel("T");
		bl_3.setFont(new Font("等线", Font.BOLD, 15));
		bl_3.setForeground(Color.WHITE);
		bl_3.setBounds(656, 44, 77, 20);
		panel_1.add(bl_3);

		tag1_4 = new JLabel("T");
		tag1_4.setFont(new Font("等线", Font.BOLD, 15));
		tag1_4.setForeground(Color.WHITE);
		tag1_4.setBounds(43, 61, 20, 20);
		panel_1.add(tag1_4);

		tag2_4 = new JLabel("T");
		tag2_4.setFont(new Font("等线", Font.BOLD, 15));
		tag2_4.setForeground(Color.WHITE);
		tag2_4.setBounds(19, 61, 20, 20);
		panel_1.add(tag2_4);

		lv_4 = new JLabel("T");
		lv_4.setFont(new Font("等线", Font.BOLD, 15));
		lv_4.setForeground(Color.WHITE);
		lv_4.setBounds(110, 61, 48, 20);
		panel_1.add(lv_4);

		name_4 = new JLabel("T");
		name_4.setFont(new Font("等线", Font.BOLD, 15));
		name_4.setForeground(Color.WHITE);
		name_4.setBounds(162, 61, 119, 20);
		panel_1.add(name_4);

		fkdr_4 = new JLabel("T");
		fkdr_4.setFont(new Font("等线", Font.BOLD, 15));
		fkdr_4.setForeground(Color.WHITE);
		fkdr_4.setBounds(280, 61, 53, 20);
		panel_1.add(fkdr_4);

		fk_4 = new JLabel("T");
		fk_4.setFont(new Font("等线", Font.BOLD, 15));
		fk_4.setForeground(Color.WHITE);
		fk_4.setBounds(344, 61, 48, 20);
		panel_1.add(fk_4);

		wlr_4 = new JLabel("T");
		wlr_4.setFont(new Font("等线", Font.BOLD, 15));
		wlr_4.setForeground(Color.WHITE);
		wlr_4.setBounds(401, 61, 48, 20);
		panel_1.add(wlr_4);

		win_4 = new JLabel("T");
		win_4.setFont(new Font("等线", Font.BOLD, 15));
		win_4.setForeground(Color.WHITE);
		win_4.setBounds(459, 61, 48, 20);
		panel_1.add(win_4);

		bblr_4 = new JLabel("T");
		bblr_4.setFont(new Font("等线", Font.BOLD, 15));
		bblr_4.setForeground(Color.WHITE);
		bblr_4.setBounds(513, 61, 48, 20);
		panel_1.add(bblr_4);

		bb_4 = new JLabel("T");
		bb_4.setFont(new Font("等线", Font.BOLD, 15));
		bb_4.setForeground(Color.WHITE);
		bb_4.setBounds(571, 61, 77, 20);
		panel_1.add(bb_4);

		bl_4 = new JLabel("T");
		bl_4.setFont(new Font("等线", Font.BOLD, 15));
		bl_4.setForeground(Color.WHITE);
		bl_4.setBounds(656, 61, 77, 20);
		panel_1.add(bl_4);

		tag1_5 = new JLabel("T");
		tag1_5.setFont(new Font("等线", Font.BOLD, 15));
		tag1_5.setForeground(Color.WHITE);
		tag1_5.setBounds(43, 78, 20, 20);
		panel_1.add(tag1_5);

		tag2_5 = new JLabel("T");
		tag2_5.setFont(new Font("等线", Font.BOLD, 15));
		tag2_5.setForeground(Color.WHITE);
		tag2_5.setBounds(19, 78, 20, 20);
		panel_1.add(tag2_5);

		lv_5 = new JLabel("T");
		lv_5.setFont(new Font("等线", Font.BOLD, 15));
		lv_5.setForeground(Color.WHITE);
		lv_5.setBounds(110, 78, 48, 20);
		panel_1.add(lv_5);

		name_5 = new JLabel("T");
		name_5.setFont(new Font("等线", Font.BOLD, 15));
		name_5.setForeground(Color.WHITE);
		name_5.setBounds(162, 78, 119, 20);
		panel_1.add(name_5);

		fkdr_5 = new JLabel("T");
		fkdr_5.setFont(new Font("等线", Font.BOLD, 15));
		fkdr_5.setForeground(Color.WHITE);
		fkdr_5.setBounds(280, 78, 53, 20);
		panel_1.add(fkdr_5);

		fk_5 = new JLabel("T");
		fk_5.setFont(new Font("等线", Font.BOLD, 15));
		fk_5.setForeground(Color.WHITE);
		fk_5.setBounds(344, 78, 48, 20);
		panel_1.add(fk_5);

		wlr_5 = new JLabel("T");
		wlr_5.setFont(new Font("等线", Font.BOLD, 15));
		wlr_5.setForeground(Color.WHITE);
		wlr_5.setBounds(401, 78, 48, 20);
		panel_1.add(wlr_5);

		win_5 = new JLabel("T");
		win_5.setFont(new Font("等线", Font.BOLD, 15));
		win_5.setForeground(Color.WHITE);
		win_5.setBounds(459, 78, 48, 20);
		panel_1.add(win_5);

		bblr_5 = new JLabel("T");
		bblr_5.setFont(new Font("等线", Font.BOLD, 15));
		bblr_5.setForeground(Color.WHITE);
		bblr_5.setBounds(513, 78, 48, 20);
		panel_1.add(bblr_5);

		bb_5 = new JLabel("T");
		bb_5.setFont(new Font("等线", Font.BOLD, 15));
		bb_5.setForeground(Color.WHITE);
		bb_5.setBounds(571, 78, 77, 20);
		panel_1.add(bb_5);

		bl_5 = new JLabel("T");
		bl_5.setFont(new Font("等线", Font.BOLD, 15));
		bl_5.setForeground(Color.WHITE);
		bl_5.setBounds(656, 78, 77, 20);
		panel_1.add(bl_5);

		tag1_6 = new JLabel("T");
		tag1_6.setFont(new Font("等线", Font.BOLD, 15));
		tag1_6.setForeground(Color.WHITE);
		tag1_6.setBounds(43, 96, 20, 20);
		panel_1.add(tag1_6);

		tag2_6 = new JLabel("T");
		tag2_6.setFont(new Font("等线", Font.BOLD, 15));
		tag2_6.setForeground(Color.WHITE);
		tag2_6.setBounds(19, 96, 20, 20);
		panel_1.add(tag2_6);

		lv_6 = new JLabel("T");
		lv_6.setFont(new Font("等线", Font.BOLD, 15));
		lv_6.setForeground(Color.WHITE);
		lv_6.setBounds(110, 96, 48, 20);
		panel_1.add(lv_6);

		name_6 = new JLabel("T");
		name_6.setFont(new Font("等线", Font.BOLD, 15));
		name_6.setForeground(Color.WHITE);
		name_6.setBounds(162, 96, 119, 20);
		panel_1.add(name_6);

		fkdr_6 = new JLabel("T");
		fkdr_6.setFont(new Font("等线", Font.BOLD, 15));
		fkdr_6.setForeground(Color.WHITE);
		fkdr_6.setBounds(280, 96, 53, 20);
		panel_1.add(fkdr_6);

		fk_6 = new JLabel("T");
		fk_6.setFont(new Font("等线", Font.BOLD, 15));
		fk_6.setForeground(Color.WHITE);
		fk_6.setBounds(344, 96, 48, 20);
		panel_1.add(fk_6);

		wlr_6 = new JLabel("T");
		wlr_6.setFont(new Font("等线", Font.BOLD, 15));
		wlr_6.setForeground(Color.WHITE);
		wlr_6.setBounds(401, 96, 48, 20);
		panel_1.add(wlr_6);

		win_6 = new JLabel("T");
		win_6.setFont(new Font("等线", Font.BOLD, 15));
		win_6.setForeground(Color.WHITE);
		win_6.setBounds(459, 96, 48, 20);
		panel_1.add(win_6);

		bblr_6 = new JLabel("T");
		bblr_6.setFont(new Font("等线", Font.BOLD, 15));
		bblr_6.setForeground(Color.WHITE);
		bblr_6.setBounds(513, 96, 48, 20);
		panel_1.add(bblr_6);

		bb_6 = new JLabel("T");
		bb_6.setFont(new Font("等线", Font.BOLD, 15));
		bb_6.setForeground(Color.WHITE);
		bb_6.setBounds(571, 96, 77, 20);
		panel_1.add(bb_6);

		bl_6 = new JLabel("T");
		bl_6.setFont(new Font("等线", Font.BOLD, 15));
		bl_6.setForeground(Color.WHITE);
		bl_6.setBounds(656, 96, 77, 20);
		panel_1.add(bl_6);

		tag1_7 = new JLabel("T");
		tag1_7.setFont(new Font("等线", Font.BOLD, 15));
		tag1_7.setForeground(Color.WHITE);
		tag1_7.setBounds(43, 114, 20, 20);
		panel_1.add(tag1_7);

		tag2_7 = new JLabel("T");
		tag2_7.setFont(new Font("等线", Font.BOLD, 15));
		tag2_7.setForeground(Color.WHITE);
		tag2_7.setBounds(19, 114, 20, 20);
		panel_1.add(tag2_7);

		lv_7 = new JLabel("T");
		lv_7.setFont(new Font("等线", Font.BOLD, 15));
		lv_7.setForeground(Color.WHITE);
		lv_7.setBounds(110, 114, 48, 20);
		panel_1.add(lv_7);

		name_7 = new JLabel("T");
		name_7.setFont(new Font("等线", Font.BOLD, 15));
		name_7.setForeground(Color.WHITE);
		name_7.setBounds(162, 114, 119, 20);
		panel_1.add(name_7);

		fkdr_7 = new JLabel("T");
		fkdr_7.setFont(new Font("等线", Font.BOLD, 15));
		fkdr_7.setForeground(Color.WHITE);
		fkdr_7.setBounds(280, 114, 53, 20);
		panel_1.add(fkdr_7);

		fk_7 = new JLabel("T");
		fk_7.setFont(new Font("等线", Font.BOLD, 15));
		fk_7.setForeground(Color.WHITE);
		fk_7.setBounds(344, 114, 48, 20);
		panel_1.add(fk_7);

		wlr_7 = new JLabel("T");
		wlr_7.setFont(new Font("等线", Font.BOLD, 15));
		wlr_7.setForeground(Color.WHITE);
		wlr_7.setBounds(401, 114, 48, 20);
		panel_1.add(wlr_7);

		win_7 = new JLabel("T");
		win_7.setFont(new Font("等线", Font.BOLD, 15));
		win_7.setForeground(Color.WHITE);
		win_7.setBounds(459, 114, 48, 20);
		panel_1.add(win_7);

		bblr_7 = new JLabel("T");
		bblr_7.setFont(new Font("等线", Font.BOLD, 15));
		bblr_7.setForeground(Color.WHITE);
		bblr_7.setBounds(513, 114, 48, 20);
		panel_1.add(bblr_7);

		bb_7 = new JLabel("T");
		bb_7.setFont(new Font("等线", Font.BOLD, 15));
		bb_7.setForeground(Color.WHITE);
		bb_7.setBounds(571, 114, 77, 20);
		panel_1.add(bb_7);

		bl_7 = new JLabel("T");
		bl_7.setFont(new Font("等线", Font.BOLD, 15));
		bl_7.setForeground(Color.WHITE);
		bl_7.setBounds(656, 114, 77, 20);
		panel_1.add(bl_7);

		tag1_8 = new JLabel("T");
		tag1_8.setFont(new Font("等线", Font.BOLD, 15));
		tag1_8.setForeground(Color.WHITE);
		tag1_8.setBounds(43, 131, 20, 20);
		panel_1.add(tag1_8);

		tag2_8 = new JLabel("T");
		tag2_8.setFont(new Font("等线", Font.BOLD, 15));
		tag2_8.setForeground(Color.WHITE);
		tag2_8.setBounds(19, 131, 20, 20);
		panel_1.add(tag2_8);

		lv_8 = new JLabel("T");
		lv_8.setFont(new Font("等线", Font.BOLD, 15));
		lv_8.setForeground(Color.WHITE);
		lv_8.setBounds(110, 131, 48, 20);
		panel_1.add(lv_8);

		name_8 = new JLabel("T");
		name_8.setFont(new Font("等线", Font.BOLD, 15));
		name_8.setForeground(Color.WHITE);
		name_8.setBounds(162, 131, 119, 20);
		panel_1.add(name_8);

		fkdr_8 = new JLabel("T");
		fkdr_8.setFont(new Font("等线", Font.BOLD, 15));
		fkdr_8.setForeground(Color.WHITE);
		fkdr_8.setBounds(280, 131, 53, 20);
		panel_1.add(fkdr_8);

		fk_8 = new JLabel("T");
		fk_8.setFont(new Font("等线", Font.BOLD, 15));
		fk_8.setForeground(Color.WHITE);
		fk_8.setBounds(344, 131, 48, 20);
		panel_1.add(fk_8);

		wlr_8 = new JLabel("T");
		wlr_8.setFont(new Font("等线", Font.BOLD, 15));
		wlr_8.setForeground(Color.WHITE);
		wlr_8.setBounds(401, 131, 48, 20);
		panel_1.add(wlr_8);

		win_8 = new JLabel("T");
		win_8.setFont(new Font("等线", Font.BOLD, 15));
		win_8.setForeground(Color.WHITE);
		win_8.setBounds(459, 131, 48, 20);
		panel_1.add(win_8);

		bblr_8 = new JLabel("T");
		bblr_8.setFont(new Font("等线", Font.BOLD, 15));
		bblr_8.setForeground(Color.WHITE);
		bblr_8.setBounds(513, 131, 48, 20);
		panel_1.add(bblr_8);

		bb_8 = new JLabel("T");
		bb_8.setFont(new Font("等线", Font.BOLD, 15));
		bb_8.setForeground(Color.WHITE);
		bb_8.setBounds(571, 131, 77, 20);
		panel_1.add(bb_8);

		bl_8 = new JLabel("T");
		bl_8.setFont(new Font("等线", Font.BOLD, 15));
		bl_8.setForeground(Color.WHITE);
		bl_8.setBounds(656, 131, 77, 20);
		panel_1.add(bl_8);

		tag1_9 = new JLabel("T");
		tag1_9.setFont(new Font("等线", Font.BOLD, 15));
		tag1_9.setForeground(Color.WHITE);
		tag1_9.setBounds(43, 148, 20, 20);
		panel_1.add(tag1_9);

		tag2_9 = new JLabel("T");
		tag2_9.setFont(new Font("等线", Font.BOLD, 15));
		tag2_9.setForeground(Color.WHITE);
		tag2_9.setBounds(19, 148, 20, 20);
		panel_1.add(tag2_9);

		lv_9 = new JLabel("T");
		lv_9.setFont(new Font("等线", Font.BOLD, 15));
		lv_9.setForeground(Color.WHITE);
		lv_9.setBounds(110, 148, 48, 20);
		panel_1.add(lv_9);

		name_9 = new JLabel("T");
		name_9.setFont(new Font("等线", Font.BOLD, 15));
		name_9.setForeground(Color.WHITE);
		name_9.setBounds(162, 148, 119, 20);
		panel_1.add(name_9);

		fkdr_9 = new JLabel("T");
		fkdr_9.setFont(new Font("等线", Font.BOLD, 15));
		fkdr_9.setForeground(Color.WHITE);
		fkdr_9.setBounds(280, 148, 53, 20);
		panel_1.add(fkdr_9);

		fk_9 = new JLabel("T");
		fk_9.setFont(new Font("等线", Font.BOLD, 15));
		fk_9.setForeground(Color.WHITE);
		fk_9.setBounds(344, 148, 48, 20);
		panel_1.add(fk_9);

		wlr_9 = new JLabel("T");
		wlr_9.setFont(new Font("等线", Font.BOLD, 15));
		wlr_9.setForeground(Color.WHITE);
		wlr_9.setBounds(401, 148, 48, 20);
		panel_1.add(wlr_9);

		win_9 = new JLabel("T");
		win_9.setFont(new Font("等线", Font.BOLD, 15));
		win_9.setForeground(Color.WHITE);
		win_9.setBounds(459, 148, 48, 20);
		panel_1.add(win_9);

		bblr_9 = new JLabel("T");
		bblr_9.setFont(new Font("等线", Font.BOLD, 15));
		bblr_9.setForeground(Color.WHITE);
		bblr_9.setBounds(513, 148, 48, 20);
		panel_1.add(bblr_9);

		bb_9 = new JLabel("T");
		bb_9.setFont(new Font("等线", Font.BOLD, 15));
		bb_9.setForeground(Color.WHITE);
		bb_9.setBounds(571, 148, 77, 20);
		panel_1.add(bb_9);

		bl_9 = new JLabel("T");
		bl_9.setFont(new Font("等线", Font.BOLD, 15));
		bl_9.setForeground(Color.WHITE);
		bl_9.setBounds(656, 148, 77, 20);
		panel_1.add(bl_9);

		tag1_10 = new JLabel("T");
		tag1_10.setFont(new Font("等线", Font.BOLD, 15));
		tag1_10.setForeground(Color.WHITE);
		tag1_10.setBounds(43, 166, 20, 20);
		panel_1.add(tag1_10);

		tag2_10 = new JLabel("T");
		tag2_10.setFont(new Font("等线", Font.BOLD, 15));
		tag2_10.setForeground(Color.WHITE);
		tag2_10.setBounds(19, 166, 20, 20);
		panel_1.add(tag2_10);

		lv_10 = new JLabel("T");
		lv_10.setFont(new Font("等线", Font.BOLD, 15));
		lv_10.setForeground(Color.WHITE);
		lv_10.setBounds(110, 166, 48, 20);
		panel_1.add(lv_10);

		name_10 = new JLabel("T");
		name_10.setFont(new Font("等线", Font.BOLD, 15));
		name_10.setForeground(Color.WHITE);
		name_10.setBounds(162, 166, 119, 20);
		panel_1.add(name_10);

		fkdr_10 = new JLabel("T");
		fkdr_10.setFont(new Font("等线", Font.BOLD, 15));
		fkdr_10.setForeground(Color.WHITE);
		fkdr_10.setBounds(280, 166, 53, 20);
		panel_1.add(fkdr_10);

		fk_10 = new JLabel("T");
		fk_10.setFont(new Font("等线", Font.BOLD, 15));
		fk_10.setForeground(Color.WHITE);
		fk_10.setBounds(344, 166, 48, 20);
		panel_1.add(fk_10);

		wlr_10 = new JLabel("T");
		wlr_10.setFont(new Font("等线", Font.BOLD, 15));
		wlr_10.setForeground(Color.WHITE);
		wlr_10.setBounds(401, 166, 48, 20);
		panel_1.add(wlr_10);

		win_10 = new JLabel("T");
		win_10.setFont(new Font("等线", Font.BOLD, 15));
		win_10.setForeground(Color.WHITE);
		win_10.setBounds(459, 166, 48, 20);
		panel_1.add(win_10);

		bblr_10 = new JLabel("T");
		bblr_10.setFont(new Font("等线", Font.BOLD, 15));
		bblr_10.setForeground(Color.WHITE);
		bblr_10.setBounds(513, 166, 48, 20);
		panel_1.add(bblr_10);

		bb_10 = new JLabel("T");
		bb_10.setFont(new Font("等线", Font.BOLD, 15));
		bb_10.setForeground(Color.WHITE);
		bb_10.setBounds(571, 166, 77, 20);
		panel_1.add(bb_10);

		bl_10 = new JLabel("T");
		bl_10.setFont(new Font("等线", Font.BOLD, 15));
		bl_10.setForeground(Color.WHITE);
		bl_10.setBounds(656, 166, 77, 20);
		panel_1.add(bl_10);

		tag1_11 = new JLabel("T");
		tag1_11.setFont(new Font("等线", Font.BOLD, 15));
		tag1_11.setForeground(Color.WHITE);
		tag1_11.setBounds(43, 184, 20, 20);
		panel_1.add(tag1_11);

		tag2_11 = new JLabel("T");
		tag2_11.setFont(new Font("等线", Font.BOLD, 15));
		tag2_11.setForeground(Color.WHITE);
		tag2_11.setBounds(19, 184, 20, 20);
		panel_1.add(tag2_11);

		lv_11 = new JLabel("T");
		lv_11.setFont(new Font("等线", Font.BOLD, 15));
		lv_11.setForeground(Color.WHITE);
		lv_11.setBounds(110, 184, 48, 20);
		panel_1.add(lv_11);

		name_11 = new JLabel("T");
		name_11.setFont(new Font("等线", Font.BOLD, 15));
		name_11.setForeground(Color.WHITE);
		name_11.setBounds(162, 184, 119, 20);
		panel_1.add(name_11);

		fkdr_11 = new JLabel("T");
		fkdr_11.setFont(new Font("等线", Font.BOLD, 15));
		fkdr_11.setForeground(Color.WHITE);
		fkdr_11.setBounds(280, 184, 53, 20);
		panel_1.add(fkdr_11);

		fk_11 = new JLabel("T");
		fk_11.setFont(new Font("等线", Font.BOLD, 15));
		fk_11.setForeground(Color.WHITE);
		fk_11.setBounds(344, 184, 48, 20);
		panel_1.add(fk_11);

		wlr_11 = new JLabel("T");
		wlr_11.setFont(new Font("等线", Font.BOLD, 15));
		wlr_11.setForeground(Color.WHITE);
		wlr_11.setBounds(401, 184, 48, 20);
		panel_1.add(wlr_11);

		win_11 = new JLabel("T");
		win_11.setFont(new Font("等线", Font.BOLD, 15));
		win_11.setForeground(Color.WHITE);
		win_11.setBounds(459, 184, 48, 20);
		panel_1.add(win_11);

		bblr_11 = new JLabel("T");
		bblr_11.setFont(new Font("等线", Font.BOLD, 15));
		bblr_11.setForeground(Color.WHITE);
		bblr_11.setBounds(513, 184, 48, 20);
		panel_1.add(bblr_11);

		bb_11 = new JLabel("T");
		bb_11.setFont(new Font("等线", Font.BOLD, 15));
		bb_11.setForeground(Color.WHITE);
		bb_11.setBounds(571, 184, 77, 20);
		panel_1.add(bb_11);

		bl_11 = new JLabel("T");
		bl_11.setFont(new Font("等线", Font.BOLD, 15));
		bl_11.setForeground(Color.WHITE);
		bl_11.setBounds(656, 184, 77, 20);
		panel_1.add(bl_11);

		tag1_12 = new JLabel("T");
		tag1_12.setFont(new Font("等线", Font.BOLD, 15));
		tag1_12.setForeground(Color.WHITE);
		tag1_12.setBounds(43, 201, 20, 20);
		panel_1.add(tag1_12);

		tag2_12 = new JLabel("T");
		tag2_12.setFont(new Font("等线", Font.BOLD, 15));
		tag2_12.setForeground(Color.WHITE);
		tag2_12.setBounds(19, 201, 20, 20);
		panel_1.add(tag2_12);

		lv_12 = new JLabel("T");
		lv_12.setFont(new Font("等线", Font.BOLD, 15));
		lv_12.setForeground(Color.WHITE);
		lv_12.setBounds(110, 201, 48, 20);
		panel_1.add(lv_12);

		name_12 = new JLabel("T");
		name_12.setFont(new Font("等线", Font.BOLD, 15));
		name_12.setForeground(Color.WHITE);
		name_12.setBounds(162, 201, 119, 20);
		panel_1.add(name_12);

		fkdr_12 = new JLabel("T");
		fkdr_12.setFont(new Font("等线", Font.BOLD, 15));
		fkdr_12.setForeground(Color.WHITE);
		fkdr_12.setBounds(280, 201, 53, 20);
		panel_1.add(fkdr_12);

		fk_12 = new JLabel("T");
		fk_12.setFont(new Font("等线", Font.BOLD, 15));
		fk_12.setForeground(Color.WHITE);
		fk_12.setBounds(344, 201, 48, 20);
		panel_1.add(fk_12);

		wlr_12 = new JLabel("T");
		wlr_12.setFont(new Font("等线", Font.BOLD, 15));
		wlr_12.setForeground(Color.WHITE);
		wlr_12.setBounds(401, 201, 48, 20);
		panel_1.add(wlr_12);

		win_12 = new JLabel("T");
		win_12.setFont(new Font("等线", Font.BOLD, 15));
		win_12.setForeground(Color.WHITE);
		win_12.setBounds(459, 201, 48, 20);
		panel_1.add(win_12);

		bblr_12 = new JLabel("T");
		bblr_12.setFont(new Font("等线", Font.BOLD, 15));
		bblr_12.setForeground(Color.WHITE);
		bblr_12.setBounds(513, 201, 48, 20);
		panel_1.add(bblr_12);

		bb_12 = new JLabel("T");
		bb_12.setFont(new Font("等线", Font.BOLD, 15));
		bb_12.setForeground(Color.WHITE);
		bb_12.setBounds(571, 201, 77, 20);
		panel_1.add(bb_12);

		bl_12 = new JLabel("T");
		bl_12.setFont(new Font("等线", Font.BOLD, 15));
		bl_12.setForeground(Color.WHITE);
		bl_12.setBounds(656, 201, 77, 20);
		panel_1.add(bl_12);

		tag1_13 = new JLabel("T");
		tag1_13.setFont(new Font("等线", Font.BOLD, 15));
		tag1_13.setForeground(Color.WHITE);
		tag1_13.setBounds(43, 219, 20, 20);
		panel_1.add(tag1_13);

		tag2_13 = new JLabel("T");
		tag2_13.setFont(new Font("等线", Font.BOLD, 15));
		tag2_13.setForeground(Color.WHITE);
		tag2_13.setBounds(19, 219, 20, 20);
		panel_1.add(tag2_13);

		lv_13 = new JLabel("T");
		lv_13.setFont(new Font("等线", Font.BOLD, 15));
		lv_13.setForeground(Color.WHITE);
		lv_13.setBounds(110, 219, 48, 20);
		panel_1.add(lv_13);

		name_13 = new JLabel("T");
		name_13.setFont(new Font("等线", Font.BOLD, 15));
		name_13.setForeground(Color.WHITE);
		name_13.setBounds(162, 219, 119, 20);
		panel_1.add(name_13);

		fkdr_13 = new JLabel("T");
		fkdr_13.setFont(new Font("等线", Font.BOLD, 15));
		fkdr_13.setForeground(Color.WHITE);
		fkdr_13.setBounds(280, 219, 53, 20);
		panel_1.add(fkdr_13);

		fk_13 = new JLabel("T");
		fk_13.setFont(new Font("等线", Font.BOLD, 15));
		fk_13.setForeground(Color.WHITE);
		fk_13.setBounds(344, 219, 48, 20);
		panel_1.add(fk_13);

		wlr_13 = new JLabel("T");
		wlr_13.setFont(new Font("等线", Font.BOLD, 15));
		wlr_13.setForeground(Color.WHITE);
		wlr_13.setBounds(401, 219, 48, 20);
		panel_1.add(wlr_13);

		win_13 = new JLabel("T");
		win_13.setFont(new Font("等线", Font.BOLD, 15));
		win_13.setForeground(Color.WHITE);
		win_13.setBounds(459, 219, 48, 20);
		panel_1.add(win_13);

		bblr_13 = new JLabel("T");
		bblr_13.setFont(new Font("等线", Font.BOLD, 15));
		bblr_13.setForeground(Color.WHITE);
		bblr_13.setBounds(513, 219, 48, 20);
		panel_1.add(bblr_13);

		bb_13 = new JLabel("T");
		bb_13.setFont(new Font("等线", Font.BOLD, 15));
		bb_13.setForeground(Color.WHITE);
		bb_13.setBounds(571, 219, 77, 20);
		panel_1.add(bb_13);

		bl_13 = new JLabel("T");
		bl_13.setFont(new Font("等线", Font.BOLD, 15));
		bl_13.setForeground(Color.WHITE);
		bl_13.setBounds(656, 219, 77, 20);
		panel_1.add(bl_13);

		tag1_14 = new JLabel("T");
		tag1_14.setFont(new Font("等线", Font.BOLD, 15));
		tag1_14.setForeground(Color.WHITE);
		tag1_14.setBounds(43, 238, 20, 20);
		panel_1.add(tag1_14);

		tag2_14 = new JLabel("T");
		tag2_14.setFont(new Font("等线", Font.BOLD, 15));
		tag2_14.setForeground(Color.WHITE);
		tag2_14.setBounds(19, 238, 20, 20);
		panel_1.add(tag2_14);

		lv_14 = new JLabel("T");
		lv_14.setFont(new Font("等线", Font.BOLD, 15));
		lv_14.setForeground(Color.WHITE);
		lv_14.setBounds(110, 238, 48, 20);
		panel_1.add(lv_14);

		name_14 = new JLabel("T");
		name_14.setFont(new Font("等线", Font.BOLD, 15));
		name_14.setForeground(Color.WHITE);
		name_14.setBounds(162, 238, 119, 20);
		panel_1.add(name_14);

		fkdr_14 = new JLabel("T");
		fkdr_14.setFont(new Font("等线", Font.BOLD, 15));
		fkdr_14.setForeground(Color.WHITE);
		fkdr_14.setBounds(280, 238, 53, 20);
		panel_1.add(fkdr_14);

		fk_14 = new JLabel("T");
		fk_14.setFont(new Font("等线", Font.BOLD, 15));
		fk_14.setForeground(Color.WHITE);
		fk_14.setBounds(344, 238, 48, 20);
		panel_1.add(fk_14);

		wlr_14 = new JLabel("T");
		wlr_14.setFont(new Font("等线", Font.BOLD, 15));
		wlr_14.setForeground(Color.WHITE);
		wlr_14.setBounds(401, 238, 48, 20);
		panel_1.add(wlr_14);

		win_14 = new JLabel("T");
		win_14.setFont(new Font("等线", Font.BOLD, 15));
		win_14.setForeground(Color.WHITE);
		win_14.setBounds(459, 238, 48, 20);
		panel_1.add(win_14);

		bblr_14 = new JLabel("T");
		bblr_14.setFont(new Font("等线", Font.BOLD, 15));
		bblr_14.setForeground(Color.WHITE);
		bblr_14.setBounds(513, 238, 48, 20);
		panel_1.add(bblr_14);

		bb_14 = new JLabel("T");
		bb_14.setFont(new Font("等线", Font.BOLD, 15));
		bb_14.setForeground(Color.WHITE);
		bb_14.setBounds(571, 238, 77, 20);
		panel_1.add(bb_14);

		bl_14 = new JLabel("T");
		bl_14.setFont(new Font("等线", Font.BOLD, 15));
		bl_14.setForeground(Color.WHITE);
		bl_14.setBounds(656, 238, 77, 20);
		panel_1.add(bl_14);

		tag1_15 = new JLabel("T");
		tag1_15.setFont(new Font("等线", Font.BOLD, 15));
		tag1_15.setForeground(Color.WHITE);
		tag1_15.setBounds(43, 257, 20, 20);
		panel_1.add(tag1_15);

		tag2_15 = new JLabel("T");
		tag2_15.setFont(new Font("等线", Font.BOLD, 15));
		tag2_15.setForeground(Color.WHITE);
		tag2_15.setBounds(19, 257, 20, 20);
		panel_1.add(tag2_15);

		lv_15 = new JLabel("T");
		lv_15.setFont(new Font("等线", Font.BOLD, 15));
		lv_15.setForeground(Color.WHITE);
		lv_15.setBounds(110, 257, 48, 20);
		panel_1.add(lv_15);

		name_15 = new JLabel("T");
		name_15.setFont(new Font("等线", Font.BOLD, 15));
		name_15.setForeground(Color.WHITE);
		name_15.setBounds(162, 257, 119, 20);
		panel_1.add(name_15);

		fkdr_15 = new JLabel("T");
		fkdr_15.setFont(new Font("等线", Font.BOLD, 15));
		fkdr_15.setForeground(Color.WHITE);
		fkdr_15.setBounds(280, 257, 53, 20);
		panel_1.add(fkdr_15);

		fk_15 = new JLabel("T");
		fk_15.setFont(new Font("等线", Font.BOLD, 15));
		fk_15.setForeground(Color.WHITE);
		fk_15.setBounds(344, 257, 48, 20);
		panel_1.add(fk_15);

		wlr_15 = new JLabel("T");
		wlr_15.setFont(new Font("等线", Font.BOLD, 15));
		wlr_15.setForeground(Color.WHITE);
		wlr_15.setBounds(401, 257, 48, 20);
		panel_1.add(wlr_15);

		win_15 = new JLabel("T");
		win_15.setFont(new Font("等线", Font.BOLD, 15));
		win_15.setForeground(Color.WHITE);
		win_15.setBounds(459, 257, 48, 20);
		panel_1.add(win_15);

		bblr_15 = new JLabel("T");
		bblr_15.setFont(new Font("等线", Font.BOLD, 15));
		bblr_15.setForeground(Color.WHITE);
		bblr_15.setBounds(513, 257, 48, 20);
		panel_1.add(bblr_15);

		bb_15 = new JLabel("T");
		bb_15.setFont(new Font("等线", Font.BOLD, 15));
		bb_15.setForeground(Color.WHITE);
		bb_15.setBounds(571, 257, 77, 20);
		panel_1.add(bb_15);

		bl_15 = new JLabel("T");
		bl_15.setFont(new Font("等线", Font.BOLD, 15));
		bl_15.setForeground(Color.WHITE);
		bl_15.setBounds(656, 257, 77, 20);
		panel_1.add(bl_15);

		tag1_16 = new JLabel("T");
		tag1_16.setFont(new Font("等线", Font.BOLD, 15));
		tag1_16.setForeground(Color.WHITE);
		tag1_16.setBounds(43, 275, 20, 20);
		panel_1.add(tag1_16);

		tag2_16 = new JLabel("T");
		tag2_16.setFont(new Font("等线", Font.BOLD, 15));
		tag2_16.setForeground(Color.WHITE);
		tag2_16.setBounds(19, 275, 20, 20);
		panel_1.add(tag2_16);

		lv_16 = new JLabel("T");
		lv_16.setFont(new Font("等线", Font.BOLD, 15));
		lv_16.setForeground(Color.WHITE);
		lv_16.setBounds(110, 275, 48, 20);
		panel_1.add(lv_16);

		name_16 = new JLabel("T");
		name_16.setFont(new Font("等线", Font.BOLD, 15));
		name_16.setForeground(Color.WHITE);
		name_16.setBounds(162, 275, 119, 20);
		panel_1.add(name_16);

		fkdr_16 = new JLabel("T");
		fkdr_16.setFont(new Font("等线", Font.BOLD, 15));
		fkdr_16.setForeground(Color.WHITE);
		fkdr_16.setBounds(280, 275, 53, 20);
		panel_1.add(fkdr_16);

		fk_16 = new JLabel("T");
		fk_16.setFont(new Font("等线", Font.BOLD, 15));
		fk_16.setForeground(Color.WHITE);
		fk_16.setBounds(344, 275, 48, 20);
		panel_1.add(fk_16);

		wlr_16 = new JLabel("T");
		wlr_16.setFont(new Font("等线", Font.BOLD, 15));
		wlr_16.setForeground(Color.WHITE);
		wlr_16.setBounds(401, 275, 48, 20);
		panel_1.add(wlr_16);

		win_16 = new JLabel("T");
		win_16.setFont(new Font("等线", Font.BOLD, 15));
		win_16.setForeground(Color.WHITE);
		win_16.setBounds(459, 275, 48, 20);
		panel_1.add(win_16);

		bblr_16 = new JLabel("T");
		bblr_16.setFont(new Font("等线", Font.BOLD, 15));
		bblr_16.setForeground(Color.WHITE);
		bblr_16.setBounds(513, 275, 48, 20);
		panel_1.add(bblr_16);

		bb_16 = new JLabel("T");
		bb_16.setFont(new Font("等线", Font.BOLD, 15));
		bb_16.setForeground(Color.WHITE);
		bb_16.setBounds(571, 275, 77, 20);
		panel_1.add(bb_16);

		bl_16 = new JLabel("T");
		bl_16.setFont(new Font("等线", Font.BOLD, 15));
		bl_16.setForeground(Color.WHITE);
		bl_16.setBounds(656, 275, 77, 20);
		panel_1.add(bl_16);

		PS = new JLabel("说明： [S]Sniper [H]小小外纪 [Y]你自己 [A]高手小号 [P]车队玩家 [N]Nicks 带*为缓存信息 部分算法可能不准确");
		PS.setFont(new Font("等线", Font.BOLD, 15));
		PS.setForeground(SystemColor.info);
		PS.setBounds(10, 351, 745, 20);
		panel_1.add(PS);

		panel_2 = new Panel();
		panel_2.setBounds(677, 398, 78, 27);
		panel_2.setBackground(new Color(0, 0, 0, 0));
		lists.add(panel_2);
		panel_2.setLayout(null);

		prognum = new JLabel("0/0");
		prognum.setBounds(0, 0, 78, 27);
		panel_2.add(prognum);
		prognum.setToolTipText("状态框，显示当前任务的状态");
		prognum.setFont(new Font("宋体", Font.BOLD, 18));
		prognum.setHorizontalAlignment(SwingConstants.CENTER);
		prognum.setForeground(new Color(102, 153, 0));
		prognum.setBorder(new LineBorder(new Color(65, 62, 67), 2));

		JLabel lblNewLabel_8_1 = new JLabel("标记");
		lblNewLabel_8_1.setBounds(20, 10, 39, 15);
		lists.add(lblNewLabel_8_1);
		lblNewLabel_8_1.setToolTipText("标记：推测玩家的身份(组队 黑客 狙 NICK 你 机器人 ......)");
		lblNewLabel_8_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_8_1.setFont(new Font("微软雅黑", Font.PLAIN, 16));

		JLabel lblNewLabel_8_4 = new JLabel("头像");
		lblNewLabel_8_4.setBounds(62, 10, 39, 15);
		lists.add(lblNewLabel_8_4);
		lblNewLabel_8_4.setToolTipText("头像：显示玩家的头，你可以在设置里关闭，这可能会使API拥堵");
		lblNewLabel_8_4.setForeground(new Color(255, 255, 204));
		lblNewLabel_8_4.setFont(new Font("微软雅黑", Font.PLAIN, 16));

		JLabel lblNewLabel_8_4_1 = new JLabel("星级");
		lblNewLabel_8_4_1.setBounds(111, 10, 39, 15);
		lists.add(lblNewLabel_8_4_1);
		lblNewLabel_8_4_1.setToolTipText("星级：起床战争的星级，也就是等级");
		lblNewLabel_8_4_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_8_4_1.setFont(new Font("微软雅黑", Font.PLAIN, 16));

		JLabel lblNewLabel_8_4_4 = new JLabel("昵称");
		lblNewLabel_8_4_4.setBounds(162, 10, 39, 15);
		lists.add(lblNewLabel_8_4_4);
		lblNewLabel_8_4_4.setToolTipText("昵称：不用说了吧awa，如果是NICK的话会在标记处显示");
		lblNewLabel_8_4_4.setForeground(new Color(255, 255, 204));
		lblNewLabel_8_4_4.setFont(new Font("微软雅黑", Font.PLAIN, 16));

		JLabel lblNewLabel_8_4_4_1 = new JLabel("FKDR");
		lblNewLabel_8_4_4_1.setBounds(282, 10, 50, 15);
		lists.add(lblNewLabel_8_4_4_1);
		lblNewLabel_8_4_4_1.setToolTipText("FKDR：玩家的最终击杀于最终死亡之比，是评定玩家能力的标准之一");
		lblNewLabel_8_4_4_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_8_4_4_1.setFont(new Font("微软雅黑", Font.PLAIN, 16));

		JLabel lblNewLabel_8_4_4_4 = new JLabel("F.KILL");
		lblNewLabel_8_4_4_4.setBounds(345, 10, 50, 15);
		lists.add(lblNewLabel_8_4_4_4);
		lblNewLabel_8_4_4_4.setToolTipText("F.KILL：最终击杀数");
		lblNewLabel_8_4_4_4.setForeground(new Color(255, 255, 204));
		lblNewLabel_8_4_4_4.setFont(new Font("微软雅黑", Font.PLAIN, 16));

		JLabel lblNewLabel_8_4_4_4_1 = new JLabel("WLR");
		lblNewLabel_8_4_4_4_1.setBounds(405, 10, 50, 15);
		lists.add(lblNewLabel_8_4_4_4_1);
		lblNewLabel_8_4_4_4_1.setToolTipText("WLR：玩家的赢局于输局只比，是评定玩家能力的标准之一");
		lblNewLabel_8_4_4_4_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_8_4_4_4_1.setFont(new Font("微软雅黑", Font.PLAIN, 16));

		JLabel lblNewLabel_8_4_4_4_4 = new JLabel("Wins");
		lblNewLabel_8_4_4_4_4.setBounds(460, 10, 50, 15);
		lists.add(lblNewLabel_8_4_4_4_4);
		lblNewLabel_8_4_4_4_4.setToolTipText("Wins：赢场数");
		lblNewLabel_8_4_4_4_4.setForeground(new Color(255, 255, 204));
		lblNewLabel_8_4_4_4_4.setFont(new Font("微软雅黑", Font.PLAIN, 16));

		JLabel lblNewLabel_8_4_4_4_4_1 = new JLabel("BBLR");
		lblNewLabel_8_4_4_4_4_1.setBounds(518, 10, 50, 15);
		lists.add(lblNewLabel_8_4_4_4_4_1);
		lblNewLabel_8_4_4_4_4_1.setToolTipText("BBLR：玩家的拆床于被拆床之比，是评定玩家能力的标准之一");
		lblNewLabel_8_4_4_4_4_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_8_4_4_4_4_1.setFont(new Font("微软雅黑", Font.PLAIN, 16));

		JLabel lblNewLabel_8_4_4_4_4_4 = new JLabel("B.Broken");
		lblNewLabel_8_4_4_4_4_4.setBounds(576, 10, 74, 15);
		lists.add(lblNewLabel_8_4_4_4_4_4);
		lblNewLabel_8_4_4_4_4_4.setToolTipText("B.Broken：拆床数");
		lblNewLabel_8_4_4_4_4_4.setForeground(new Color(255, 255, 204));
		lblNewLabel_8_4_4_4_4_4.setFont(new Font("微软雅黑", Font.PLAIN, 16));

		JLabel lblNewLabel_8_4_4_4_4_4_1 = new JLabel("B.Lose");
		lblNewLabel_8_4_4_4_4_4_1.setBounds(660, 10, 74, 15);
		lists.add(lblNewLabel_8_4_4_4_4_4_1);
		lblNewLabel_8_4_4_4_4_4_1.setToolTipText("B.Lose：被拆床数");
		lblNewLabel_8_4_4_4_4_4_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_8_4_4_4_4_4_1.setFont(new Font("微软雅黑", Font.PLAIN, 16));

		panel = new JPanel();
		lblNewLabel.setLabelFor(panel);
		logo.setLabelFor(panel);
		panel.setBorder(new LineBorder(new Color(255, 255, 255), 4));
		panel.setBackground(new Color(0, 0, 0, 0));
		panel.setBounds(10, 10, 765, 487);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setAlwaysOnTop(false);
				int n = JOptionPane.showConfirmDialog(null, "确认关闭NMSL Overlay吗?", "关闭？", JOptionPane.YES_NO_OPTION);
				if (n == JOptionPane.YES_OPTION) {
					System.exit(114514);
				} else if (n == JOptionPane.NO_OPTION) {
					frame.setAlwaysOnTop(true);
				}
				frame.setAlwaysOnTop(true);
			}
		});

		setting = new JPanel();
		setting.setBounds(5, 58, 755, 425);
		setting.setBackground(new Color(151, 151, 151, 3));
		panel.add(setting);
		setting.setLayout(null);

		JLabel lblNewLabel_18_1 = new JLabel("NMSL Overlay设置");
		lblNewLabel_18_1.setForeground(Color.YELLOW);
		lblNewLabel_18_1.setFont(new Font("楷体", Font.PLAIN, 32));
		lblNewLabel_18_1.setBounds(10, 10, 279, 45);
		setting.add(lblNewLabel_18_1);

		JLabel lblNewLabel_11 = new JLabel("为了区分你和其他人，请您输入您的游戏ID：");
		lblNewLabel_11.setFont(new Font("楷体", Font.PLAIN, 18));
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setBounds(31, 63, 370, 23);
		setting.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("ID：");
		lblNewLabel_12.setForeground(Color.ORANGE);
		lblNewLabel_12.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		lblNewLabel_12.setBounds(53, 87, 41, 30);
		setting.add(lblNewLabel_12);

		idinput = new JTextField();
		idinput.setBounds(98, 87, 178, 30);
		setting.add(idinput);
		idinput.setColumns(10);

		JButton btnNewButton_2 = new JButton("确定");
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String cnmsb = Tools.httpGet("https://api.mojang.com/users/profiles/minecraft/" + idinput.getText());
				if (cnmsb.indexOf(idinput.getText()) > -1) {
					frame.setAlwaysOnTop(false);
					try {
						username = idinput.getText();
						FileWriter cnmsbnms = new FileWriter("C:/.nmsloverlay/overlay.config");
						cnmsbnms.write("Name=" + username + "*.BRD\r\nLog=" + loglocate + "*.RSD");
						cnmsbnms.flush();
						cnmsbnms.close();
						JOptionPane.showMessageDialog(null, "id更改已保存", "成功", JOptionPane.PLAIN_MESSAGE);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "无法保存配置，请尝试删除C:/.nmsloverlay", "文件保存错误", JOptionPane.ERROR_MESSAGE);
						e1.printStackTrace();
					}

				} else {
					JOptionPane.showMessageDialog(null, "无法识别您的id，可能是您拼写错误，也可能是MojangAPI出错", "用户名异常", JOptionPane.ERROR_MESSAGE);
				}
				frame.setAlwaysOnTop(true);
			}
		});
		btnNewButton_2.setBackground(SystemColor.control);
		btnNewButton_2.setFont(new Font("楷体", Font.PLAIN, 18));
		btnNewButton_2.setBounds(286, 85, 86, 32);
		setting.add(btnNewButton_2);
		JLabel lblNewLabel_11_1 = new JLabel("为了获取玩家列表，我们需要扫描您的客户端日志文件。");
		lblNewLabel_11_1.setForeground(Color.WHITE);
		lblNewLabel_11_1.setFont(new Font("楷体", Font.PLAIN, 18));
		lblNewLabel_11_1.setBounds(31, 124, 454, 23);
		setting.add(lblNewLabel_11_1);

		JLabel lblNewLabel_11_2 = new JLabel("请在下方填上客户端日志路径，或者选择您的客户端名称快速补全。");
		lblNewLabel_11_2.setForeground(Color.WHITE);
		lblNewLabel_11_2.setFont(new Font("楷体", Font.PLAIN, 18));
		lblNewLabel_11_2.setBounds(31, 145, 571, 23);
		setting.add(lblNewLabel_11_2);

		JLabel lblNewLabel_12_1 = new JLabel("路径：");
		lblNewLabel_12_1.setForeground(Color.ORANGE);
		lblNewLabel_12_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		lblNewLabel_12_1.setBounds(53, 166, 60, 30);
		setting.add(lblNewLabel_12_1);

		clientinput = new JTextField();
		clientinput.setText("需要您点击按钮选择");
		clientinput.setEnabled(false);
		clientinput.setBounds(123, 166, 278, 30);
		setting.add(clientinput);
		clientinput.setColumns(10);

		JButton btnNewButton_3 = new JButton("手动选择");
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setAlwaysOnTop(false);
				FileDialog fileDialog = new FileDialog(frame);
				fileDialog.show();
				String filePath = fileDialog.getDirectory();
				String fileName = fileDialog.getFile();
				if (fileName.equals("latest.log")) {
					clientinput.setText(filePath + "/latest.log");
					JOptionPane.showMessageDialog(null, "已找到您的日志文件，请保存更改", "成功", JOptionPane.PLAIN_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "需要latest.log！awa", "选错力！", JOptionPane.ERROR_MESSAGE);
				}
				frame.setAlwaysOnTop(true);
			}
		});
		btnNewButton_3.setBackground(SystemColor.control);
		btnNewButton_3.setFont(new Font("楷体", Font.PLAIN, 18));
		btnNewButton_3.setBounds(411, 166, 113, 30);
		setting.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Lunar Client");
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {// C:/Users/Administrator/.lunarclient/offline/multiver/logs
				frame.setAlwaysOnTop(false);
				Map<String, String> map = System.getenv();
				File nms = new File("C:/Users/Administrator/.lunarclient/offline/multiver/logs/latest.log");
				File cnmsb = new File("C:/Users/" + map.get("USERNAME") + ".lunarclient/offline/multiver/logs/latest.log");
				if (nms.isFile()) {
					clientinput.setText("C:/Users/Administrator/.lunarclient/offline/multiver/logs/latest.log");
					JOptionPane.showMessageDialog(null, "已找到您的Lunar Client的日志文件，请保存更改", "成功", JOptionPane.PLAIN_MESSAGE);
				} else if (cnmsb.isFile()) {
					clientinput.setText("C:/Users/" + map.get("USERNAME") + ".lunarclient/offline/multiver/logs/latest.log");
					JOptionPane.showMessageDialog(null, "已找到您的Lunar Client的日志文件，请保存更改", "成功", JOptionPane.PLAIN_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "不！你没有在用Lunar Client", "文件获取错误", JOptionPane.ERROR_MESSAGE);
				}
				frame.setAlwaysOnTop(true);
			}
		});
		btnNewButton_4.setBackground(SystemColor.control);
		btnNewButton_4.setBounds(31, 206, 113, 30);
		setting.add(btnNewButton_4);

		JButton btnNewButton_4_1 = new JButton("Badlion Client");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {// C:/Users/Administrator/AppData/Roaming/.minecraft/logs/blclient/minecraft/latest.log
				frame.setAlwaysOnTop(false);
				Map<String, String> map = System.getenv();
				File nms = new File("C:/Users/Administrator/AppData/Roaming/.minecraft/logs/blclient/minecraft/latest.log");
				File cnmsb = new File("C:/Users/" + map.get("USERNAME") + "/AppData/Roaming/.minecraft/logs/blclient/minecraft/latest.log");
				if (nms.isFile()) {
					clientinput.setText("C:/Users/Administrator/AppData/Roaming/.minecraft/logs/blclient/minecraft/latest.log");
					JOptionPane.showMessageDialog(null, "已找到您的Badlion Client的日志文件，请保存更改", "成功", JOptionPane.PLAIN_MESSAGE);
				} else if (cnmsb.isFile()) {
					clientinput.setText("C:/Users/" + map.get("USERNAME") + "/AppData/Roaming/.minecraft/logs/blclient/minecraft/latest.log");
					JOptionPane.showMessageDialog(null, "已找到您的Badlion Client的日志文件，请保存更改", "成功", JOptionPane.PLAIN_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "不！你没有在用Badlion Client", "文件获取错误", JOptionPane.ERROR_MESSAGE);
				}
				frame.setAlwaysOnTop(true);
			}
		});
		btnNewButton_4_1.setBackground(SystemColor.control);
		btnNewButton_4_1.setBounds(154, 206, 122, 30);
		setting.add(btnNewButton_4_1);

		JButton btnNewButton_5 = new JButton("保存");
		btnNewButton_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setAlwaysOnTop(false);
				try {
					loglocate = clientinput.getText();
					FileWriter cnmsbnms = new FileWriter("C:/.nmsloverlay/overlay.config");
					cnmsbnms.write("Name=" + username + "*.BRD\r\nLog=" + loglocate + "*.RSD");
					cnmsbnms.flush();
					cnmsbnms.close();
					JOptionPane.showMessageDialog(null, "日志更改已保存", "成功", JOptionPane.PLAIN_MESSAGE);
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "无法保存配置，请尝试删除C:/.nmsloverlay", "文件保存错误", JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
				frame.setAlwaysOnTop(true);
			}
		});
		btnNewButton_5.setBackground(SystemColor.control);
		btnNewButton_5.setFont(new Font("楷体", Font.PLAIN, 18));
		btnNewButton_5.setBounds(286, 206, 86, 30);
		setting.add(btnNewButton_5);

		JLabel lblNewLabel_11_2_4 = new JLabel("建议在打开客户端之后启动Overlay，若获取功能出现异常，请尝试重启客户端");
		lblNewLabel_11_2_4.setForeground(Color.WHITE);
		lblNewLabel_11_2_4.setFont(new Font("楷体", Font.PLAIN, 18));
		lblNewLabel_11_2_4.setBounds(31, 329, 646, 23);
		setting.add(lblNewLabel_11_2_4);

		JLabel lblNewLabel_11_2_1 = new JLabel("注：请在客户端开启的情况下配置Overlay，以免出现不必要的麻烦");
		lblNewLabel_11_2_1.setForeground(Color.WHITE);
		lblNewLabel_11_2_1.setFont(new Font("楷体", Font.PLAIN, 18));
		lblNewLabel_11_2_1.setBounds(31, 307, 571, 23);
		setting.add(lblNewLabel_11_2_1);

		JLabel lblNewLabel_11_2_4_1 = new JLabel("需要在游戏内输入/who命令获取列表建议开启客户端的AutoWho功能该功能在Hypixel允许使用");
		lblNewLabel_11_2_4_1.setForeground(Color.PINK);
		lblNewLabel_11_2_4_1.setFont(new Font("楷体", Font.PLAIN, 18));
		lblNewLabel_11_2_4_1.setBounds(10, 353, 745, 23);
		setting.add(lblNewLabel_11_2_4_1);

		hypixelAPI = new JPanel();
		hypixelAPI.setBounds(5, 58, 755, 425);
		hypixelAPI.setBackground(new Color(151, 151, 151, 3));
		panel.add(hypixelAPI);
		hypixelAPI.setLayout(null);

		JLabel lblNewLabel_18 = new JLabel("HypixelAPI设置");
		lblNewLabel_18.setFont(new Font("楷体", Font.PLAIN, 32));
		lblNewLabel_18.setForeground(new Color(255, 255, 0));
		lblNewLabel_18.setBounds(10, 10, 233, 45);
		hypixelAPI.add(lblNewLabel_18);

		JLabel lblNewLabel_19 = new JLabel("请在Hypixel大厅使用/api new获取API key（如图），点击蓝字可复制");
		lblNewLabel_19.setFont(new Font("楷体", Font.PLAIN, 18));
		lblNewLabel_19.setForeground(new Color(255, 255, 255));
		lblNewLabel_19.setBounds(32, 65, 609, 24);
		hypixelAPI.add(lblNewLabel_19);

		JLabel lblNewLabel_8 = new JLabel("将API Key填入下方文本框中");
		lblNewLabel_8.setFont(new Font("楷体", Font.PLAIN, 18));
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(32, 256, 425, 24);
		hypixelAPI.add(lblNewLabel_8);

		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon(NMSL.class.getResource("/resourse/apikey.png")));
		lblNewLabel_10.setBounds(19, 88, 726, 158);
		hypixelAPI.add(lblNewLabel_10);

		JLabel lblNewLabel_9 = new JLabel("API Key：");
		lblNewLabel_9.setForeground(Color.ORANGE);
		lblNewLabel_9.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(42, 296, 97, 24);
		hypixelAPI.add(lblNewLabel_9);

		keyinput = new JPasswordField();
		keyinput.setForeground(new Color(218, 112, 214));
		keyinput.setFont(new Font("宋体", Font.PLAIN, 12));
		keyinput.setBackground(SystemColor.menu);
		keyinput.setBounds(124, 290, 262, 30);
		hypixelAPI.add(keyinput);

		JButton btnNewButton = new JButton("清空重填");
		btnNewButton.setBackground(SystemColor.control);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				keyinput.setText(null);
				keyinput.requestFocus();
			}
		});
		btnNewButton.setFont(new Font("楷体", Font.PLAIN, 18));
		btnNewButton.setBounds(163, 341, 121, 37);
		hypixelAPI.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("完成修改");
		btnNewButton_1.setBackground(SystemColor.control);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				hypixelAPI.setVisible(false);
				lists.setVisible(true);
				frame.repaint();
				getprog.setMinimum(0);
				getprog.setMaximum(3);
				getprog.setValue(1);
				frame.repaint();
				prognum.setText("Verif");
				panel_2.repaint();
				Thread rnmsb = new Thread() {
					@Override
					public void run() {
						frame.setAlwaysOnTop(false);
						if (com.msdosadmin.NMSL_Overlay.Tools.httpGet("https://api.hypixel.net/guild?key=" + keyinput.getText() + "&&player=f7c77d999f154a66a87dc4a51ef30d19").indexOf("52e57a1c0cf2e250d1cd00f8") > -1) {
							prognum.setText("Apply");
							panel_2.repaint();
							getprog.setValue(2);
							frame.repaint();
							try {
								FileWriter cnmsbnms = new FileWriter("C:/.nmsloverlay/api.config");
								cnmsbnms.write(keyinput.getText());
								cnmsbnms.flush();
								cnmsbnms.close();
								getprog.setValue(3);
								frame.repaint();
								prognum.setText("DONE");
								JOptionPane.showMessageDialog(null, "更改已保存！", "完成", JOptionPane.PLAIN_MESSAGE);
								if (oobe == 1) {
									hypixelAPI.setVisible(false);
									lists.setVisible(false);
									setting.setVisible(true);
									frame.repaint();
									JOptionPane.showMessageDialog(null, "不错！你已经完成了HypixelAPI的配置，接下来请完善其他配置，完成这些配置之后就可以愉快的使用NMSL Overlay了", "继续", JOptionPane.PLAIN_MESSAGE);
									oobe = 0;
								} else {
									frame.setAlwaysOnTop(true);
								}
							} catch (IOException e) {
								e.printStackTrace();
								prognum.setText("FAIL");//
								JOptionPane.showMessageDialog(null, "出现错误！无法保存更改！", "错误", JOptionPane.ERROR_MESSAGE);
							}
						} else {
							prognum.setText("FAIL");
							panel_2.repaint();
							JOptionPane.showMessageDialog(null, "您提供的api key无效！", "无效", JOptionPane.ERROR_MESSAGE);

						}
					}
				};
				rnmsb.start();
			}
		});
		btnNewButton_1.setFont(new Font("楷体", Font.PLAIN, 18));
		btnNewButton_1.setBounds(32, 341, 121, 37);
		hypixelAPI.add(btnNewButton_1);

		lblNewLabel_1.setIcon(new ImageIcon(NMSL.class.getResource("/resourse/close_small.png")));
		lblNewLabel_1.setBounds(730, 10, 25, 25);
		panel.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("最小化");
		lblNewLabel_2.setToolTipText("最小化");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setExtendedState(JFrame.ICONIFIED);
				/*
				 * 那边的设计一团糟 别看了 frame.dispose(); try { Closed window = new Closed(); window.frame.setVisible(true); } catch (Exception nmsl) { nmsl.printStackTrace(); }
				 */
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(NMSL.class.getResource("/resourse/zxh.png")));
		lblNewLabel_2.setBounds(695, 10, 25, 25);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Github地址");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.browse(new URI("https://github.com/GoldenQuartz/NMSL-Overlay"));
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_3.setToolTipText("Github地址");
		lblNewLabel_3.setIcon(new ImageIcon(NMSL.class.getResource("/resourse/github.png")));
		lblNewLabel_3.setBounds(423, 10, 40, 40);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("玩家列表");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				hypixelAPI.setVisible(false);
				setting.setVisible(false);
				lists.setVisible(true);
				frame.repaint();
			}
		});
		lblNewLabel_4.setToolTipText("玩家列表");
		lblNewLabel_4.setIcon(new ImageIcon(NMSL.class.getResource("/resourse/list.png")));
		lblNewLabel_4.setBounds(273, 10, 40, 40);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("系统设置");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				hypixelAPI.setVisible(false);
				lists.setVisible(false);
				setting.setVisible(true);
				frame.repaint();
			}
		});
		lblNewLabel_5.setToolTipText("系统设置");
		lblNewLabel_5.setIcon(new ImageIcon(NMSL.class.getResource("/resourse/setting.png")));
		lblNewLabel_5.setBounds(323, 10, 40, 40);
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel_7 = new JLabel("Hypixel API设置");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lists.setVisible(false);
				setting.setVisible(false);
				hypixelAPI.setVisible(true);
				frame.repaint();
			}
		});
		lblNewLabel_7.setIcon(new ImageIcon(NMSL.class.getResource("/resourse/hypixel.png")));
		lblNewLabel_7.setToolTipText("Hypixel API设置");
		lblNewLabel_7.setBounds(373, 10, 40, 40);
		panel.add(lblNewLabel_7);

		JLabel lblNewLabel_2_1 = new JLabel("重置缓存");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Tools.canche.clear();
				Tools.clearList(true);
			}
		});
		lblNewLabel_2_1.setIcon(new ImageIcon(NMSL.class.getResource("/resourse/rest.png")));
		lblNewLabel_2_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_2_1.setToolTipText("刷新缓存");
		lblNewLabel_2_1.setBounds(660, 10, 25, 25);
		panel.add(lblNewLabel_2_1);

		frame.addMouseListener(new MouseAdapter() { // 设置窗口可拖动，添加监听器
			@Override
			public void mousePressed(MouseEvent e) { // 获取点击鼠标时的坐标
				mouseAtX = e.getPoint().x;
				mouseAtY = e.getPoint().y;
			}
		});
		logo.addMouseListener(new MouseAdapter() { // 设置窗口可拖动，添加监听器
			@Override
			public void mousePressed(MouseEvent e) { // 获取点击鼠标时的坐标
				mouseAtX = e.getPoint().x;
				mouseAtY = e.getPoint().y;
			}
		});
		logo.addMouseMotionListener(new MouseMotionAdapter() { // 设置拖拽后，窗口的位置
			@Override
			public void mouseDragged(MouseEvent e) {
				frame.setLocation(e.getXOnScreen() - mouseAtX, e.getYOnScreen() - mouseAtY);
			}
		});
		frame.addMouseMotionListener(new MouseMotionAdapter() { // 设置拖拽后，窗口的位置
			@Override
			public void mouseDragged(MouseEvent e) {
				frame.setLocation(e.getXOnScreen() - mouseAtX, e.getYOnScreen() - mouseAtY);
			}
		});
		RianbowPanel skyblock = new RianbowPanel();
		skyblock.start();
		File nms = new File("C:/.nmsloverlay");
		File nmsapicfg = new File("C:/.nmsloverlay/api.config");
		File nmscfg = new File("C:/.nmsloverlay/overlay.config");

		hypixelAPI.setVisible(false);
		setting.setVisible(false);
		if (!nms.isDirectory()) {
			oobe = 1;
			int n = JOptionPane.showConfirmDialog(null, "这是您第一次使用NMSL Overlay 我们将为您再C:/创建一个目录以存储我们的配置文件，如果Overlay出现异常，请尝试删除C:/.nmsloverlay是否继续?", "欢迎使用", JOptionPane.YES_NO_OPTION);
			if (n == JOptionPane.YES_OPTION) {
				nms.mkdirs();
				nmsapicfg.createNewFile();
				nmscfg.createNewFile();
				FileWriter cnmsbnms = new FileWriter("C:/.nmsloverlay/overlay.config");
				cnmsbnms.write("Name=ThisTheDefaultSet*.BRD\r\nLog=未指定的文件*.RSD");
				username = "ThisTheDefaultSet";
				loglocate = "未指定的文件";
				idinput.setText("未指定");
				cnmsbnms.flush();
				cnmsbnms.close();
			} else if (n == JOptionPane.NO_OPTION) {
				System.exit(114514);
			}
			JOptionPane.showMessageDialog(null, "很好，我们已经为您创建了初始配置文件，现在我需要您配合我们完成配置，这期间内，请勿退出本程序", "继续", JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(null, "很好，看来您是一个忠实的用户呢！现在，让我们选择你的客户端或自定义您的日志文件", "继续", JOptionPane.PLAIN_MESSAGE);
			frame.setAlwaysOnTop(false);
			lists.setVisible(false);
			hypixelAPI.setVisible(true);
			frame.repaint();
		} else {
			try {
				BufferedReader gnm = new BufferedReader(new FileReader(new File("C:/.nmsloverlay/overlay.config")));
				username = gnm.readLine().replace("Name=", "").replace("*.BRD", "");
				loglocate = gnm.readLine().replace("Log=", "").replace("*.RSD", "");
				idinput.setText(username);
				clientinput.setText(loglocate);
				BufferedReader gnmb = new BufferedReader(new FileReader(new File("C:/.nmsloverlay/api.config")));
				key = gnmb.readLine();
				if (loglocate.equals("未指定的文件") || key.equals("") || username.equals("ThisTheDefaultSetThisTheDefaultSet") || !(new File(loglocate).isFile())) {
					frame.setAlwaysOnTop(false);
					JOptionPane.showMessageDialog(null, "配置错误！可能尚未填写完整，或者日志文件无效，请尝试重启客户端", "错误", JOptionPane.ERROR_MESSAGE);
					frame.setAlwaysOnTop(true);
				} else {
					LogScaner nmslsbcnm = new LogScaner();
					nmslsbcnm.start();
				}
			} catch (IOException e) {
				e.printStackTrace(); // 输出信息
			}
		}
		createComponentMap();
		Tools.clearList(true);
	}

	private void createComponentMap() {
		componentMap = new HashMap();
		Component[] components = frame.getContentPane().getComponents();
		for (int i = 0; i < components.length; i++) {
			componentMap.put(components[i].getName(), components[i]);
		}
	}

	public static Component getComponentByName(String name) {
		if (componentMap.containsKey(name)) {
			return (Component) componentMap.get(name);
		} else {
			return null;
		}
	}
}
