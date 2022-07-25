package cris.dev.aerolinea.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cris.dev.aerolinea.Models.Base;
import cris.dev.aerolinea.Services.BaseService;

@RestController
@RequestMapping("/api/aerolinea/bases")
public class BaseController {
    
    private final BaseService baseService;

    public BaseController(BaseService baseService) {
        this.baseService = baseService;
    }

    @PostMapping
    public Base guardarBase(@RequestBody Base base){
        return baseService.guardarBase(base);
    }

    @GetMapping
    public List<Base> listarBases(){
        return baseService.listarBases();
    }

    @GetMapping("/{id}")
    public Base obtenerMiembroPorId(@PathVariable Long id){
        return baseService.buscarPorId(id);
    }

    @PutMapping
    public Base actualizarBase(Base base){
        return baseService.guardarBase(base);
    }

    @DeleteMapping("/{id}")
    public void eliminarBase(@PathVariable("id") Long id ){
        baseService.eliminarBase(id);
    }
}
