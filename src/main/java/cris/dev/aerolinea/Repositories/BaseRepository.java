package cris.dev.aerolinea.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cris.dev.aerolinea.Models.Base;

@Repository
public interface BaseRepository extends JpaRepository<Base, Long> {
    
}
