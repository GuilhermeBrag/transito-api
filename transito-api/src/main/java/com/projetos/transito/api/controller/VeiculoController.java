package com.projetos.transito.api.controller;

import com.projetos.transito.api.assembler.VeiculoAssembler;
import com.projetos.transito.api.model.VeiculoModel;
import com.projetos.transito.api.model.input.VeiculoInput;
import com.projetos.transito.domain.exception.NegocioException;
import com.projetos.transito.domain.model.Veiculo;
import com.projetos.transito.domain.repository.VeiculoRepository;
import com.projetos.transito.domain.service.ApreensaoVeiculoService;
import com.projetos.transito.domain.service.RegistroVeiculoService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    private final VeiculoRepository veiculoRepository;

    private final RegistroVeiculoService registroVeiculoService;

    private final ApreensaoVeiculoService apreensaoVeiculoService;

    private final VeiculoAssembler veiculoAssembler;

    @GetMapping
    public List<VeiculoModel> listar() {
        return veiculoAssembler.toCollectionModel(veiculoRepository.findAll());
    }

    @GetMapping("/{veiculoId}")
    public ResponseEntity<VeiculoModel> buscar (@PathVariable Long veiculoId) {
        return veiculoRepository.findById(veiculoId)
                .map(veiculoAssembler::toModel)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VeiculoModel cadastrar(@Valid @RequestBody VeiculoInput veiculoInput) {
            Veiculo novoVeiculo = veiculoAssembler.toEntity(veiculoInput);
            Veiculo veiculoCadastrado = registroVeiculoService.cadastrar(novoVeiculo);

            return veiculoAssembler.toModel(veiculoCadastrado);
//        return veiculoAssembler.toModel(registroVeiculoService.cadastrar(veiculo));
    }

    @PutMapping("/{veiculoId}/apreensao")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void apreender(@PathVariable Long veiculoId) {
        apreensaoVeiculoService.apreender(veiculoId);
    }

    @DeleteMapping("/{veiculoId}/apreensao")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerApreensao(@PathVariable Long veiculoId) {
        apreensaoVeiculoService.removerApreensao(veiculoId);
    }




}
