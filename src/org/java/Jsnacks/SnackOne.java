package org.java.Jsnacks;

import java.util.Scanner;

//Snack1
//L’utente inserisce due numeri in successione. Il software stampa il maggiore.
public class SnackOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // inserire il primo numero

        System.out.print("inserisci il primo numero");
        int numeroUno = scanner.nextInt();

        // inserire il secondo numero

        System.out.println("inserisci il secondo numero");
        int numeroDue = scanner.nextInt();


        // condizioni
        if(numeroUno > numeroDue){
            System.out.println(numeroUno +" maggiore di "+ numeroDue);
        } else if (numeroUno < numeroDue ) {
            System.out.println(numeroUno +" minore di "+ numeroDue);
        }else{
            System.out.println("i numeri sono uguali");
        }
scanner.close();
    }
}
