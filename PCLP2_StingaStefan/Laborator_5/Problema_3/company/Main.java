package company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Person B=new Person();
        int value;
        System.out.print("Introduceti numarul de abonatii:");
        value=s.nextInt();
           B.initializare(value);
           System.out.print("--------------------\n");
           B.Afisare(value);
           B.QuickSort(0,value-1);
           B.afisareQuickSort(3);


    }
}
