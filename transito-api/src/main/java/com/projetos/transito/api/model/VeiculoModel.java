package com.projetos.transito.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projetos.transito.domain.model.StatusVeiculo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;

import java.time.OffsetDateTime;
import java.util.Optional;

@Getter
@Setter
public class VeiculoModel {

    private Long id;
    private ProprietarioResumoModel proprietario;
    private String marca;
    private String modelo;
    private String numeroPlaca;
    private StatusVeiculo status;
    private OffsetDateTime dataCadastro;
    private OffsetDateTime  dataApreensao;

}
