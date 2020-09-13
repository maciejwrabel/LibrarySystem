package LibrarySystem;

import java.io.IOException;
import java.util.Scanner;

public class Library {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String workerList = "C:\\Users\\agata\\Desktop\\MACIEK JAVA\\Projekt ALX\\src\\LibrarySystem\\LibraryWorkers";
        //CompanyController newController = new CompanyController();
        LibraryEngine newFunction = new LibraryEngine();


        int menu;
        String name, surname, login, password;

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

                while (true) {

                    System.out.println("Choose one of the following option:");
                    System.out.println("-----------------------------");
                    System.out.println("1 - Add new worker accout");
                    System.out.println("2 - Login to worker accout");
                    System.out.println("3 - Show library workers list");// in future this function will be available for admin only
                    System.out.println("4 - Back to the main manu");
                    System.out.println("-----------------------------");

                    menu = sc.nextInt();

                    if (menu == 1) { // adding new library worker

                        System.out.print("put name: ");
                        sc.nextLine();
                        name = sc.nextLine();
                        System.out.print("put surname: ");
                        surname = sc.nextLine();
                        System.out.print("put your login: ");
                        login = sc.nextLine();
                        System.out.print("password: ");
                        password = sc.nextLine();

                        newFunction.addLibraryWorker(name, surname, login, password, workerList);

                    } else if (menu == 2) { //login process

                        System.out.print("Put your login: ");
                        sc.nextLine();
                        login = sc.nextLine();
                        System.out.print("Put your password: ");
                        password = sc.nextLine();

                        newFunction.loginProcess(workerList);

                    } else if (menu == 3) {

                        newFunction.showLibraryWorkers(workerList);
                    } else if (menu == 4) {
                        break;
                    }
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


//prepare statuses for workers (for example normal worker, admin, owner of the library (different accesses))
