package net.idhamide.aboubaker.mappers;

import net.idhamide.aboubaker.dto.AgenceDto;
import net.idhamide.aboubaker.entities.Agence;
import org.springframework.stereotype.Component;

@Component
public class AgenceMapper {
    public AgenceDto toDto(Agence a) {
        return new AgenceDto(a.getNom(), a.getAdresse(), a.getVille(), a.getTelephone());
    }

    public Agence toEntity(AgenceDto dto) {
        Agence a = new Agence();
        a.setNom(dto.getNom());
        a.setAdresse(dto.getAdresse());
        a.setVille(dto.getVille());
        a.setTelephone(dto.getTelephone());
        return a;
    }
}
