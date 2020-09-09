package LibrarySystem;

import java.util.Scanner;

public class Library {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int menu;

        while (true) {

            System.out.println("WELCOME IN THE LIBRARY SYSTEM");
            System.out.println("Please choose one of the following menu options");
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("1 - See all books in library, if you want to borrow one please login to the system");
            System.out.println("2 - Add new reader account");
            System.out.println("3 - Login as a reader");
            System.out.println("4 - For library workers");
            System.out.println("5 - Close the Library System");
            System.out.println("----------------------------------------------------------------------------------");

            menu = sc.nextInt();

            if (menu == 4) {

                System.out.println("Choose one of the following option:");
                System.out.println("-----------------------------");
                System.out.println("1 - Add new worker accout");
                System.out.println("2 - Login to worker accout");
                System.out.println("3 - Back to the main manu");
                System.out.println("-----------------------------");

                menu = sc.nextInt();

                if (menu == 1){
                    // add worker
                }
                if (menu == 2){

                    // login as a worker
                }

                if (menu == 3 ){
                    continue;
                }

            }

            if (menu == 5) {
                System.out.println("Thank you for your visit in our Library System");
                System.out.println("See you next time!!!");

                break;

            }

        }

    }
}
