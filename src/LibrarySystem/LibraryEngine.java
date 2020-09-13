package LibrarySystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LibraryEngine {

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

    public void loginProcess(String workerList) throws FileNotFoundException {

        File file = new File(workerList);
        Scanner loginProcess = new Scanner(file);

        while (loginProcess.hasNextLine()) {

            String line = loginProcess.nextLine();
            String [] loginAndpasswordTable = line.split(" / ");

            System.out.println(loginAndpasswordTable[2]); // teraz pokzuje wszystkie loginy,
            // trzeba zrobic tak żęby przejrzał wszystkie loginy i dopasował do tego co podaliśmy
            //jeżeli sie zgadza to dalej pyta o hasło
            //jeżeli dalej się zgadza to wyświetla kolejne menu dla danego pracownika
        }

/*
 public void showLibraryWorkers(String workerList) throws FileNotFoundException {

        File file = new File(workerList);
        Scanner showWorkers = new Scanner(file);

        while (showWorkers.hasNextLine()) {
            String line = showWorkers.nextLine();
            String[] linesTable = line.split(" / ");// what kind of separator? put in brackets
            System.out.println("name: "+ linesTable[0] + ", surname: " + linesTable[1] + ", login: " + linesTable[2] +
                    ", password: " + linesTable[3]);
        }

    }
 */

    }


}
