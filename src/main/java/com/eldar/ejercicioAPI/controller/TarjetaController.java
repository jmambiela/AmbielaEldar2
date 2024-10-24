package com.eldar.ejercicioAPI.controller;
import com.eldar.ejercicioAPI.domain.entities.Operacion;
import com.eldar.ejercicioAPI.domain.entities.OperacionResp;
import com.eldar.ejercicioAPI.domain.enumeradores.eMarca;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/tarjeta")
public class TarjetaController {

    @PostMapping("/operacion")
    public OperacionResp realizarOperacion(@RequestBody Operacion solicitud) {
        eMarca marca = solicitud.getTarjeta().getMarca();
        double monto = solicitud.getMonto();
        double tasa = 0;


        if (marca == marca.VISA) {
            tasa = (monto * ((LocalDate.now().getYear()/LocalDate.now().getMonthValue()))/100);
          } else if (marca == marca.AMEX) {
            tasa = (monto * (LocalDate.now().getMonthValue()*0.1));
             } else if (marca == marca.NARA) {
        tasa = (monto * (LocalDate.now().getDayOfMonth()*0.5));
           } else {
            throw new IllegalArgumentException("Marca no válida");
          }


        return new OperacionResp(marca.name(), tasa);
    }
}
