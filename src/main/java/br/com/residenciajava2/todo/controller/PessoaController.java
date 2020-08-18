package br.com.residenciajava2.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.residenciajava2.todo.model.Pessoa;
import br.com.residenciajava2.todo.services.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

	@Autowired
	PessoaService pessoaService;

	@GetMapping()
	public List<Pessoa> findAll() {
		return pessoaService.listaPessoas();

	}

	@GetMapping("/{id}")
	public Pessoa findById(@PathVariable Long id) {
		return pessoaService.buscaPessoaporId(id);

	}

	@DeleteMapping("/{id}")
	public void DeleteById(@PathVariable Long id) {
		pessoaService.deletarPessoa(id);

	}

	@PostMapping("/salvar")
	public Pessoa cadastrarPessoa(@RequestBody Pessoa pJson) {
		return pessoaService.save(pJson);
	}

	@PutMapping("/{id}")
	public Pessoa update(@PathVariable Long id, @RequestBody Pessoa p) {

		return pessoaService.editar(id, p);

	}

}
