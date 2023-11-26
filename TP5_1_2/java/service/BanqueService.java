package service;

import metier.Compte;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;

@WebService
public class BanqueService {
    // Liste des comptes enregistrés
    public ArrayList<Compte> comptes = new ArrayList<>();

    // Constructeur par défaut
    public BanqueService() {
    }

    // Méthode pour récupérer la liste des comptes
    @WebMethod
    public ArrayList<Compte> getComptes() {
        comptes.add(new Compte(1, 10, new Date()));
        comptes.add(new Compte(2, 20, new Date()));
        comptes.add(new Compte(3, 30, new Date()));
        return comptes;
    }

    // Méthode de conversion de montant
    @WebMethod
    public double conversion(@WebParam double montant) {
        return montant * 3.3;
    }
}