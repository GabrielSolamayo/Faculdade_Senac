/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ProjetoHolite;

/**
 *
 * @author gabriel.esmunoz
 */
public class Colaborador {
    private String funcional;
    private String nomeColab;
    private String enderecoColab;
    private String dataAdmissaoColab;

    public Colaborador(String funcional, String nomeColab, String enderecoColab, String dataAdmissaoColab) {
        this.funcional = funcional;
        this.nomeColab = nomeColab;
        this.enderecoColab = enderecoColab;
        this.dataAdmissaoColab = dataAdmissaoColab;
    }
    public Colaborador(){
        
    }

    public String getFuncional() {
        return funcional;
    }

    public void setFuncional(String funcional) {
        this.funcional = funcional;
    }

    public String getNomeColab() {
        return nomeColab;
    }

    public void setNomeColab(String nomeColab) {
        this.nomeColab = nomeColab;
    }

    public String getEnderecoColab() {
        return enderecoColab;
    }

    public void setEnderecoColab(String enderecoColab) {
        this.enderecoColab = enderecoColab;
    }

    public String getDataAdmissaoColab() {
        return dataAdmissaoColab;
    }

    public void setDataAdmissaoColab(String dataAdmissaoColab) {
        this.dataAdmissaoColab = dataAdmissaoColab;
    }
    
    public void imprimeDados(String nome){
        System.out.println("===== DADOS DO "+nome+" =====");
        System.out.println("Nome: "+this.getNomeColab());
        System.out.println("Endereço: "+this.getEnderecoColab());
        System.out.println("Data de Admissão: "+this.getDataAdmissaoColab());
    }
}
