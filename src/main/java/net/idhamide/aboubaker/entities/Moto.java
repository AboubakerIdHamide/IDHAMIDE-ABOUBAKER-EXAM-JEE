package net.idhamide.aboubaker.entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

enum TypeMoto {
   SPORTIVE,
    SCOOTER,
    ROAD_STER,
    TOURING
}

@Entity
@DiscriminatorValue("moto")
public class Moto extends  Vehicle {
    private String cylindree;

    @Enumerated(EnumType.STRING)
    private TypeMoto typeMoto;

    private Boolean casqueInclus;
}
