package cris.dev.aerolinea.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cris.dev.aerolinea.Models.Avion;
import cris.dev.aerolinea.Services.AvionService;

@RestController
@RequestMapping("/api/aerolinea/aviones")
public class AvionController {

    private final AvionService avionService;

    public AvionController(AvionService avionService) {
        this.avionService = avionService;
    }

    @GetMapping
    public List<Avion> listarAviones() {
        return avionService.listarAviones();
    }

    @PostMapping
    public Avion guardarAvion(@RequestBody Avion avion) {
        return avionService.guardarAvion(avion);
    }

    @GetMapping("/{id}")
    public Avion obtenerAvionPorId(@RequestParam Long id) {
        return avionService.buscarAvionPorId(id);
    }

    @PutMapping("/{id}")
    public Avion actualizarAvion(@RequestBody Avion avion, @RequestParam Long idAvion) {
        return avionService.actualizarAvion(idAvion, avion);
    }

    @DeleteMapping("/{id}")
    public void eliminarAvion(@RequestParam Long id) {
        avionService.eliminarAvion(id);
    }
}
