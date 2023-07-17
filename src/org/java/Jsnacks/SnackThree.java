package org.java.Jsnacks;

import java.util.Scanner;

//Il software deve chiedere per 10 volte all’utente di inserire un numero. Il programma stampa la somma di tutti i numeri inseriti.
public class SnackThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somma=0;
        for (int i = 0; i < 10; i++) {
            System.out.print("inserisci  numero "+(i+1) +" : ");
            int numero = scanner.nextInt();
            somma+=numero;

        }
        System.out.println(somma);
        scanner.close();
    }
}
