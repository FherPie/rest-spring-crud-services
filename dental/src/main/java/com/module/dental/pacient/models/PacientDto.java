package com.module.dental.pacient.models;

import lombok.Data;

@Data
public class PacientDto {
    private Integer pacientId;
    private String pacientNames;
    private String pacientDni;
    private Integer pacientAge;
    private String pacientFono;
    private String pacientFono2;
    private String pacientAddress;
    private String pacientOccupation;
    private String pacientFecnac;
    private String pacientReferredBy;
    private String pacientEmail;


    public PacientDto(Integer pacientId, String pacientName, String pacientDni, String pacientEmail){
          this.pacientId= pacientId;
          this.pacientNames= pacientName;
          this.pacientDni= pacientDni;
          this.pacientEmail= pacientEmail;
    }
}

