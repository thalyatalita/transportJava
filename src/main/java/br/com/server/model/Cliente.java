package br.com.server.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_clientes")
public class Cliente extends Funcionario {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
