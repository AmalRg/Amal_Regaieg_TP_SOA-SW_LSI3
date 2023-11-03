package service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'une instance de la classe BanqueService
        BanqueService banqueService = new BanqueService();

        // Lecture du montant à convertir depuis l'utilisateur
        Scanner Scanner = new Scanner(System.in);
        
        System.out.print("Entrez le montant en dinars tunisien : ");
        double montantEnDinar = Scanner.nextDouble();
		
        // Appel de la méthode conversion pour effectuer la conversion
        double montantConverti = banqueService.conversion(montantEnDinar);

        // Affichage du résultat
        System.out.println("Le montant est : " + montantConverti);
    }
}

