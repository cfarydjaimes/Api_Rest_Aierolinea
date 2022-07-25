package cris.dev.aerolinea.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cris.dev.aerolinea.Models.Vuelo;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Long> {
    
}
