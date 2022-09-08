/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_5.Automoveis;

/**
 *
 * @author gabriel.esmunoz
 */
public class Caminhao extends Veiculo{
    private int carga;

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Caminhao(int carga, String placa, int ano, String tipo) {
        super(placa, ano, tipo);
        this.carga = carga;
    }
    public Caminhao(){
        
    }
    
    public void mostrarDados() {
        super.mostrarDados();//Chama o metodo da classe Veiculo - Placa e Ano;
        System.out.println("Carga: " + this.getCarga()+"Kg");
//        System.out.println("---- DADOS DO CAMINHAO ----");
//        System.out.println("Carga: " + this.getCarga()+"Kg");
//        System.out.println("Placa: " + this.getPlaca());//poderia usar o super. que daria certo tbm, demonstrado abaixo;
//        System.out.println("Ano: " + this.getAno());
//        System.out.println("");
    }
}
