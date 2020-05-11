package javaclass;
//1. Scrieti un program care pentru un sir de caratectere, afiseaza numarul de aparitii al unui caracter dat.
public class Main {

    public static void main(String[] args) {
    String cuvant = "fbabfkfbkafbakfa";


    int contor=0;
    for (int i=0;i<cuvant.length() ;i++){
        if(cuvant.charAt(i) == 'A' || cuvant.charAt(i)=='a')
            contor++;
    }
        System.out.println("Litera 'a' apare de " + contor +" ori");
    }
}
