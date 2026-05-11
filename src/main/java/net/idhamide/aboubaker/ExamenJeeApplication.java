package net.idhamide.aboubaker;

import net.idhamide.aboubaker.repository.AgenceRepository;
import net.idhamide.aboubaker.repository.VehicleRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import net.idhamide.aboubaker.entities.*;

import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class ExamenJeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenJeeApplication.class, args);
    }


    @Bean
    public CommandLineRunner start(VehicleRepository vehicleRepository, AgenceRepository agenceRepository){
        return args -> {
            // agences
            Agence ag1= agenceRepository.save(Agence.builder().nom("AG-1").ville("MARRAKECH").adresse("GUELIZ").build());
            Agence ag2= agenceRepository.save(Agence.builder().nom("AG-2").ville("CASA").adresse("MAARIF").build());

            // vehicles
            vehicleRepository.save(Voiture.builder().marque("BMW").modele("520d").agence(ag1).build());
            vehicleRepository.save(Voiture.builder().marque("TESLA").modele("CyberTruck").agence(ag2).build());

            // afficher vehicles
            vehicleRepository.findAll().forEach(v->{
                System.out.println(v.toString());
            });

            // afficher agences
            agenceRepository.findAll().forEach(a->{
                System.out.println(a.toString());
            });
        };
    }
}
