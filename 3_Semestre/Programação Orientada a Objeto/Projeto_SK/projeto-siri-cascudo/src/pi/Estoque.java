package pi;

import java.text.DecimalFormat;
import java.util.Scanner;

public abstract class Estoque {

    private double arroz = 8, feijao = 8, carneSuina = 20, alface = 15, batata = 15, tomate = 15;
    private double macarrao = 20, molhoTomate = 15, cenoura = 15;
    private static double bebida;
    private static String nomeBebida;

    public static String getNomeBebida() {
        return nomeBebida;
    }

    public static void setNomeBebida(String nomeBebida) {
        Estoque.nomeBebida = nomeBebida;
    }

    public static double getBebida() {
        return bebida;
    }

    public static void setBebida(int teste) {
        Estoque.bebida = teste;
    }

    public double getMacarrao() {
        return macarrao;
    }

    public void setMacarrao(double macarrao) {
        this.macarrao = macarrao;
    }

    public double getMolhoTomate() {
        return molhoTomate;
    }

    public void setMolhoTomate(double molhoTomate) {
        this.molhoTomate = molhoTomate;
    }

    public double getCenoura() {
        return cenoura;
    }

    public void setCenoura(double cenoura) {
        this.cenoura = cenoura;
    }
    private double calabressa;
    private double cocaCola600 = 10, precoCocaCola = 8.00, fantaUva600 = 10, precoFantaUva = 7.00;

    public double getCalabressa() {
        return calabressa;
    }

    public void setCalabressa(double calabressa) {
        this.calabressa = calabressa;
    }

    public double getCocaCola600() {
        return cocaCola600;
    }

    public void setCocaCola600(double cocaCola600) {
        this.cocaCola600 = cocaCola600;
    }

    public double getFantaUva600() {
        return fantaUva600;
    }

    public void setFantaUva600(double fantaUva600) {
        this.fantaUva600 = fantaUva600;
    }

    public double getArroz() {
        return arroz;
    }

    public void setArroz(double arroz) {
        this.arroz = arroz;
    }

    public double getFeijao() {
        return feijao;
    }

    public void setFeijao(double feijao) {
        this.feijao = feijao;
    }

    public double getCarneSuina() {
        return carneSuina;
    }

    public void setCarneSuina(double bife) {
        this.carneSuina = bife;
    }

    public double getAlface() {
        return alface;
    }

    public void setAlface(double alface) {
        this.alface = alface;
    }

    public double getBatata() {
        return batata;
    }

    public void setBatata(double batata) {
        this.batata = batata;
    }

    public double getTomate() {
        return tomate;
    }

    public void setTomate(double tomate) {
        this.tomate = tomate;
    }

    /**
     * metodo para oferecer uma bebida ao cliente, no prato que ele pediu.
     *
     * @return double
     */
    public double adicionarBebida() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("\nVocê gostaria de adicionar alguma bebida ?\n" //
                + "1 = Sim\n" //
                + "2 = Não\n"//
                + "Numero escolhido: ");
        int opcaoBebida = entrada.nextInt();

        for (;;) {
            while (opcaoBebida != 2) {

                if (opcaoBebida > 0 || opcaoBebida < 3) {
                    if (opcaoBebida == 1)//
                    {
                        System.out.print("\nPresione 0 para cancelar a bebida.");
                        System.out.println("\nEscolha o numero da bebida!");
                        System.out.printf("\n1: Fanta Uva 600ml = R$ %.2f\n"
                                + "2: Coca Cola 600m = R$ %.2f\n"
                                + "Numero escolhido: ", precoFantaUva, precoCocaCola);

                        int numberBebida = entrada.nextInt();

                        switch (numberBebida) {
                            case 0:
                                System.out.println("Bebida cancelada.");
                                Estoque.bebida = 0;
                                return 0;
                            case 1:
                                setFantaUva600(getFantaUva600() - 1);
                                this.bebida = precoFantaUva;
                                return precoFantaUva;
                            case 2:
                                setCocaCola600(getCocaCola600() - 1);
                                this.bebida = precoCocaCola;
                                return precoCocaCola;
                            default:
                                System.out.println("Bebida não cadastrada.");
                        }//fim do switch
                    }//fim do if interno
                    else {
                        System.out.println("\nBebida não encontrada.");
                        System.out.print("Você gostaria de adicionar alguma bebida ?\n" //
                                + "1 = Sim\n" //
                                + "2 = Não\n"//
                                + "Numero escolhido: ");
                        opcaoBebida = entrada.nextInt();
                    }
                }//fim do if externo
            }//fim do while
            break;
        }//fim do for infinito
        entrada.close();
        return 0;
    }

}
