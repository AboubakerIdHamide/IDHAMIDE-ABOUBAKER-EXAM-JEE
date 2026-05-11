package net.idhamide.aboubaker.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

enum TypeCarburant {
    ESSENCE,
    DIESEL,
    HYBRIDE,
    ELECTRIQUE
}

enum BoiteVitesse {
    MANUAL,
    AUTOMATIQUE
}

@Entity
@DiscriminatorValue("voiture")
public class Voiture extends  Vehicle {
    private Integer nombrePortes;

    @Enumerated(EnumType.STRING)
    private TypeCarburant typeCarburant;

    @Enumerated(EnumType.STRING)
    private BoiteVitesse boiteVitesse;
}
