package fmi.java.exam;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static int FileReader() {
        int numberOfLines=0;
        File file = new File("src/fmi/java/exam/Vehicles.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);

            // Проверява дали има още линии

            while(sc.hasNextLine()){
                String str = sc.nextLine();
                GoTroughEveryLine(str);
                numberOfLines++;
            }

        } catch (IOException  exp) {
            exp.printStackTrace();
        }

        sc.close();
        return numberOfLines;
    }

    public static void GoTroughEveryLine(String str){
        String type,brand,model, colour, carType,availability,productionYear,availableDoors,availableSeats,maxWeight,weight;
        Scanner sc = new Scanner(str);
        sc.useDelimiter("[;]");

        /*
        Ако може който го проверява, ако има време, да ми каже къде бъркам тука щото 2 часа на тва седях.
        Опитах се да прочета нещата от файла и след това по някъкъф начин да ги попълна в vehicleList, ама до попълване
        не се стигна...
         */
        while(sc.hasNext()){
            type = sc.next();
            brand = sc.next();
            model = sc.next();
            colour = sc.next();
            productionYear = sc.next();
            availability = sc.next();
                if(type.equals("Car")){
                availableDoors = sc.next();
                availableSeats= sc.next();
                }

                else if(type.equals("Truck")){
                maxWeight = sc.next();
                weight = sc.next();
                }

        }
        sc.close();
    }
}