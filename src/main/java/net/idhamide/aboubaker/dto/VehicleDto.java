package net.idhamide.aboubaker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDto {
    private String marque;
    private String modele;
    private String matricule;
    private Double prixParJour;
    private String dateMiseEnService;
}
