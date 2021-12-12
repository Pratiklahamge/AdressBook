package Com.Bridgelabz;

import java.util.Scanner;

	 class AppAddressBookMain extends Contacts {

		public AppAddressBookMain() {
			
		}
	 
		public static void main(String[] args) {
			System.out.println("***********************************************\n          Welcome To Address Book\n***********************************************\n");

			AppAddressBookMain appAddressBookMain = new AppAddressBookMain();



		
			Contacts Contacts = appAddressBookMain.createContact();
	
		}

		private Contacts createContact() {
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter First Name: ");
			String firstName = scanner.nextLine();

			System.out.print("Enter Last Name: ");
			String lastName = scanner.nextLine();

			System.out.print("Enter Address: ");
			String address = scanner.nextLine();

			System.out.print("Enter City: ");
			String city = scanner.nextLine();

			System.out.print("Enter State: ");
			String state = scanner.nextLine();

			System.out.print("Enter ZipCode: ");
			String zipcode = scanner.nextLine();

			System.out.print("Enter Phone Number: ");
			String number = scanner.nextLine();

			System.out.print("Enter Email id: ");
			String email = scanner.nextLine();

			return new Contacts();
}}

