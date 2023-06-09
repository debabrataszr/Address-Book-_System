import java.util.Scanner;

public class AddressBook {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        askToUser();
    }

    public static void askToUser() {

        int res = 0;
        while (res != 3) {
            System.out.println("Select an option : ");
            System.out.println("\n1. Add Contact in Address book");
            System.out.println("\n2. Edit Contact in Address book");
            System.out.println("\n3. Exit from the Address book");
            res = sc.nextInt();
            switch (res) {
                case 1:
                    addTheContact();
                    break;
                case 2:
                    editTheContact();
                    break;
                case 3:
                    exitFromAddressbook();
                    break;
                default:
                    break;
            }
        }
    }

    public static void addTheContact() {
        System.out.println("Enter Firstname :");
        String firstname = sc.next();
        System.out.println("Enter Lastname : ");
        String lastname = sc.next();
        System.out.println("Enter Address : ");
        String address = sc.next();
        System.out.println("Enter City : ");
        String city = sc.next();
        System.out.println("Enter State : ");
        String state = sc.next();
        System.out.println("Enter zipcode : ");
        int zip = sc.nextInt();
        System.out.println("Enter Phone no. : ");
        long phoneno = sc.nextLong();
        System.out.println("Enter email : ");
        String email = sc.next();

        System.out.println("DETAILS OF PERSON IS ADDED");
        System.out.println(firstname + " " + lastname + " " + address + " " + city + " " + state + " " + zip + " " + phoneno + " " + email);
        System.out.println("**************************************** CONTACT ADDED SUCCESSFULLY *****************************************");
    }

    public static void editTheContact() {

        System.out.println("Enter Firstname to Edit :");
        String firstname = sc.next();
        System.out.println("Enter Lastname to Edit : +firstname");
        String lastname = sc.next();
        System.out.println("Enter Address to Edit : ");
        String address = sc.next();
        System.out.println("Enter City to Edit : ");
        String city = sc.next();
        System.out.println("Enter State to Edit  : ");
        String state = sc.next();
        System.out.println("Enter zipcode to Edit : ");
        int zip = sc.nextInt();
        System.out.println("Enter Phone no. to Edit : ");
        long phoneno = sc.nextLong();
        System.out.println("Enter email to Edit : ");
        String email = sc.next();

        System.out.println("DETAILS OF PERSON IS EDITED");
        System.out.println(firstname + " " + lastname + " " + address + " " + city + " " + state + " " + zip + " " + phoneno + " " + email);
        System.out.println("**************************************** CONTACT EDITED SUCCESSFULLY *****************************************");
    }

    public static void exitFromAddressbook() {
        System.out.println("************************************************* THE END ***************************************************");
    }
}
