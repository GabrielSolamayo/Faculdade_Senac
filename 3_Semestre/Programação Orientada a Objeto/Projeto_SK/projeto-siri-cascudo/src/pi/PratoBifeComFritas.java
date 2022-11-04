package pi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PratoBifeComFritas extends Estoque implements Pagamento {

    final double gramaArroz = 0.670, gramaFeijao = 0.543, gramaBife = 0.856, gramaAlface = 0.334,
            gramaBatataFrita = 0.854, gramaTomate = 0.444;

    private double valorDoPrato;

    public double getValorDoPrato() {
        return valorDoPrato;
    }

    public void setValorDoPrato(double valorDoPrato) {
        this.valorDoPrato = valorDoPrato;
    }

    public PratoBifeComFritas() {

    }

    @Override
    public void calcularGramasDeComida() {

    }

    /**
     * Esse método realiza baixa no estoque, toda vez que um pedido do prato é
     * realizado.
     *
     * @return void
     */
    @Override
    public void baixaEstoque() {
        setArroz(getArroz() - gramaArroz);
        setFeijao(getFeijao() - gramaFeijao);
        setCarneSuina(getCarneSuina() - gramaBife);
        setAlface(getAlface() - gramaAlface);
        setBatata(getAlface() - gramaBatataFrita);
        setTomate(getTomate() - gramaTomate);
    }

    public void descricaoDoPrato() {
        System.out.println("\nPrato 1: Bife com Fritas "
                + "\nDescrição: Arroz, Feijao, bife, batata frita e salada. \nPreço: " + precoDoPrato());
    }

    /**
     * Esse metodo calcula e define o valor do prato.
     *
     * @return double
     */
    @Override
    public double valorDoPrato() {
        setValorDoPrato(getValorDoPrato() + super.adicionarBebida());
        System.out.print("\nValor do prato: ");
        return getValorDoPrato();
    }

    private double precoDoPrato() {
        DecimalFormat dc = new DecimalFormat("##. 00");

        double[] soma = {gramaArroz, gramaFeijao, gramaBife, gramaAlface, gramaBatataFrita, gramaTomate};

        for (int i = 0; i < soma.length; i++) {
            soma[i] *= 7;
            valorDoPrato += soma[i];
        }

        String formatar = dc.format(valorDoPrato).replace(",", ".");
        valorDoPrato = Double.parseDouble(formatar);
        setValorDoPrato(valorDoPrato);

        return valorDoPrato;
    }

}
