package com.module.dental.denti.pacient.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor  //Añade los Getter y Setters
@NoArgsConstructor
public class Pacient {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pacientId;

    @NonNull  // se puede utilizar junto con @RequiredArgsConstructor
    @NotBlank  //Para que no que de en blanco
    private String pacientNames;

    
    @NonNull  // se puede utilizar junto con @RequiredArgsConstructor
    @NotBlank  //Para que no que de en blanco
    private String pacientDni;

    @NonNull
    @NotNull
    @Positive  //Positive para que sea un valor positivo
    private Integer pacientAge;

    @NonNull  // se puede utilizar junto con @RequiredArgsConstructor
    @NotBlank  //Para que no que de en blanco
    private String pacientFono;


    @NonNull  // se puede utilizar junto con @RequiredArgsConstructor
    @NotBlank  //Para que no que de en blanco
    private String pacientFono2;


    @NonNull  // se puede utilizar junto con @RequiredArgsConstructor
    @NotBlank  //Para que no que de en blanco
    private String  pacientAddress;


    @NonNull  // se puede utilizar junto con @RequiredArgsConstructor
    @NotBlank  //Para que no que de en blanco
    private String  pacientOccupation;


   
    @NonNull  // se puede utilizar junto con @RequiredArgsConstructor
    @NotBlank  //Para que no que de en blanco
    private String  pacientFecnac;

    @NonNull
    @Email(message="Email Invalido")
    @NotBlank(message="Sin Email")
    private String pacientEmail;


    @NonNull  // se puede utilizar junto con @RequiredArgsConstructor
    @NotBlank  //Para que no que de en blanco
    private String pacientReferredBy;

}
