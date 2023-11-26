package org.example.Amal_Regaieg_LSI3_SOA_TP6;
import org.example.entities.Compte;
import org.example.entities.TypeCompte;
import org.example.entities.etatCompte;
import org.example.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import java.util.Date;
import java.util.List;
@SpringBootApplication
@EnableJpaRepositories(basePackages = "org.example.repositories")
@EntityScan("org.example.entities")
@ComponentScan("org.example")
public class AmalregaiegLSI3SOATP6Application {
    public static void main(String[] args) {
        SpringApplication.run(AmalregaiegLSI3SOATP6Application.class,args);
    }
    @Bean
    public CommandLineRunner initData(CompteRepository compteRepository) {
        return args -> {
            Compte compte1 = new Compte(null, 2000.0, new Date(), TypeCompte.EPARGNE, etatCompte.ACTIVE);
            Compte compte2 = new Compte(null, 100.0, new Date(), TypeCompte.EPARGNE, etatCompte.CREE);
            Compte compte3 = new Compte(null, 3000.0, new Date(), TypeCompte.COURANT, etatCompte.BLOQUE);
            compteRepository.save(compte1);
            compteRepository.save(compte2);
            compteRepository.save(compte3);
            // Afficahge les soldes des comptes
            System.out.println("Soldes des comptes :");
            List<Compte> comptes = compteRepository.findAll();
            for (Compte compte : comptes) {
                System.out.println("Le compte avec l'ID :" + compte.getId() + " ,Solde =" + compte.getSolde());
            }
        };
    }
}