package cris.dev.aerolinea.Models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "pilotos")
public class Piloto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Number documento;
    private String nombre;
    private String apellido;
    private String correo;
    private Number telefono;
    private int horasDeVuelo;

    
}
