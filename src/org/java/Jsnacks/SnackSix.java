package org.java.Jsnacks;

import java.util.Scanner;

//Stampa il cubo dei primi N numeri, dove N è un numero indicato dall’utente.
public class SnackSix {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("inserisci il numero");
        int numero = scanner.nextInt();
        int i=0;
        while (i<numero){
            double cubo = Math.pow(i+1, 3);
            System.out.println("il cubo di "+ (i+1) + " è : " + cubo );
            i++;
        }

    }
}
