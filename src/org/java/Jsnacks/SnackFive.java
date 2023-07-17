package org.java.Jsnacks;

import java.util.Scanner;

//Chiedi per 6 volte all’utente di inserire un numero,
// se è dispari il programma mostra questa informazione a video
public class SnackFive {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i <6 ; i++) {
            System.out.print("inserisci il numero "+(i+1)+ " :");
            int numero = scanner.nextInt();

            // è dispari
            if(numero % 2 !=0){
                System.out.println(numero+" è dispari");
            }
        }
    }
}
