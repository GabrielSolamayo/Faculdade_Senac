/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pi;

import java.util.Scanner;

/**
 *
 * @author eric
 */
public class Menu extends Cliente {

    private PratoBifeComFritas bife = new PratoBifeComFritas();
    private PratoCalabressaComFritas calabressa = new PratoCalabressaComFritas();
    private PratoMacarronada macarrao = new PratoMacarronada();

    public Menu(String nome, String cpf) {
        super(nome, cpf);
    }

    public void exibirCardapio() {
//        PratoBifeComFritas bife = new PratoBifeComFritas();;
//        PratoCalabressaComFritas calabressa = new PratoCalabressaComFritas();
//        PratoMacarronada macarrao = new PratoMacarronada();

        System.out.println("\n\t\tBem-Vindo ao Siri-Cascudo");
        System.out.println("________________________________________________________________________________");
        System.out.println("\n\t\tVeja nosso cardapio e aproveite!");

        bife.descricaoDoPrato();
        calabressa.descricaoDoPrato();
        macarrao.descricaoDoPrato();

        System.out.println("________________________________________________________________________________\n");
        bife = null;
        calabressa = null;
        macarrao = null;
    }

    public int escolherPratos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha seu prato.");
        System.out.printf("1: Bife com Fritas\n"
                + "2: Calabressa com Fritas\n"
                + "3: Macarronada\n"
                + "Numero escolhido: ");
        int prato = entrada.nextInt();
        return prato;
    }

    public void escolherPedido() {

        int prato = escolherPratos();
        switch (prato) {
            case 1:
                bife = new PratoBifeComFritas();
                bife.baixaEstoque();
                bife.descricaoDoPrato();
                System.out.println(bife.valorDoPrato());
                notaFiscal(prato);
                break;
            case 2:
                calabressa = new PratoCalabressaComFritas();
                calabressa.baixaEstoque();
                calabressa.descricaoDoPrato();
                System.out.println(calabressa.valorDoPrato());
                notaFiscal(prato);
                break;
            case 3:
                macarrao = new PratoMacarronada();
                macarrao.baixaEstoque();
                macarrao.descricaoDoPrato();
                System.out.println(macarrao.valorDoPrato());
                notaFiscal(prato);
                break;
            default:
                System.out.println("Prato não cadastrado.");
        }

    }

    public void notaFiscal(int number) {
        System.out.println("________________________________________________________________________________\n");
        thredDeExecucao();
        String tipo = Estoque.getBebida() == 7 ? "Fanta uva 600ml" : Estoque.getBebida() == 8 ? "Coca Cola 600ml" : "";

        System.out.println("\n________________________________________________________________________________");
        System.out.println("\t\tNota fiscal\n");
        mostraInformacoes();
        System.out.print("\n\t\tProduto consumido.\n");
        switch (number) {
            case 1:
                PratoBifeComFritas b = new PratoBifeComFritas();
                b.descricaoDoPrato();
                System.out.printf("Bebida: %.2f %s\n", Estoque.getBebida(), tipo);
                System.out.println("\n\t\tTotal a pagar: " + bife.getValorDoPrato());
                b = null;
                bife = null;
                break;
            case 2:
                PratoCalabressaComFritas c = new PratoCalabressaComFritas();
                c.descricaoDoPrato();
                System.out.printf("Bebida: %.2f %s\n", Estoque.getBebida(), tipo);
                System.out.println("\n\t\tTotal a pagar: " + calabressa.getValorDoPrato());
                c = null;
                calabressa = null;
                break;
            case 3:
                PratoMacarronada m = new PratoMacarronada();
                m.descricaoDoPrato();
                System.out.printf("Bebida: %.2f %s\n", Estoque.getBebida(), tipo);
                System.out.println("\n\t\tTotal a pagar: " + macarrao.getValorDoPrato());
                m = null;
                macarrao = null;
                break;

        }
        System.out.println("________________________________________________________________________________");

    }

    private void thredDeExecucao() {

        System.out.println("Esperando confirmação do pedido...\nPedido confirmado...");
        System.out.println("Iniciando a preparação do pedido...\n");

        ThreadSiriCascudo thread = new ThreadSiriCascudo();

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(1100);
            } catch (InterruptedException thred) {
                System.out.println("Pedido interrompido.");
            }
        }
        System.out.println("\n\nPedido finalizado.\nBom apetite.");
    }

}
