package org.example.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Long id;
    @Column
    double solde;
    @Temporal(TemporalType.DATE)
    @Column
    Date dateCreation;
    @Column
    @Enumerated(EnumType.STRING)
    TypeCompte type;
    @Column
    @Enumerated(EnumType.STRING)
    etatCompte etat;
}
