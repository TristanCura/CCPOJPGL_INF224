import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;

public class LibrarianLogin {

	private JFrame frmLibrarianLogin;
	private JTextField txtusername;
	private JPasswordField txtpassword;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public LibrarianLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLibrarianLogin = new JFrame();
		frmLibrarianLogin.setTitle("Librarian Login");
		frmLibrarianLogin.setBounds(100, 100, 450, 300);
		frmLibrarianLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLibrarianLogin.setVisible(true);
		
		JLabel lblAdminLogin = new JLabel("Librarian Login");
		lblAdminLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminLogin.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		txtusername = new JTextField();
		txtusername.setColumns(10);
		
		txtpassword = new JPasswordField();
		txtpassword.setColumns(10);
		
		JButton btnNewButton = new JButton("Return");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLibrarianLogin.dispose();
				LoginMenu lm = new LoginMenu();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianAccounts acc1 = new LibrarianAccounts();
				LibrarianAccounts acc2 = new LibrarianAccounts();
				LibrarianAccounts acc3 = new LibrarianAccounts();
				
				acc1.setUsername("Librarian_01");
				acc1.setPassword("LibrarianOne");
				acc2.setUsername("Librarian_02");
				acc2.setPassword("LibrarianTwo");
				acc3.setUsername("Librarian_03");
				acc3.setPassword("LibrarianThree");
				
				try {
					String un = txtusername.getText();
					String pw = txtpassword.getText();
					boolean isLoginSuccess = false;
					
					if(un.equals(acc1.getUsername()) && pw.equals(acc1.getPassword())) {
						isLoginSuccess = true;
						frmLibrarianLogin.dispose();
						LibrarianMenu am = new LibrarianMenu();
					}
					else if(un.equals(acc2.getUsername()) && pw.equals(acc2.getPassword())) {
						isLoginSuccess = true;
						frmLibrarianLogin.dispose();
						LibrarianMenu am = new LibrarianMenu();
					}
					else if(un.equals(acc3.getUsername()) && pw.equals(acc3.getPassword())) {
						isLoginSuccess = true;
						frmLibrarianLogin.dispose();
						LibrarianMenu am = new LibrarianMenu();
					}
					
					if (!isLoginSuccess) {
						 JOptionPane.showMessageDialog(null, "USER DOES NOT EXIST", "Login Error", JOptionPane.WARNING_MESSAGE);
					}
					else {
						 JOptionPane.showMessageDialog(null, "SUCCESSFULLY LOGIN", "Login Sucess", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		GroupLayout groupLayout = new GroupLayout(frmLibrarianLogin.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAdminLogin, GroupLayout.PREFERRED_SIZE, 436, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(56)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtusername, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtpassword, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(90)
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
									.addGap(77)
									.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)))))
					.addGap(182))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblAdminLogin)
					.addGap(46)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtusername, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtpassword, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(52, Short.MAX_VALUE))
		);
		frmLibrarianLogin.getContentPane().setLayout(groupLayout);
	}

}
