package company;

import java.util.Scanner;

public class Person {
    Scanner s = new Scanner(System.in);
    String[] Nume = new String[20];
    String[] Adresa = new String[20];
    double[] Factura = new double[20];

    public void initializare(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Nume:");
            Nume[i] = s.next();
            System.out.print("Adresa:");
            Adresa[i] = s.next();
            System.out.print("Factura:");
            Factura[i] = s.nextDouble();
        }
    }

    public void Afisare(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Nume:" + Nume[i]+"\n");
            System.out.print("Adresa:" + Adresa[i]+"\n");
            System.out.print("Factura:" + Factura[i]+"\n");
        }
    }

    public void QuickSort(int left, int right) {
        int  i, j;
        String w1,w2;
        double x,w;
        i = left;
        j = right;
        x = Factura[(i + j) / 2];
        do {
            while (Factura[i] > x) {
                i = i + 1;
            }
            while (x > Factura[j]) {
                j = j - 1;
            }
            if (i <= j) {
                w =  Factura[i];
                Factura[i] = Factura[j];
                Factura[j] = w;

                w1= Nume[i];
                Nume[i]=Nume[j];
                Nume[j]= w1;
                w2=Adresa[i];
                Adresa[i]= Adresa[j];
                Adresa[j]=w2;

                i = i + 1;
                j = j - 1;
            }
        } while (i <= j);
        if (left < j) {
            QuickSort(left, j);
        }
        if (i < right) {
            QuickSort(i, right);
        }

    }
    public void afisareQuickSort(int n){
        System.out.println("Abonatii cu cele mai mari facturi sunt:\n");
        for(int i=0;i<n;i++){
            System.out.print("**Nume:"+Nume[i]+"\n");
            System.out.print("**Adresa:"+Adresa[i]+"\n");
            System.out.print("**Factura:"+Factura[i]+"\n");
        }
    }
}
