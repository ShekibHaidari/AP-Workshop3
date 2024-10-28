import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook froghi_phone_book = new PhoneBook();
        Scanner sc = new Scanner(System.in);

        while (true){
            menu();
            int choice = sc.nextInt();
            if (choice == 1){
                System.out.println("please choose one Groub");
                String groub = sc.next();

                System.out.println("PLeease enter Fist name and Last name");
                String fistName = sc.next();
                String lastName = sc.next();

                System.out.println("PLeease enter pre code Country: ");
                String country_pre_code = sc.next();
                System.out.println("PLeease enter Phone Number: ");
                String phoneNumber = sc.next();

                System.out.println("please enter an email Addrees not avilabale enter 0");
                String email = sc.next();

                System.out.println("PLeease enter zip_code : (if dosent exsit enter 0) ");
                String zipCode = sc.next();
                System.out.println("PLeease enter Country name : ");
                String countryName = sc.next();
                System.out.println("PLeease enter city name  : ");
                String cityName = sc.next();
                Address a1 = new Address(zipCode,countryName,cityName);
                PhoneNumber ph = new PhoneNumber(country_pre_code,phoneNumber);
                Contact c1 = new Contact(groub,email,fistName,lastName,ph,a1);
                froghi_phone_book.addContact(c1);
            }
            else if (choice == 2){
                System.out.println("Plaese enter the name and last name of contact that you want to remove from list: ");
                String name = sc.next();
                String lastName = sc.next();
                if(froghi_phone_book.deleteContact(name,lastName)){
                    System.out.println("Contact removed");
                    froghi_phone_book.deleteContact(name,lastName);
                }else {
                    System.out.println("Contact not found");
                }
            } else if (choice == 3) {
                System.out.println("please choose one Groub");
                String groub = sc.next();
                froghi_phone_book.printContacts();
            } else if (choice == 4) {
               System.out.println(froghi_phone_book.toString());
               //System.out.println(froghi_phone_book.printContacts());
            }else if (choice == 5) {
                System.out.println("Goooooooooooood luck");
                System.gc();
                break;

            }

        }
    }


    public static void menu(){
        System.out.println("Welcome to Phone Book");
        System.out.println("PLease choese one item:  ");
        System.out.println("1. Add a new item");
        System.out.println("2. Delete item");
        System.out.println("3. Display all information aboud one contact: ");
        System.out.println("4. Show the name of all contact: ");
        System.out.println("5. Exit");
    }
}
