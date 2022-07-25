package com.fiap.smarticities.entity;

import java.io.Serializable;

public class Cliente implements Serializable {
	private static final long serialVersionUID = 3113787237429329394L;

	private int id;
	private String nome;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}