package company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        com.company.Array A = new com.company.Array();
        int value;
        System.out.println("Introduceti numarul de elemenete al tabloului: ");
        value = s.nextInt();
        String a;
        int b=1;
        a="A"; /// orice valoare
        while (!a.equals("X") && b!=0) {
            A.MENU();
            a = s.next();
            a=a.toUpperCase();
            switch (a) {
                case "C":
                    A.Initializare(value);
                    System.out.println("A fost initializat tabloul!");
                    System.out.println("Pentru a alege alta varianta apasati 1");
                    b=s.nextInt();
                    if(b!=1){
                        a="X";
                    }
                    break;
                case "V":
                    A.Afisare(value);
                    System.out.println("\nPentru a alege alta varianta apasati 1");
                    b=s.nextInt();
                    if(b!=1){
                        a="X";
                    }
                    break;
                case "R":
                    A.Reinitializaaza(value);
                    System.out.println("Acum tabloul e initializat ca la inceput!");
                    A.Afisare(value);
                    System.out.println("\nPentru a alege alta varianta apasati 1");
                    b=s.nextInt();
                    if(b!=1){
                        a="X";
                    }
                    break;
                case "S":
                    A.Sheelsort(value);
                    System.out.println("\nPentru a alege alta varianta apasati 1");
                    b=s.nextInt();
                    if(b!=1){
                        a="X";
                    }
                    break;
                case "H":
                    A.Heapsort(value);
                    System.out.println("\nPentru a alege alta varianta apasati 1");
                    b=s.nextInt();
                    if(b!=1){
                        a="X";
                    }
                    break;
                case "Q":
                    A.QuickSort(value);
                    System.out.println("\nPentru a alege alta varianta apasati 1");
                    b=s.nextInt();
                    if(b!=1){
                        a="X";
                    }
                    break;
                case "X":
                    System.out.print("Quit!");
                    break;
            }
        }
    }
}
