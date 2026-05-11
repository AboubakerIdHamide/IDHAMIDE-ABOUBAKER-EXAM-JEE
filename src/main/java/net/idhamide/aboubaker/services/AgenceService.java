package net.idhamide.aboubaker.services;

import net.idhamide.aboubaker.entities.Agence;
import net.idhamide.aboubaker.repository.AgenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgenceService {
    private final AgenceRepository agenceRepository;

    @Autowired
    public AgenceService(AgenceRepository agenceRepository){
        this.agenceRepository = agenceRepository;
    }

    public List<Agence> getAgences() {
        return agenceRepository.findAll();
    }

    public void addNewAgence(Agence agence) {
        agenceRepository.save(agence);
    }

    public void deleteAgence(Long agenceId) {
        boolean exists = agenceRepository.existsById(agenceId);
        if (!exists) {
            throw new IllegalStateException("Lagence avec cette ID:" + agenceId + " non trouve");
        }
        agenceRepository.deleteById(agenceId);
    }
}
