import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner sc = new Scanner(System.in);
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

        Contact c = new Contact();
        c.firstname = firstname;
        c.lastname = lastname;
        c.address = address;
        c.city = city;
        c.state = state;
        c.zip = zip;
        c.phoneno = phoneno;
        c.email = email;
    }
}