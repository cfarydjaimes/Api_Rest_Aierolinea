package cris.dev.aerolinea.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import cris.dev.aerolinea.Models.Piloto;
import cris.dev.aerolinea.Repositories.PilotoRepository;

@Service
public class PilotoService {

    private final PilotoRepository pilotoRepository;

    public PilotoService(PilotoRepository pilotoRepository) {
        this.pilotoRepository = pilotoRepository;
    }

    public Piloto guardarPiloto(Piloto piloto) {
        return pilotoRepository.save(piloto);
    }

    public List<Piloto> listarPilotos(){
        return pilotoRepository.findAll();
    }

    public void eliminarPilotoPorId(Long id){
        pilotoRepository.deleteById(id);
    }

    public Piloto buscarPilotoPorId(Long id){
        return pilotoRepository.findById(id).get();
    }

    public Piloto actualizarPiloto(Piloto piloto, Long id){
        Piloto pilotoActualizado = buscarPilotoPorId(id);
        pilotoActualizado.setNombre(piloto.getNombre());
        pilotoActualizado.setApellido(piloto.getApellido());
        pilotoActualizado.setCorreo(piloto.getCorreo());
        pilotoActualizado.setDocumento(piloto.getDocumento());
        pilotoActualizado.setHorasDeVuelo(piloto.getHorasDeVuelo());
        pilotoActualizado.setTelefono(piloto.getTelefono());
        return guardarPiloto(pilotoActualizado);
    }

    
}
