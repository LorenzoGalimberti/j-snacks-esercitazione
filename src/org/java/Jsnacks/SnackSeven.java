package org.java.Jsnacks;

public class SnackSeven {

    public static void main(String[] args) {
        double risultato=0;
        int i=1;
        while(risultato<1000){
            risultato=Math.pow(2,i);
            if (risultato<1000){
                System.out.println(risultato);
            }

            i++;
        }
    }
}
