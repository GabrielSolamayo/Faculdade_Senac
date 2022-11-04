package pi;

public class PedidoApp {

    public static void main(String[] args) {

        Menu menu = new Menu("Personaliza", "senac-157");;
        menu.exibirCardapio();
        menu.escolherPedido();

    }
}
