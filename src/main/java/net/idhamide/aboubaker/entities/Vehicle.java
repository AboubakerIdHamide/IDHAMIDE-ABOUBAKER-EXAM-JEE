package net.idhamide.aboubaker.entities;

import jakarta.persistence.*;
import lombok.*;

enum VehicleStatus {
    DISPONIBLE,
    LOUE,
    EN_MAINTENANCE
}

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "vehicle_type")
public class Vehicle {
    @Id
    @GeneratedValue
    private Long id;

    private String marque;
    private String modele;
    private String matricule;
    private Double prixParJour;
    private String dateMiseEnService;

    @Enumerated(EnumType.STRING)
    private VehicleStatus statut;

    @ManyToOne
    @JoinColumn(name="agence_id", nullable=false)
    @ToString.Exclude
    private Agence agence;
}
