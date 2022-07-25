package cris.dev.aerolinea.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import cris.dev.aerolinea.Models.Avion;
import cris.dev.aerolinea.Repositories.AvionRepository;

@Service
public class AvionService {

    private final AvionRepository avionRepository;

    public AvionService(AvionRepository avionRepository) {
        this.avionRepository = avionRepository;
    }

    public Avion guardarAvion(Avion avion) {
        return avionRepository.save(avion);
    }

    public void eliminarAvion(Long id) {
        avionRepository.deleteById(id);
    }

    public List<Avion> listarAviones(){
        return avionRepository.findAll();
    }

    public Avion buscarAvionPorId(Long id){
        return avionRepository.findById(id).get();
    }

    public Avion actualizarAvion(Long idAvion, Avion avion ){
        Avion avionActualizado = avionRepository.findById(idAvion).get();
        avionActualizado.setNombre(avion.getNombre());
        avionActualizado.setCapacidad(avion.getCapacidad());
        avionActualizado.setCapacidad(avion.getCapacidad());
        avionActualizado.setFechaOperacion(avion.getFechaOperacion());
        return avionRepository.save(avionActualizado);
    }
}
