package cris.dev.aerolinea.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cris.dev.aerolinea.Models.Miembro;

@Repository
public interface MiembroRepository extends JpaRepository<Miembro, Long> {
    
}
