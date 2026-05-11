package net.idhamide.aboubaker.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Agence {
    @Id
    @GeneratedValue
    private Long id;

    private String nom;
    private String adresse;
    private String ville;
    private String telephone;

    @OneToMany(mappedBy="agence")
    @ToString.Exclude
    private List<Vehicle> vehicles;
}
