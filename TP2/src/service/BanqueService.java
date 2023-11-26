package service;

import java.util.List;
import java.util.Scanner;

public class BanqueService {
	
	private double res;

    // Méthode pour effectuer la conversion de devises
    public double conversion(double montant) {
    	// Lecture du montant à convertir depuis l'utilisateur
        Scanner Scanner = new Scanner(System.in);
        
        System.out.println("  1 - USD");
        System.out.println("  2 - EUR");
        System.out.println("  3 - JPY");
        System.out.println("  4 - GBP");
        System.out.println("  5 - AUD");
        System.out.println("  6 - CAD");
        System.out.println("  7 - CHF");
        System.out.print("Entrez le numero de la device vers quelle voulez vous convertir : ");
        int device = Scanner.nextInt();
        
    	switch (device) {
		case 1:
			res = montant / 3.18;
			break;
		case 2:
			res = montant / 3.36;
			break;
		case 3:
			res = montant / 0.021;
			break;
		case 4:
			res = montant / 3.85;
			break;
		case 5:
			res = montant / 2.01;
			break;
		case 6:
			res = montant / 2.29;
			break;
		case 7:
			res = montant / 3.52;
			break;
		default:
			break;
		}
    	
    	return res;
    }
    
    private Compte compte;
    private List<Compte> comptes;
    
    public Compte getCompte() {
    	return compte;
    }
    
    public void setCompte(Compte compte) {
    	this.compte = compte;
    }
    
    public List<Compte> getComptes() {
    	return comptes;
    }
    
    public void setComptes(List<Compte> comptes) {
    	this.comptes = comptes;
    }
}
