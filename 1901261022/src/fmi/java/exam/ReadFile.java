package fmi.java.exam;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ReadFile {
 try {
        File file = new File("fmi\\java\\exam\\spravka");
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNext()) {
            Scanner lineScanner = new Scanner(fileScanner.nextLine());
            while (lineScanner.hasNext()) {
                if (lineScanner.) {
                    break;
                } else {
                    lineScanner.next();
                }
            }
            lineScanner.close();
        }
        fileScanner.close();
    } catch (
    FileNotFoundException e) {
        e.printStackTrace();
    }
}
}
}
