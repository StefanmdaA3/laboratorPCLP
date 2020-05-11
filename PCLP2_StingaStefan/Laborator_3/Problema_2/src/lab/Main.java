package lab;

//2. Se citește o frază de la tastatură. Să se creeze un program care afișează toate cuvintele
//găsite în fraza respectivă.  Se va utiliza JAVA class cu metoda noua.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti fraza: \n");
        String fraza = scanner.nextLine();
        Split f = new Split(fraza);

    }
}
