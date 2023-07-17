package org.java.Jsnacks;

import java.util.Random;
import java.util.Scanner;

//Genera un array di 10 numeri interi random compresi tra 0 e 100. L’utente inserisce un numero e
// il programma gli risponde se il numero è presente nell’array oppure no.
public class SnackFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci il  numero");
        int numeroUtente = scanner.nextInt();
        boolean presente=false;
        Random random= new Random();
        int[] array= new int[10];
        for (int i = 0; i < array.length; i++) {
            // numero randomico da 0 a 100
            int randomNumber = random.nextInt(101); // Genera un numero casuale compreso tra 0 e 100
            array[i]=randomNumber;

            if (randomNumber==numeroUtente){
                presente=true;
                break;
            }

        }

        if(presente){
            System.out.println("numero presente");
        }else{
            System.out.println("non presente");
        }

    }


}
