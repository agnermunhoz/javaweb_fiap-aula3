package br.com.fiap.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BemvindoMBean {

	private String boasvindas = "Mensagem de bem vindo";

	public String getBoasvindas() {
		return boasvindas;
	}

	public void setBoasvindas(String boasvindas) {
		this.boasvindas = boasvindas;
	}
	
}
