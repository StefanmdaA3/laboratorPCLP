package lab;

//3. Sa se creeze o clasa java care seteaza printr-un contructor 2 tipuri de date si le returneaza folosind metodele getter.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati numele studentului");
        String nume = scanner.nextLine();
        System.out.println("Dati varsta studentului");
        int varsta = scanner.nextInt();
        Student s1 = new Student();
        s1.setNume(nume);
        s1.setVarsta(varsta);
        s1.afisare();
    }
}
