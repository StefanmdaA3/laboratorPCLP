package lab;

//4. Un elev introduce de la tastatura un șir de caractere reprezentând numele unui coleg, iar
//șirul respectiv se stochează într-o variabila c. Scrieți un program care să permită unui alt
//coleg (care nu a văzut șirul introdus de primul elev) să introducă un șir de caractere până
//când ghicește numele introdus de colegul său. La sfârșit, programul trebuie să afișeze din câte
//încercări a reușit al doilea elev să găsească numele introdus de primul elev.
//Sa se utilizeze clase. Sa se implementeze cu recursivitate.

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati numele:");
        String c = scanner.nextLine();
        int contor =0;
        int ok=0;
        do{
            System.out.println("Dati numele:");
            String nume = scanner.nextLine();
            contor++;
            if (c.equals(nume)) {
                System.out.println("Ati ghicit numele din " + contor + " incercari");
                ok=1;
            }
        } while (ok==0);
    }
}
