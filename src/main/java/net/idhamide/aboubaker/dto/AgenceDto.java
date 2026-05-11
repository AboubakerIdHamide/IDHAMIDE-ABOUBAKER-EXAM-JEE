package net.idhamide.aboubaker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgenceDto {
    private String nom;
    private String adresse;
    private String ville;
    private String telephone;
}