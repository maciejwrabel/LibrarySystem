package LibrarySystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LibraryEngine {

    boolean loginStatus = false;

    public void addLibraryWorker(String name, String surname, String login, String password, String workerList) throws IOException {

        FileWriter newLibraryWorker = new FileWriter(workerList, true);
        newLibraryWorker.append(name + " / " + surname + " / " + login + " / " + password + "\n");
        newLibraryWorker.close();
    }

    public void showLibraryWorkers(String workerList) throws FileNotFoundException {

        File file = new File(workerList);
        Scanner showWorkers = new Scanner(file);

        while (showWorkers.hasNextLine()) {
            String line = showWorkers.nextLine();
            String[] linesTable = line.split(" / ");// what kind of separator? put in brackets
            System.out.println("name: " + linesTable[0] + ", surname: " + linesTable[1] + ", login: " + linesTable[2] +
                    ", password: " + linesTable[3]);
        }

    }

    public void loginProcess(String login, String password, String workerList) throws FileNotFoundException {

        File file = new File(workerList);
        Scanner loginProcess = new Scanner(file);

        while (loginProcess.hasNextLine()) {

            String line = loginProcess.nextLine();
            String[] loginAndpasswordTable = line.split(" / ");

            if (loginAndpasswordTable[2].equals(login)) {
                if (loginAndpasswordTable[3].equals(password)) {

                    System.out.println("Hello " + loginAndpasswordTable[0] + " " + loginAndpasswordTable[1]);
                    System.out.println("Please choose one of the following menu option: ");

                    loginStatus = true;
                    System.out.println(loginStatus);

                    break;

                } else{
                    System.out.println("Unknown");
                }
                }else {
                System.out.println("Unknown login or password, please try again");
                break;

            }
        }

    }
}



