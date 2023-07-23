package com.projetos.transito.api.assembler;


import com.projetos.transito.api.model.AutuacaoModel;
import com.projetos.transito.api.model.input.AutuacaoInput;
import com.projetos.transito.domain.model.Autuacao;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class AutuacaoAssembler {

    private final ModelMapper modelMapper;

    public AutuacaoModel toModel (Autuacao autuacao) {
        return modelMapper.map(autuacao, AutuacaoModel.class);
    }

    public Autuacao toEntity(AutuacaoInput autuacaoInput) {
        return modelMapper.map(autuacaoInput, Autuacao.class);
    }

    public List<AutuacaoModel> toCollectionModel(List<Autuacao> autuacoes) {
        return autuacoes.stream()
                .map(this::toModel)
                .toList();
    }

}
