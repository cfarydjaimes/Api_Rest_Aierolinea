package cris.dev.aerolinea.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import cris.dev.aerolinea.Models.Vuelo;
import cris.dev.aerolinea.Repositories.VueloRepository;

@Service
public class VueloService {

    private final VueloRepository vueloRepository;

    public VueloService(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }

    public Vuelo guardarVuelo(Vuelo vuelo) {
        return vueloRepository.save(vuelo);
    }

    public void eliminarVuelo(Vuelo vuelo) {
        vueloRepository.delete(vuelo);
    }

    public Vuelo buscarVueloPorId(Long id){
        return vueloRepository.findById(id).get();
    }

    public List<Vuelo> buscarTodos(){
        return vueloRepository.findAll();
    }

}
