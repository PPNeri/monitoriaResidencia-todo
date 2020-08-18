package br.com.residenciajava2.todo.services;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.residenciajava2.todo.model.Pessoa;

@Service
public class PessoaService {

	// Instanciar todas as pessoas em uma lista

//Instancia de Pessoa
	public List<Pessoa> pessoas = new LinkedList<Pessoa>(Arrays.asList(
			new Pessoa(1L, "Paulo", 30, 80.3),
			new Pessoa(2L, "Joana", 54, 60.0),
			new Pessoa(3L, "Maria", 24, 55.0),
			new Pessoa(4L, "Rafael", 3, 18.3),
			new Pessoa(5L, "Ricardo", 60, 180.3))

	);

	public List<Pessoa> listaPessoas() {

		return this.pessoas;

	}

	public Pessoa buscaPessoaporId(Long id) {

		Pessoa pessoaEncontrada = null;

		for (Pessoa pessoa : pessoas) {
			if (pessoa.getId() == id) {
				pessoaEncontrada = pessoa;
				break;
			}
		}

		return pessoaEncontrada;
	}

	public void deletarPessoa(Long id) {
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getId() == id) {
				pessoas.remove(pessoa);
				break;
			}
		}

	}

	public Pessoa save(Pessoa p) {
		Pessoa novaPessoa = new Pessoa(p);
		pessoas.add(novaPessoa);
		return novaPessoa;

	}

	public Pessoa editar(Long id, Pessoa p) {
		Pessoa pessoa = buscaPessoaporId(id);
		pessoa.setId(p.getId());
		pessoa.setIdade(p.getIdade());
		pessoa.setNome(p.getNome());
		pessoa.setPeso(p.getPeso());
		return pessoa;

	}

}
