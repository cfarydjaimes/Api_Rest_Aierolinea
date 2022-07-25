package cris.dev.aerolinea.Models;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;


import lombok.Data;

@Data
@Entity(name = "vuelos")
public class Vuelo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Ciudad origen;

    @Enumerated(EnumType.STRING)
    private Ciudad destino;

    @JsonFormat(pattern = "YYYY-mm-dd")
    private Date fechaDeVuelo;

    @JsonFormat(pattern = "HH:mm")
    private LocalTime horaDeSalida;

    @JsonFormat(pattern = "HH:mm")
    private LocalTime horaDeLlegada;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "piloto_id")
    private List<Piloto> pilotos = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "miembro_id")
    private List<Miembro> miembros = new ArrayList<>();;

}
 