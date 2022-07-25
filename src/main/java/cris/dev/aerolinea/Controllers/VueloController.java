package cris.dev.aerolinea.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cris.dev.aerolinea.Models.Vuelo;
import cris.dev.aerolinea.Services.VueloService;

@RestController
@RequestMapping("/api/aerolinea/vuelos")
public class VueloController {
    
    private final VueloService vueloService;

    public VueloController(VueloService vueloService) {
        this.vueloService = vueloService;
    }

    @PostMapping
    public Vuelo guardarVuelo(@RequestBody Vuelo vuelo){
        return vueloService.guardarVuelo(vuelo);
    }

    @DeleteMapping
    public void eliminarVuelo(Vuelo vuelo){
        vueloService.eliminarVuelo(vuelo);
    }

    @GetMapping
    public List<Vuelo> listarVuelos(){
        return vueloService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Vuelo buscarVueloPorId(@RequestParam Long id){
        return vueloService.buscarVueloPorId(id);
    }
}
