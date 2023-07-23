package com.projetos.transito.common;

import com.projetos.transito.api.model.VeiculoModel;
import com.projetos.transito.domain.model.Veiculo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        var modelMapper = new ModelMapper();

        modelMapper.createTypeMap(Veiculo.class, VeiculoModel.class)
                .addMappings(mapper -> mapper.map(Veiculo::getPlaca,VeiculoModel::setNumeroPlaca));


        return modelMapper;
    }
}
