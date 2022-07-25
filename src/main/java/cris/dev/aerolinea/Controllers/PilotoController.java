package cris.dev.aerolinea.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cris.dev.aerolinea.Models.Piloto;
import cris.dev.aerolinea.Services.PilotoService;

@RestController
@RequestMapping("/api/aerolinea/pilotos")
public class PilotoController {
    
    private final PilotoService pilotoService;

    public PilotoController(PilotoService pilotoService) {
        this.pilotoService = pilotoService;
    }

    @PostMapping
    public Piloto guardarPiloto(@RequestBody Piloto piloto){
        return pilotoService.guardarPiloto(piloto);
    }

    @GetMapping
    public List<Piloto> listarPilotos(){
        return pilotoService.listarPilotos();
    }

    @GetMapping("/{id}")
    public Piloto buscarPiloto(@RequestParam Long id){
        return pilotoService.buscarPilotoPorId(id);
    }

    @PutMapping("/{id}")
    public Piloto actualizarPiloto(@RequestParam Long id, @RequestBody Piloto piloto){
        return pilotoService.actualizarPiloto(piloto, id);
    }

    @DeleteMapping("/{id}")
    public void eliminarPiloto(@PathVariable("id") Long id ){
        pilotoService.eliminarPilotoPorId(id);
    }

}
