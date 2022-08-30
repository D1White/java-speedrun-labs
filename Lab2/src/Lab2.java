// Task 1
import java.util.ArrayList;
import java.util.Scanner;


class JournalEntry {
	private String firstName;
	private String lastName;
	private String birthday;
	private String phone;
	private String address;
	
	public JournalEntry(String firstName, String lastName, String birthday, String phone, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.phone = phone;
		this.address = address;
	}
	
	public void print() {
		System.out.println(this.firstName + " " + this.lastName);
		System.out.println("Birthday: " + this.birthday);
		System.out.println("Phone: " + this.phone);
		System.out.println("Address: " + this.address);
		System.out.println("=========================");
	}
}

public class Lab2 {
	public static void main(String[] args) {
			String[] options = {
					"1- Add new enty",
	                "2- View entries",
	                "3- Exit",
			};
		    Scanner scanner = new Scanner(System.in);
		    int option = 1;
		    
		    ArrayList<JournalEntry> entries = new ArrayList<JournalEntry>();
		  
		    while (option != 3){
	            printMenu(options);
	            try {
	                option = scanner.nextInt();
	                switch (option){
	                    case 1: create(entries); break;
	                    case 2: view(entries); break;
	                    case 3: System.exit(0);
	                }
	            }
	            catch (Exception ex){
	                System.out.println("Please enter an integer value between 1 and " + options.length);
	                scanner.next();
	            }
	        }
	}
	
	public static void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }
	
	private static void create(ArrayList<JournalEntry> entries) {
		String firstName = "";
		String lastName = "";
		String birthday = "";
		String phone = "";
		String address = "";
		
		Scanner scanner = new Scanner(System.in);
		
		while (firstName.length() < 3) {
			System.out.print("First name: ");
			firstName = scanner.nextLine();
			if (firstName.length() < 3) {
				System.out.println("Please enter correct data");
			}
		}
		
		while (lastName.length() < 3) {
			System.out.print("Last name: ");
			lastName = scanner.nextLine();
			if (lastName.length() < 3) {
				System.out.println("Please enter correct data");
			}
		}
		
		while (birthday.length() != 10) {
			System.out.print("Birthday: ");
			birthday = scanner.nextLine();
			if (birthday.length() != 10) {
				System.out.println("Please enter correct data (dd.mm.yyy)");
			}
		}
		
		while (phone.length() < 10 || phone.length() > 13) {
			System.out.print("Phone: ");
			phone = scanner.nextLine();
			if (phone.length() < 10 || phone.length() > 13) {
				System.out.println("Please enter correct data");
			}
		}
		
		while (address.length() < 5) {
			System.out.print("Adress: ");
			address = scanner.nextLine();
			if (address.length() < 5) {
				System.out.println("Please enter correct data");
			}
		}
		
		
		JournalEntry newEntry = new JournalEntry(firstName, lastName, birthday, phone, address);
		entries.add(newEntry);
    }
	
	private static void view(ArrayList<JournalEntry> entries) {
        System.out.println("Journal entries (" + entries.size() + "):");
        entries.forEach((entry) -> entry.print());
    }
}



