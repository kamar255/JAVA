package TP2;

public class Exercice2 {
    public static void main(String[] args) {
   
        int x = 5;
        int y = 10;
        int z;
        int compteur = 15;
        int total = 100;
        int q = 17;
        int diviseur = 5;
        int somme;
        z = x++ + y;
        if (compteur > 10) {
            System.out.println("compteur est plus grand que 10");
        }
        total -= --x;
        q = q % diviseur;       // première manière
        // q %= diviseur;       // deuxième manière 
        x = 1;
        somme = 0;
        while (x < 11) {
            somme += x;

            x++;
        }

        System.out.println("la somme vaut : " + somme);
        System.out.println("z = " + z);
        System.out.println("total après opération = " + total);
        System.out.println("q après modulo = " + q);
    }
}
