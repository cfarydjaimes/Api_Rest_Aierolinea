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

import cris.dev.aerolinea.Models.Miembro;
import cris.dev.aerolinea.Services.MiembroService;

@RestController
@RequestMapping("/api/aerolinea")
public class MiembroController {

    private final MiembroService miembroService;

    public MiembroController(MiembroService miembroService) {
        this.miembroService = miembroService;
    }

    @PostMapping("/miembros")
    public Miembro guardarMiembro(@RequestBody Miembro miembro) {
        return miembroService.guardarMiembro(miembro);
    }

    @GetMapping
    public List<Miembro> listarMiembros() {
        return miembroService.listarMiembros();
    }

    @GetMapping("/{id}")
    public Miembro buscarMiembroPorId(@PathVariable("id") Long id) {
        return miembroService.buscarMiembroPorId(id);
    }

    @PutMapping("/{id}")
    public Miembro actualizarMiembro(@PathVariable("id") Long id, @RequestBody Miembro miembro) {
        return miembroService.actualizarMiembro(id, miembro);
    }

    @DeleteMapping("/{id}")
    public void eliminarMiembro(@PathVariable Long id) {
        miembroService.eliminarMiembro(id);
    }
}
