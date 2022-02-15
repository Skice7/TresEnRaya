package com.victor.MiProyecto2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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
	private JTextField txtAsda;
	private JTextField textField;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(245, 261, -83, -52);
		contentPane.add(layeredPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(324, 11, 319, 406);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Nueva Partida");
		btnNewButton.setBounds(111, 21, 101, 23);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(20, 113, 278, 124);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Jugador 1");
		lblNewLabel.setBounds(10, 11, 63, 23);
		panel_1.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 45, 63, 23);
		panel_1.add(lblNombre);
		
		txtAsda = new JTextField();
		txtAsda.setBounds(58, 46, 86, 20);
		panel_1.add(txtAsda);
		txtAsda.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo:");
		lblNewLabel_1.setBounds(10, 79, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Humano");
		rdbtnNewRadioButton.setBounds(52, 75, 65, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnCpu = new JRadioButton("Cpu");
		rdbtnCpu.setBounds(119, 75, 79, 23);
		panel_1.add(rdbtnCpu);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1_1.setBounds(20, 248, 278, 124);
		panel.add(panel_1_1);
		
		JLabel lblJugador = new JLabel("Jugador 2");
		lblJugador.setBounds(10, 11, 63, 23);
		panel_1_1.add(lblJugador);
		
		JLabel lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setBounds(10, 45, 63, 23);
		panel_1_1.add(lblNombre_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(58, 46, 86, 20);
		panel_1_1.add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tipo:");
		lblNewLabel_1_1.setBounds(10, 79, 46, 14);
		panel_1_1.add(lblNewLabel_1_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Humano");
		rdbtnNewRadioButton_1.setBounds(52, 75, 65, 23);
		panel_1_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnCpu_1 = new JRadioButton("Cpu");
		rdbtnCpu_1.setBounds(119, 75, 79, 23);
		panel_1_1.add(rdbtnCpu_1);
		
		JLabel lblNewLabel_2 = new JLabel("Aquí ponemos de quien es el turno");
		lblNewLabel_2.setBounds(31, 73, 248, 14);
		panel.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(10, 11, 304, 406);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(3, 3, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 55));
		
		JLabel lblNewLabel_4_8 = new JLabel("New label");
		panel_4.add(lblNewLabel_4_8);
		
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5);
		panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 55));
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		panel_5.add(lblNewLabel_4);
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 55));
		
		JLabel lblNewLabel_4_1 = new JLabel("New label");
		panel_3.add(lblNewLabel_4_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setToolTipText("");
		panel_2.add(panel_6);
		panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 55));
		
		JLabel lblNewLabel_4_2 = new JLabel("New label");
		panel_6.add(lblNewLabel_4_2);
		
		JPanel panel_7 = new JPanel();
		panel_2.add(panel_7);
		panel_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 55));
		
		JLabel lblNewLabel_4_4 = new JLabel("New label");
		panel_7.add(lblNewLabel_4_4);
		
		JPanel panel_8 = new JPanel();
		panel_2.add(panel_8);
		panel_8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 55));
		
		JLabel lblNewLabel_4_3 = new JLabel("New label");
		panel_8.add(lblNewLabel_4_3);
		
		JPanel panel_9 = new JPanel();
		panel_2.add(panel_9);
		panel_9.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 55));
		
		JLabel lblNewLabel_4_5 = new JLabel("New label");
		panel_9.add(lblNewLabel_4_5);
		
		JPanel panel_10 = new JPanel();
		panel_2.add(panel_10);
		panel_10.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 55));
		
		JLabel lblNewLabel_4_6 = new JLabel("New label");
		panel_10.add(lblNewLabel_4_6);
		
		JPanel panel_11 = new JPanel();
		panel_2.add(panel_11);
		panel_11.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 55));
		
		JLabel lblNewLabel_4_7 = new JLabel("New label");
		panel_11.add(lblNewLabel_4_7);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
