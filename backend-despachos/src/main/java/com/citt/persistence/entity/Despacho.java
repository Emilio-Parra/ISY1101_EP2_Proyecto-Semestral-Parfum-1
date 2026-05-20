package com.citt.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name = "despachos_perfumes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Despacho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_despacho")
    private Long idDespacho;

    @NotNull(message = "La fecha de despacho es obligatoria")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "fecha_despacho")
    private LocalDate fechaDespacho;

    @NotBlank(message = "El transportista es obligatorio")
    @Column(name = "transportista")
    private String transportista;

    @Column(name = "codigo_seguimiento")
    private String codigoSeguimiento;

    @Column(name = "intento")
    private int intento;

    @Column(name = "id_compra")
    private Long idCompra;

    @NotBlank(message = "La dirección de entrega es obligatoria")
    @Column(name = "direccion_compra")
    private String direccionCompra;

    @Column(name = "valor_compra")
    private Long valorCompra;

    @Column(name = "estado")
    private String estado = "Pendiente";

    @Column(name = "despachado")
    private boolean despachado = false;
}
