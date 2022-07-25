package cris.dev.aerolinea.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cris.dev.aerolinea.Models.Avion;

@Repository
public interface AvionRepository extends JpaRepository<Avion, Long> {

}
