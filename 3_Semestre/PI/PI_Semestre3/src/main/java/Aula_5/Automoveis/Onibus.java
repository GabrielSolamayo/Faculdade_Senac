/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_5.Automoveis;

/**
 *
 * @author gabriel.esmunoz
 */
public class Onibus extends Veiculo {

    private int passageiro;

    public int getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(int passageiro) {
        this.passageiro = passageiro;
    }

    public Onibus(int passageiro, String placa, int ano, String tipo) {
        super(placa, ano, tipo);
        this.passageiro = passageiro;
    }
    public Onibus(){
    }
    
    
    public void mostrarDados() {
//        System.out.println("---- DADOS DO ONIBUS ----");
//        System.out.println("Qtde de Passageiros: " + this.getPassageiro());
//        System.out.println("Placa: " + this.getPlaca());//poderia usar o super. que daria certo tbm, demonstrado abaixo;
//        System.out.println("Ano: " + super.getAno());
//        System.out.println("");
        super.mostrarDados();
        System.out.println("Qtde de Passageiros: " + this.getPassageiro());
    }
}
