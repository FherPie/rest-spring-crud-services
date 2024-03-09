package com.module.dental.denti.pacient.responses;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * ResponseGenerico class
 *
 * @version $Revision: 1 $
 */
@Data
@AllArgsConstructor
public class ResponseGenerico<T> implements Serializable {

    private String codigoRespuestaName;
    private int codigoRespuestaValue;
    private String mensaje;
    private T objeto;
    private Object objetoOb;
    private Object listadoOb;
    private List<T> listado;
    private Long totalRegistros;

    public ResponseGenerico() {
    }
}