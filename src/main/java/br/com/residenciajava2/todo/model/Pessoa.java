package br.com.residenciajava2.todo.model;

public class Pessoa {

	// ATRIBUTOS
	private Long id;
	private String nome;
	private int idade;
	private Double peso;

	// CONSTRUTOR

	public Pessoa(Long id, String nome, int idade, Double peso) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}

	public Pessoa(Pessoa p) {
		this.id = p.getId();
		this.idade = p.getIdade();
		this.nome = p.getNome();
		this.peso = p.getPeso();
	}

	public Pessoa() {
		super();
	}

//GET'S AND SET'S...

	public String getNome() {
		return nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

}
