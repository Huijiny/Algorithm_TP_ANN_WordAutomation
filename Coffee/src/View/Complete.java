package View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Design.RoundedButton;

import javax.swing.JLabel;
import javax.swing.JButton;

public class Complete extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Complete frame = new Complete();
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
	public Complete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(242,238,229));///����
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("�ֹ� �Ϸ�");
		lblNewLabel.setBounds(161, 61, 321, 70);
		Font bold_ac = new Font("���� ���",Font.BOLD,50);
		lblNewLabel.setForeground(new Color(79,79,79));///���� ��Ʈ��
		lblNewLabel.setFont(bold_ac);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblNewLabel);
		
		RoundedButton btnNewButton = new RoundedButton("ù ��������");
		btnNewButton.setBounds(161, 185, 314, 156);
		contentPane.add(btnNewButton);
	}

}
