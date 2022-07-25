package cris.dev.aerolinea.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import cris.dev.aerolinea.Models.Base;
import cris.dev.aerolinea.Repositories.BaseRepository;

@Service
public class BaseService {
    
    private final BaseRepository baseRepository;

    public BaseService(BaseRepository baseRepository) {
        this.baseRepository = baseRepository;
    }

    public Base guardarBase(Base base){
        return baseRepository.save(base);
    }

    public void eliminarBase(Long id){
        Base base = buscarPorId(id);
        baseRepository.delete(base);
    }

    public Base buscarPorId(Long id){
        return baseRepository.findById(id).get();
    }

    public List<Base> listarBases(){
        return baseRepository.findAll();
    }

    
}
