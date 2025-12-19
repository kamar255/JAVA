package TP2;

public class Exercice3 {

	    public static void main(String[] args) {
	   
	        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	        int somme = 0;
	        for (int i = 0; i < tab.length; i++) {
	            somme += tab[i];
	        }
	        System.out.println("Somme = " + somme);  
	        int temp;
	        for (int i = 0; i < tab.length / 2; i++) {
	            temp = tab[i];
	            tab[i] = tab[tab.length - 1 - i];
	            tab[tab.length - 1 - i] = temp;
	        }
	  
	        System.out.print("Tableau inversé : ");
	        for (int valeur : tab) {
	            System.out.print(valeur + " ");
	        }
	 
	    }
	}

