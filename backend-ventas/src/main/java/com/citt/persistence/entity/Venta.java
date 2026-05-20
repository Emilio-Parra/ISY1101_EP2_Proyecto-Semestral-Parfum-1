package com.citt.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name = "ventas_perfumes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Long idVenta;

    @NotBlank(message = "El nombre del cliente es obligatorio")
    @Column(name = "nombre_cliente")
    private String nombreCliente;

    @NotBlank(message = "El perfume es obligatorio")
    @Column(name = "perfume")
    private String perfume;

    @NotBlank(message = "La marca es obligatoria")
    @Column(name = "marca")
    private String marca;

    @Column(name = "familia_olfativa")
    private String familiaOlfativa;

    @Column(name = "concentracion")
    private String concentracion;

    @Positive(message = "Los mililitros deben ser mayores a cero")
    @Column(name = "mililitros")
    private int mililitros;

    @Positive(message = "La cantidad debe ser mayor a cero")
    @Column(name = "cantidad")
    private int cantidad;

    @NotBlank(message = "La dirección de entrega es obligatoria")
    @Column(name = "direccion_compra")
    private String direccionCompra;

    @Positive(message = "El valor de compra debe ser mayor a cero")
    @Column(name = "valor_compra")
    private int valorCompra;

    @NotNull(message = "La fecha de compra es obligatoria")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "fecha_compra")
    private LocalDate fechaCompra;

    @NotNull(message = "El estado de despacho debe ser proporcionado")
    @Column(name = "despacho_generado")
    private Boolean despachoGenerado = false;
}
