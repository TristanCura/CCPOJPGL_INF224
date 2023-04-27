import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class LibrarianMenu {

	private JFrame frmBookRental;
	private JTextField textField;

	private ArrayList<Books> books = new ArrayList<>();
	Books book1 = new Books();
	Books book2 = new Books();
	Books book3 = new Books();

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public LibrarianMenu() {
		book1.name = "System Analysis and Design";
		book1.author = "Gary B. Shelly";
		book1.copy = 2;

		book2.name = "Android Application";
		book2.author = "Corinne Hoisington";
		book2.copy = 3;

		book3.name = "Programming Concepts and Logic Formulation";
		book3.author = "Rosario E. Manuel";
		book3.copy = 4;

		books.add(book1);
		books.add(book2);
		books.add(book3);

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBookRental = new JFrame();
		frmBookRental.setTitle("Book Rental");
		frmBookRental.setBounds(100, 100, 805, 538);
		frmBookRental.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("Book Rental System");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		frmBookRental.getContentPane().add(lblNewLabel, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		frmBookRental.getContentPane().add(panel, BorderLayout.SOUTH);

		JLabel lblNewLabel_1 = new JLabel("Author");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		JLabel lblNewLabel_2 = new JLabel("Book Title");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		JLabel lblNewLabel_3 = new JLabel("Available Copies");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		JLabel lblNewLabel_4 = new JLabel("Index");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		JLabel lblNewLabel_5 = new JLabel("Enter Book Index:");
		lblNewLabel_5.setToolTipText("");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		textField = new JTextField();
		textField.setToolTipText("Enter the book index here and press submit to rent the book.");
		textField.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("0");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		JLabel lblNewLabel_6_1 = new JLabel("1");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		JLabel lblNewLabel_6_1_1 = new JLabel("2");
		lblNewLabel_6_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		JLabel lblNewLabel_7 = new JLabel("Gary B. Shelly");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		JLabel lblNewLabel_7_1 = new JLabel("Corinne Hoisington");
		lblNewLabel_7_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		JLabel lblNewLabel_7_1_1 = new JLabel("Rosario E. Manuel");
		lblNewLabel_7_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		JLabel lblNewLabel_8 = new JLabel("System Analysis and Design");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		JLabel lblNewLabel_8_1 = new JLabel("Android Application");
		lblNewLabel_8_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		JLabel lblNewLabel_8_1_1 = new JLabel("Programming Concepts and Logic Formulation");
		lblNewLabel_8_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		JLabel lblNewLabel_9 = new JLabel();
		lblNewLabel_9.setText(String.valueOf(book1.getCopy()));
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		JLabel lblNewLabel_9_1 = new JLabel();
		lblNewLabel_9_1.setText(String.valueOf(book2.getCopy()));
		lblNewLabel_9_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		JLabel lblNewLabel_9_1_1 = new JLabel();
		lblNewLabel_9_1_1.setText(String.valueOf(book3.getCopy()));
		lblNewLabel_9_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		JSeparator separator = new JSeparator();

		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBookRental.dispose();
				LoginMenu lm = new LoginMenu();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int index = Integer.parseInt(textField.getText());
					Books _book = books.get(index);
					int copy = _book.getCopy();

					if (copy > 0) {
						JOptionPane.showMessageDialog(null, "YOU RENTED: " + books.get(index).getName(), "Rent Success", JOptionPane.INFORMATION_MESSAGE);
						_book.setCopy(copy -= 1);
						lblNewLabel_9.setText(String.valueOf(book1.getCopy()));
						lblNewLabel_9_1.setText(String.valueOf(book2.getCopy()));
						lblNewLabel_9_1_1.setText(String.valueOf(book3.getCopy()));
						
					} else {
						JOptionPane.showMessageDialog(null, "NO COPIES AVAILABLE", "Login Error",
								JOptionPane.WARNING_MESSAGE);
					}

				} catch (IndexOutOfBoundsException e1) {
					JOptionPane.showMessageDialog(null, "INDEX DOES NOT EXIST", "Index Error",JOptionPane.WARNING_MESSAGE);
				} catch (InputMismatchException e2) {
					JOptionPane.showMessageDialog(null, "INPUT MISMATCH", "Input Error", JOptionPane.WARNING_MESSAGE);
				} catch (NumberFormatException e3) {
					JOptionPane.showMessageDialog(null, "FORMAT ERROR", "Format Error", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup().addGap(247).addComponent(lblNewLabel_5)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnNewButton)
						.addContainerGap(292, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup().addGap(32).addGroup(gl_panel
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel.createSequentialGroup()
										.addComponent(separator, GroupLayout.PREFERRED_SIZE, 706,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblNewLabel_6_1_1, GroupLayout.PREFERRED_SIZE, 45,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
								.addGroup(gl_panel.createSequentialGroup().addGroup(gl_panel
										.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 45,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_6_1, GroupLayout.PREFERRED_SIZE, 45,
												GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup().addGap(112)
														.addComponent(lblNewLabel_7))
												.addGroup(gl_panel.createSequentialGroup().addGap(101).addGroup(gl_panel
														.createParallelGroup(Alignment.LEADING)
														.addComponent(lblNewLabel_7_1_1, GroupLayout.PREFERRED_SIZE,
																158, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblNewLabel_7_1))))
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup().addGap(53).addComponent(
														lblNewLabel_8_1, GroupLayout.PREFERRED_SIZE, 181,
														GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_panel.createSequentialGroup().addGap(28)
														.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
																.addComponent(lblNewLabel_8).addComponent(
																		lblNewLabel_8_1_1, GroupLayout.PREFERRED_SIZE,
																		221, GroupLayout.PREFERRED_SIZE))
														.addGap(58)
														.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
																.addComponent(lblNewLabel_9_1_1,
																		GroupLayout.PREFERRED_SIZE, 45,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(lblNewLabel_9_1,
																		GroupLayout.PREFERRED_SIZE, 45,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE,
																		45, GroupLayout.PREFERRED_SIZE))))
										.addGap(94))
								.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup().addGroup(gl_panel
										.createParallelGroup(Alignment.TRAILING).addComponent(btnNewButton_1)
										.addGroup(gl_panel.createSequentialGroup().addComponent(lblNewLabel_4)
												.addPreferredGap(ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
												.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 70,
														GroupLayout.PREFERRED_SIZE)
												.addGap(120)
												.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 99,
														GroupLayout.PREFERRED_SIZE)
												.addGap(98).addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 145,
														GroupLayout.PREFERRED_SIZE)))
										.addGap(38))))));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel
				.createSequentialGroup().addGap(21)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_1).addComponent(lblNewLabel_3).addComponent(lblNewLabel_2))
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_6)
						.addComponent(lblNewLabel_7).addComponent(lblNewLabel_8).addComponent(lblNewLabel_9))
				.addGap(50)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_7_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_8_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_9_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addGap(54)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_7_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_8_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_9_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
				.addComponent(
						separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5).addComponent(btnNewButton).addComponent(btnNewButton_1))
				.addGap(21)));
		panel.setLayout(gl_panel);
		frmBookRental.setVisible(true);
	}
}
