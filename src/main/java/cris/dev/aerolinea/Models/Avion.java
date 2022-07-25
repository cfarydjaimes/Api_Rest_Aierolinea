package cris.dev.aerolinea.Models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity(name = "aviones")
public class Avion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String modelo;
    private String capacidad;

    @Column(name = "fecha_operacion")
	@JsonFormat(pattern = "YYYY-mm-dd")
	private Date fechaOperacion;

    @OneToOne
    @JoinColumn(name = "idBase")
    private Base base;
}