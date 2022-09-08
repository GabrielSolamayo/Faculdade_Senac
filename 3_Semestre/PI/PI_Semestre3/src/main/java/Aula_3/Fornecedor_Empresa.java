/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_3;

/**
 *
 * @author gabriel.esmunoz
 */
public class Fornecedor_Empresa extends Fornecedor{
    public Fornecedor_Empresa(String nome, String fone, String ie, String cnpj) {
		super(nome, fone);
		this.ie = ie;
		this.cnpj = cnpj;
	}

	private String ie, cnpj;

	public Fornecedor_Empresa() {
		super();
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}
}
