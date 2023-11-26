package org.example.web;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.entities.Compte;
import org.example.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Component
@Path("/banque")
public class CompteRestJaxRSAPI {
    // Simuler une base de données en mémoire
    @Autowired
    private CompteRepository compteRepository;
    @Path("/comptes")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON})
    @Transactional
    public List<Compte> compteList() {
        return compteRepository.findAll();
    }

    @Path("/comptes/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Compte getOne(@PathVariable("id") Long id) {
        return compteRepository.findById(id).orElse(null);
    }

    @Path("/comptes")
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public void save(@RequestBody Compte compte) {
        compteRepository.save(compte);
    }

    @Path("/comptes/{id}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    public Compte update(Compte compte, @PathVariable("id") Long id) {
        compte.setId(id);
        return compteRepository.save(compte);
    }

    @Path("/comptes/{id}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON})
    public void delete(@PathVariable("id") Long id) {
        compteRepository.deleteById(id);
    }

}
