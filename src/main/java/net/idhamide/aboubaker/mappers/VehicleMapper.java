package net.idhamide.aboubaker.mappers;


import net.idhamide.aboubaker.dto.VehicleDto;
import net.idhamide.aboubaker.entities.Vehicle;

public class VehicleMapper {
    public VehicleDto toDto(Vehicle v) {
        return new VehicleDto(v.getMarque(), v.getModele(), v.getMatricule(), v.getPrixParJour(), v.getDateMiseEnService());
    }

    public Vehicle toEntity(VehicleDto dto) {
        Vehicle a = new Vehicle();
        a.setMarque(dto.getMarque());
        a.setModele(dto.getModele());
        a.setPrixParJour(dto.getPrixParJour());
        a.setDateMiseEnService(dto.getDateMiseEnService());
        return a;
    }
}
