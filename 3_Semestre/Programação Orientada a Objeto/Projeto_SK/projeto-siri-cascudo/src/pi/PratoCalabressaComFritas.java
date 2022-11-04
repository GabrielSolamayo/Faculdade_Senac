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
public class PratoCalabressaComFritas extends Estoque implements Pagamento {

    final double gramaArroz = 0.671;
    final double gramaFeijao = 0.543;
    final double gramaCalabressa = 0.890;
    final double gramaAlface = 0.434;
    final double gramaTomate = 0.543;
    final double gramaBatataFrita = 1.00;
    private double valorDoPrato = 0;

    public double getValorDoPrato() {
        return valorDoPrato;
    }

    public void setValorDoPrato(double valorDoPrato) {
        this.valorDoPrato = valorDoPrato;
    }

    public void descricaoDoPrato() {
        System.out.println("\nPrato 2: Calabressa com Fritas "
                + "\nDescricao: Arroz, Feijao, calabressa frita, batata frita e salada. \nPreço: " + precoDoPrato());
    }

    @Override
    public void calcularGramasDeComida() {
    }

    @Override
    public void baixaEstoque() {
        setArroz(getArroz() - gramaArroz);
        setFeijao(getFeijao() - gramaFeijao);
        setCarneSuina(getCalabressa() - gramaCalabressa);
        setAlface(getAlface() - gramaAlface);
        setBatata(getAlface() - gramaBatataFrita);
        setTomate(getTomate() - gramaTomate);
    }

    @Override
    public double valorDoPrato() {
        setValorDoPrato(getValorDoPrato() + super.adicionarBebida());

        System.out.print("\nValor do prato: ");
        return getValorDoPrato();
    }

    private double precoDoPrato() {
        DecimalFormat dc = new DecimalFormat("##. 00");

        double[] soma = {gramaArroz, gramaFeijao, gramaCalabressa,
            gramaAlface, gramaTomate, gramaBatataFrita,};

        for (int i = 0; i < soma.length; i++) {
            soma[i] *= 5;
            valorDoPrato += soma[i];
        }

        String valor = dc.format(valorDoPrato).replace(",", ".");
        valorDoPrato = Double.parseDouble(valor);
        setValorDoPrato(valorDoPrato);
        return valorDoPrato;
    }
}
