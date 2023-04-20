import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class bookRentalSystem {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();

		Book book1 = new Book();
		book1.name = "System Analysis and Design";
		book1.author = "Gary B. Shelly";
		book1.copy = 2;

		Book book2 = new Book();
		book2.name = "Android Application";
		book2.author = "Corinne Hoisington";
		book2.copy = 3;

		Book book3 = new Book();
		book3.name = "Programming Concepts and Logic Formulation";
		book3.author = "Rosario E. Manuel";
		book3.copy = 4;

		books.add(book1);
		books.add(book2);
		books.add(book3);

		Scanner in = new Scanner(System.in);
		boolean end = false;

		while (end == false) {
			try {
				System.out.println("\n*****************************");
				System.out.println("ELECTRONIC BOOK RENTAL SYSTEM");
				System.out.println("*****************************");

				for (int x = 0; x < books.size(); x++) {
					System.out.print(x);
					System.out.print(" - " + books.get(x).getName() + " - " + books.get(x).getAuthor());
					System.out.println();
				}

				System.out.println("\n*****************************");
				System.out.print("CHOOSE A NUMBER TO RENT A BOOK\n>> ");
				int choice = in.nextInt();
				String s = in.nextLine();

				Book _book = books.get(choice);
				int copy = _book.getCopy();

				if (copy > 0) {
					System.out.println("YOU RENTED: " + books.get(choice).getName());
					_book.setCopy(copy -= 1);
				} else {
					System.out.println("NO COPIES AVAILABLE");
				}

				System.out.print("\nRENT AGAIN? Y/N\n>> ");
				String choiceYN = in.nextLine();
				if (choiceYN.equals("Y") || choiceYN.equals("y")) {
					end = false;
				} else if (choiceYN.equals("N") || choiceYN.equals("n")) {
					end = true;
				}
			} catch (IndexOutOfBoundsException e) {
				System.out.println("\nINVALID CHOICE.");
			} catch (InputMismatchException e) {
				System.out.println("\nINVALID INPUT.");
			}
		}
		System.out.println("PROGRAM END.");
	}
}
