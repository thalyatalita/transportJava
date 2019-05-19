
package br.com.server.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_telefones")
public class Telefone implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private ArrayList<String> telefones = new ArrayList<>();

	public Telefone () {}

	public Telefone(Long id, ArrayList<String> telefones) {
		super();
		this.id = id;
		this.telefones = telefones;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ArrayList<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(ArrayList<String> telefones) {
		this.telefones = telefones;
	}

}