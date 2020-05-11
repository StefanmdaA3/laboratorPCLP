package com.company;

//2. Se consideră un set de 49 numere. Calculatorul va extrage aleator  6 numere din setul de mai sus,
//   şi va afisa aceste 6 numere în ordine crescătoare. Se va folosi sortarea prin selecţie.

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	int[] set = new int[49];
        for (int i = 0; i < 49 ; i++) {
            Random random = new Random();
            set[i] = random.nextInt(100);
        }

        set = Sort.selection_sort(set);

        for (int i = 0; i < 6 ; i++) {
            System.out.format("%d ", set[i]);
        }
    }
}
