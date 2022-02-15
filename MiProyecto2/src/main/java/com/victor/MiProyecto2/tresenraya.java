package com.victor.MiProyecto2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;

public class tresenraya extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private ButtonGroup bg = new ButtonGroup();
	private ButtonGroup bg2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tresenraya frame = new tresenraya();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public tresenraya() {
		setTitle("Tres En Raya");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(440, 11, 437, 478);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Nueva Partida");
		btnNewButton.setBounds(135, 22, 159, 40);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Aquí ponemos de quien es el turno");
		lblNewLabel_2.setBounds(33, 73, 248, 14);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1_1.setBounds(20, 290, 383, 166);
		panel.add(panel_1_1);
		
		JLabel lblJugador = new JLabel("Jugador 2");
		lblJugador.setBounds(10, 11, 63, 23);
		panel_1_1.add(lblJugador);
		
		JLabel lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setBounds(10, 45, 63, 23);
		panel_1_1.add(lblNombre_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(68, 45, 105, 20);
		panel_1_1.add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tipo:");
		lblNewLabel_1_1.setBounds(10, 79, 46, 14);
		panel_1_1.add(lblNewLabel_1_1);
		
		JRadioButton humano2 = new JRadioButton("Humano");
		humano2.setBounds(68, 75, 86, 23);
		panel_1_1.add(humano2);
		
		JRadioButton cpu2 = new JRadioButton("Cpu");
		cpu2.setBounds(156, 75, 86, 23);
		panel_1_1.add(cpu2);
		
		bg2.add(humano2);
		bg2.add(cpu2);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1_1_1.setBounds(20, 111, 383, 166);
		panel.add(panel_1_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Jugador 1");
		lblNewLabel_3_1.setBounds(10, 11, 63, 23);
		panel_1_1_1.add(lblNewLabel_3_1);
		
		JLabel lblNombre_1_1 = new JLabel("Nombre:");
		lblNombre_1_1.setBounds(10, 45, 63, 23);
		panel_1_1_1.add(lblNombre_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(68, 45, 105, 20);
		panel_1_1_1.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Tipo:");
		lblNewLabel_1_1_1.setBounds(10, 79, 46, 14);
		panel_1_1_1.add(lblNewLabel_1_1_1);
		
		JRadioButton humano1 = new JRadioButton("Humano");
		humano1.setBounds(68, 75, 86, 23);
		panel_1_1_1.add(humano1);
		
		JRadioButton cpu1 = new JRadioButton("Cpu");
		cpu1.setBounds(156, 75, 86, 23);
		panel_1_1_1.add(cpu1);
		
		bg.add(humano1);
		bg.add(cpu1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(10, 11, 416, 478);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(3, 3, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		/*JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(20, 11, 117, 136);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\victo\\Desktop\\JAVA BOOTCAMP\\juegotresenraya\\imagenestresenraya\\Xedit.png"));
		panel_4.add(lblNewLabel);
		*/
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\victo\\Desktop\\JAVA BOOTCAMP\\juegotresenraya\\imagenestresenraya\\circuloedit.png"));
		lblNewLabel_1.setBounds(20, 11, 117, 136);
		panel_4.add(lblNewLabel_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		/*
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\victo\\Desktop\\JAVA BOOTCAMP\\juegotresenraya\\imagenestresenraya\\Xedit.png"));
		lblNewLabel_4.setBounds(20, 11, 117, 136);
		panel_5.add(lblNewLabel_4);
		*/
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\victo\\Desktop\\JAVA BOOTCAMP\\juegotresenraya\\imagenestresenraya\\circuloedit.png"));
		lblNewLabel_3.setBounds(20, 11, 117, 136);
		panel_5.add(lblNewLabel_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		/*
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\victo\\Desktop\\JAVA BOOTCAMP\\juegotresenraya\\imagenestresenraya\\Xedit.png"));
		lblNewLabel_6.setBounds(20, 11, 117, 136);
		panel_3.add(lblNewLabel_6);
		*/
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\victo\\Desktop\\JAVA BOOTCAMP\\juegotresenraya\\imagenestresenraya\\circuloedit.png"));
		lblNewLabel_5.setBounds(20, 11, 117, 136);
		panel_3.add(lblNewLabel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_6.setToolTipText("");
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		/*
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(20, 11, 117, 136);
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\victo\\Desktop\\JAVA BOOTCAMP\\juegotresenraya\\imagenestresenraya\\Xedit.png"));
		panel_6.add(lblNewLabel_9);
		*/
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(20, 11, 117, 136);
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\victo\\Desktop\\JAVA BOOTCAMP\\juegotresenraya\\imagenestresenraya\\circuloedit.png"));
		panel_6.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(20, 11, 117, 136);
		panel_6.add(lblNewLabel_8);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.add(panel_7);
		panel_7.setLayout(null);
		/*	
		JLabel lblNewLabel_11 = new JLabel("\r\n");
		lblNewLabel_11.setBounds(20, 11, 117, 136);
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\victo\\Desktop\\JAVA BOOTCAMP\\juegotresenraya\\imagenestresenraya\\Xedit.png"));
		panel_7.add(lblNewLabel_11);
		*/
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(20, 11, 117, 136);
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\victo\\Desktop\\JAVA BOOTCAMP\\juegotresenraya\\imagenestresenraya\\circuloedit.png"));
		panel_7.add(lblNewLabel_10);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.add(panel_8);
		panel_8.setLayout(null);
		/*
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setBounds(20, 11, 117, 136);
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\victo\\Desktop\\JAVA BOOTCAMP\\juegotresenraya\\imagenestresenraya\\Xedit.png"));
		panel_8.add(lblNewLabel_13);
		*/
		JLabel lblNewLabel_12 = new JLabel("\r\n");
		lblNewLabel_12.setBounds(20, 11, 117, 136);
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\victo\\Desktop\\JAVA BOOTCAMP\\juegotresenraya\\imagenestresenraya\\circuloedit.png"));
		panel_8.add(lblNewLabel_12);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.add(panel_9);
		panel_9.setLayout(null);
		/*
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setBounds(20, 11, 117, 136);
		lblNewLabel_15.setIcon(new ImageIcon("C:\\Users\\victo\\Desktop\\JAVA BOOTCAMP\\juegotresenraya\\imagenestresenraya\\Xedit.png"));
		panel_9.add(lblNewLabel_15);
		*/
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setBounds(20, 11, 117, 136);
		lblNewLabel_14.setIcon(new ImageIcon("C:\\Users\\victo\\Desktop\\JAVA BOOTCAMP\\juegotresenraya\\imagenestresenraya\\circuloedit.png"));
		panel_9.add(lblNewLabel_14);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.add(panel_10);
		panel_10.setLayout(null);
		/*
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setBounds(20, 11, 117, 136);
		lblNewLabel_17.setIcon(new ImageIcon("C:\\Users\\victo\\Desktop\\JAVA BOOTCAMP\\juegotresenraya\\imagenestresenraya\\Xedit.png"));
		panel_10.add(lblNewLabel_17);
		*/
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setBounds(20, 11, 117, 136);
		lblNewLabel_16.setIcon(new ImageIcon("C:\\Users\\victo\\Desktop\\JAVA BOOTCAMP\\juegotresenraya\\imagenestresenraya\\circuloedit.png"));
		panel_10.add(lblNewLabel_16);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.add(panel_11);
		panel_11.setLayout(null);
		/*
		JLabel lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.setBounds(20, 11, 117, 136);
		lblNewLabel_19.setIcon(new ImageIcon("C:\\Users\\victo\\Desktop\\JAVA BOOTCAMP\\juegotresenraya\\imagenestresenraya\\Xedit.png"));
		panel_11.add(lblNewLabel_19);
		*/
		JLabel lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setBounds(20, 11, 117, 136);
		lblNewLabel_18.setIcon(new ImageIcon("C:\\Users\\victo\\Desktop\\JAVA BOOTCAMP\\juegotresenraya\\imagenestresenraya\\circuloedit.png"));
		panel_11.add(lblNewLabel_18);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
