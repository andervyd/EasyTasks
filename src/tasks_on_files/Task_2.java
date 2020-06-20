/**
 * Задачи по программированию. Файлы
 * http://www.itmathrepetitor.ru/prog/zadachi-na-fajjly/
 */

package tasks_on_files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

class DelNumber {
    /**
     * Дан текстовый файл, содержащий целые числа. Удалить из него все четные числа.
     */

    String puth;
    String nameFile;
    String fileExtension;

    public void createFile (String puth, String nameFile, String fileExtension) {
        this.puth = puth;
        this.nameFile = nameFile;
        this.fileExtension = fileExtension;

        try {
            File file = new File(puth + nameFile + "." + fileExtension);
            if(file.exists()) {
                file.createNewFile();
                System.out.println("Create: " + nameFile + "." + fileExtension);
            }
            PrintWriter readFile = new PrintWriter(file);
            int[] arrInt = new int[100];
            for(int i = 0; i < arrInt.length; i++) {
                arrInt[i] =  (int) (Math.random() * 20);
                readFile.print(arrInt[i] + " ");
            }
            readFile.close();
        } catch (IOException e) {
            System.out.println("Error: " + e) ;
        }
    }

    public void delNumber(String puth, String nameFile, String fileExtension) {
        this.puth = puth;
        this.nameFile = nameFile;
        this.fileExtension = fileExtension;

        try {
            File newFile = new File(puth + "newNumber" + "." + fileExtension);
            PrintWriter writerChangeFile = new PrintWriter(newFile);

            FileReader readFile = new FileReader(puth + nameFile + "." + fileExtension);
            Scanner scanner = new Scanner(readFile);

            while(scanner.hasNextInt()) {

                int tempInt = scanner.nextInt();
                if(tempInt % 2 != 0) {
                    writerChangeFile.print(tempInt + " ");
                    System.out.println("Number "+ tempInt);
                }
            }
            scanner.close();
            writerChangeFile.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}



class OutputDate {
    public static void main(String[] args) {
// Task 1
        DelNumber delNumber = new DelNumber();

        System.out.println("Task 1:");
        delNumber.createFile("w:\\JAVA\\!TEMP\\EasyTasks\\src\\access\\","numbers", "txt");

        delNumber.delNumber("w:\\JAVA\\!TEMP\\EasyTasks\\src\\access\\","numbers", "txt");
    }
}


