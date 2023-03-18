package com.msdosadmin.NMSL_Overlay;

import static com.msdosadmin.NMSL_Overlay.NMSL.mouseAtX;
import static com.msdosadmin.NMSL_Overlay.NMSL.mouseAtY;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Closed {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Closed window = new Closed();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Closed() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 47);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.locate(mouseAtX, mouseAtY);
		frame.setUndecorated(true); // 窗口去边框
		frame.setAlwaysOnTop(true); // 设置窗口总在最前
		frame.setBackground(new Color(0, 0, 0, 0));
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("恢复");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				com.msdosadmin.NMSL_Overlay.NMSL.frame.show();
				frame.dispose();
			}
		});
		btnNewButton.setBounds(383, 20, 67, 23);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("NMS");
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 21));
		lblNewLabel.setForeground(SystemColor.control);
		lblNewLabel.setBounds(10, 20, 54, 23);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("L");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 51));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(65, 4, 54, 43);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Overlay");
		lblNewLabel_2.setForeground(new Color(148, 0, 211));
		lblNewLabel_2.setFont(new Font("Segoe Print", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(105, 18, 74, 25);
		frame.getContentPane().add(lblNewLabel_2);
		frame.addMouseListener(new MouseAdapter() { // 设置窗口可拖动，添加监听器
			@Override
			public void mousePressed(MouseEvent e) { // 获取点击鼠标时的坐标
				mouseAtX = e.getPoint().x;
				mouseAtY = e.getPoint().y;
			}
		});
		frame.addMouseMotionListener(new MouseMotionAdapter() { // 设置拖拽后，窗口的位置
			@Override
			public void mouseDragged(MouseEvent e) {
				frame.setLocation(e.getXOnScreen() - mouseAtX, e.getYOnScreen() - mouseAtY);
			}
		});
	}
}
