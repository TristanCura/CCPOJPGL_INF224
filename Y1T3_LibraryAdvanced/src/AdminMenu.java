import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminMenu {

	private JFrame frmAdminMenu;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public AdminMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdminMenu = new JFrame();
		frmAdminMenu.setTitle("Admin Menu");
		frmAdminMenu.setBounds(100, 100, 450, 300);
		frmAdminMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdminMenu.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Welcome to the \r\nNU Lirbrary System");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAdminMenu.dispose();
				LoginMenu lm = new LoginMenu();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		GroupLayout groupLayout = new GroupLayout(frmAdminMenu.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(75, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(66))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(171)
					.addComponent(btnNewButton)
					.addContainerGap(180, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(72)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		frmAdminMenu.getContentPane().setLayout(groupLayout);
	}

}
