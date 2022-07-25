package cris.dev.aerolinea.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cris.dev.aerolinea.Models.Piloto;

@Repository
public interface PilotoRepository extends JpaRepository<Piloto, Long> {
    
}
