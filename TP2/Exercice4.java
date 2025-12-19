package TP2;
import java.util.Scanner;


public class Exercice4{
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        
        System.out.print("Entrez la première valeur : ");
        int a = clavier.nextInt();
        
        System.out.print("Entrez la deuxième valeur : ");
        int b = clavier.nextInt();
        
        int maximum = Math.max(a, b);
        
        System.out.println("Le maximum est : " + maximum);
        
        clavier.close();
    }
}