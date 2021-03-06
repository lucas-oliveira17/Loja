package com.lucas.loja.controller;

import static com.lucas.loja.controller.utils.FromDTO.fromDTOFuncionario;
import static com.lucas.loja.controller.utils.ToDTO.passarFuncionarioParaDTO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.loja.controller.utils.URL;
import com.lucas.loja.dto.FuncionarioDTO;
import com.lucas.loja.entities.Funcionario;
import com.lucas.loja.service.FuncionarioService;

@RestController
@RequestMapping(value = "/loja/funcionario")
public class FuncionarioController {

	@Autowired
	private FuncionarioService funcionarioService;
	
	@GetMapping(value = "/consulta")
	public ResponseEntity<List<FuncionarioDTO>> listarFuncionarios(){
		List<Funcionario> funcionarios = funcionarioService.findAllFuncionarios();
		List<FuncionarioDTO> dto = passarFuncionarioParaDTO(funcionarios);
		return ResponseEntity.ok().body(dto);
	}
	
	@GetMapping(value = "/filtrarporcpf")
	public ResponseEntity<FuncionarioDTO> filtrarFuncionarioPorCpf(@RequestParam (value = "cpf", defaultValue = "") String cpf){
		cpf = (URL.decodeParam(cpf));
		Funcionario funcionariosQueContemEsseCpf = funcionarioService.findByCpf(cpf);
		FuncionarioDTO dto = new FuncionarioDTO(funcionariosQueContemEsseCpf);
		return ResponseEntity.ok().body(dto);
	}
	
	@PostMapping(value = "/cadastro")
	public ResponseEntity<Funcionario> cadastrarFuncionario(@RequestBody FuncionarioDTO funcionarioDTO) {
		Funcionario funcionario = fromDTOFuncionario(funcionarioDTO);
		funcionarioService.saveFuncionario(funcionario);
		return ResponseEntity.ok().body(funcionario);
	}
	
	@DeleteMapping(value = "/deletar/{id}")
	public ResponseEntity<String> deleteFuncionario(@PathVariable String id) {
		funcionarioService.deleteFuncionario(id);
		return ResponseEntity.ok().body("O Funcionário do id: " + id + " foi excluído");
	}
	
	@PutMapping(value = "atualizar/{id}")
	public ResponseEntity<String> updateFuncionario(@RequestBody FuncionarioDTO funcionarioDTO, @PathVariable String id){
		Funcionario funcionarioAtualizado = fromDTOFuncionario(funcionarioDTO);
		funcionarioAtualizado.setId(id);
		funcionarioService.updateFuncionario(funcionarioAtualizado);
		return ResponseEntity.ok().body("O cadastro de: " + funcionarioAtualizado.getNome() + "foi atualizado com sucesso!");
	}
}
