package cris.dev.aerolinea.Services;


import java.util.List;

import org.springframework.stereotype.Service;

import cris.dev.aerolinea.Models.Miembro;
import cris.dev.aerolinea.Repositories.MiembroRepository;


@Service
public class MiembroService {

    private final MiembroRepository miembroRepository;

    public MiembroService(MiembroRepository miembroRepository) {
        this.miembroRepository = miembroRepository;
    }

    public Miembro guardarMiembro(Miembro miembro) {
        return miembroRepository.save(miembro);
    }

    public Miembro buscarMiembroPorId(Long id){
        return miembroRepository.findById(id).get();
    }

    public List<Miembro> listarMiembros(){
        return miembroRepository.findAll();
    }

    public void eliminarMiembro(Long id){
        if(miembroRepository.findById(id).isPresent()){
            miembroRepository.delete(buscarMiembroPorId(id));
        }
    }

    public Miembro actualizarMiembro(Long id, Miembro miembro){
        Miembro miembroActualizado = this.buscarMiembroPorId(id);
        miembroActualizado.setNombre(miembro.getNombre());
        miembroActualizado.setApellido(miembro.getApellido());
        miembroActualizado.setCorreo(miembro.getCorreo());
        miembroActualizado.setDocumento(miembro.getDocumento());
        miembroActualizado.setTelefono(miembro.getTelefono());
        return this.guardarMiembro(miembroActualizado);
    }
}
