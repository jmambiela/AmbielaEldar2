package com.eldar.ejercicioAPI.domain.entities;

import com.eldar.ejercicioAPI.domain.enumeradores.eMarca;

public class OperacionResp {
    private String marca;
    private double montoFinal;

    public OperacionResp(String marca, double montoFinal) {
        this.marca = marca;
        this.montoFinal = montoFinal;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }
}
