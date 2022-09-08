/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_3;

/**
 *
 * @author gabriel.esmunoz
 */
public class Fornecedor_Pessoa extends Fornecedor{
    private String rg, cpf;

	public String getRg() {
		return rg;
	}

	public Fornecedor_Pessoa() {
		super();
	}

	public Fornecedor_Pessoa(String nome, String fone, String rg, String cpf) {
		super(nome, fone);
		this.rg = rg;
		this.cpf = cpf;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
