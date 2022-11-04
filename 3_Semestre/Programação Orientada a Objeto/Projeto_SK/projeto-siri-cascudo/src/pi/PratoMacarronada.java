/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pi;

import java.text.DecimalFormat;

/**
 *
 * @author eric
 */
public class PratoMacarronada extends Estoque implements Pagamento {

    final double gramaMacarrao = 1.345;
    final double gramaMolhoTomate = 0.543;
    final double gramaCarneMoida = 1.245;
    final double gramaBatata = 0.675;
    private double valorDoPrato;

    public PratoMacarronada() {
    }

    public double getValorDoPrato() {
        return valorDoPrato;
    }

    public void setValorDoPrato(double valorDoPrato) {
        this.valorDoPrato = valorDoPrato;
    }

    private double precoPrato() {
        DecimalFormat dc = new DecimalFormat("##.00");
        double soma[] = {gramaMacarrao, gramaMolhoTomate, gramaCarneMoida, gramaBatata};

        for (int i = 0; i < soma.length; i++) {
            soma[i] *= 5;
            valorDoPrato += soma[i];
        }
        String valor = dc.format(valorDoPrato).replace(",", ".");
        valorDoPrato = Double.parseDouble(valor);

        return valorDoPrato;
    }

    public void descricaoDoPrato() {
        System.out.println("\nPrato 3: Macarronada.\nDescrição: Macarrão, molho de tomate, carne moida, batata picada.\nPreco: " + precoPrato());
    }

    @Override
    public double valorDoPrato() {
        setValorDoPrato(getValorDoPrato() + super.adicionarBebida());

        System.out.print("Valor do prato: ");
        return getValorDoPrato();
    }

    @Override
    public void calcularGramasDeComida() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void baixaEstoque() {
        setMacarrao(getMacarrao() - gramaMacarrao);
        setCarneSuina(getCarneSuina() - gramaCarneMoida);
        setMolhoTomate(getMolhoTomate() - gramaMolhoTomate);
        setBatata(getBatata() - gramaBatata);
    }

}
