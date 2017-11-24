package br.com.fiap.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginBean {

	private String nome;
	private String senha;
	
	public String submit() {
		// TODO Aqui vamos salvar o usuário na base de dados
		System.out.println("Nome: " + this.nome + " / Senha: " + this.senha);
		return "sucesso";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
