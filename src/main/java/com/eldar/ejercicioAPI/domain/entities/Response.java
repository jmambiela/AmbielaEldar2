package com.eldar.ejercicioAPI.domain.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Response {

    private boolean success;
    private Object data;



}
