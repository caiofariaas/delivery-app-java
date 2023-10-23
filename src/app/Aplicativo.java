package app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
        List<ItemCardapio> cardapioRestaurante = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Restaurante restaurante = new Restaurante("Farias Food", "123456", new Coordenadas(10, 20), cardapioRestaurante);

        restaurante.addItemCardapio(new ItemCardapio("Risoto", 40.49));
        restaurante.addItemCardapio(new ItemCardapio("Parmegianna", 30.99));
        restaurante.addItemCardapio(new ItemCardapio("Macarrão", 35.50));
        restaurante.addItemCardapio(new ItemCardapio("Lasanha", 40.49));

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Olá, bem vindo ao iFarias Delivery!");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("Estamos te redirecionando ao cadastro!");
        utilities.sleep();

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Digite as coordenadas de sua casa, começando com X: ");
        double x = sc.nextDouble();
        System.out.print("Agora o valor de y: ");
        double y = sc.nextDouble();

        Usuario usuario = new Usuario(nome, new Coordenadas(x, y), cpf);

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Usuário criado Com sucesso!");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println("Seja bem vindo ao Restaurante "+ restaurante.getNome() + "!");
        System.out.println("Deseja fazer um pedido?\n1 <- Sim\n2 <- Não");
        int opt = sc.nextInt();

        //continuar switch case

        switch (opt) {
            case 1 -> {
                Scanner inputPedido = new Scanner(System.in);
                List<ItemCardapio> pedido = new ArrayList<>();
                System.out.println("\nCardapio do dia!\n");
                restaurante.mostrarCardapio();
                System.out.println("Digite o nome do prato que deseja!");
                String pratoPedido = inputPedido.nextLine();
                ItemCardapio pedidoCliente = null;
                for (ItemCardapio item : cardapioRestaurante) {
                    if (item.getNome().equalsIgnoreCase(pratoPedido)) {
                        pedidoCliente = item;
                        break;
                    }
                }
                if (pedidoCliente == null) {
                    System.out.println("O item solicitado não foi encontrado no cardápio, tente novamente!");
                } else {
                    pedido.add(pedidoCliente);
                    System.out.println(pedidoCliente.getNome() + " Adicionado ao pedido!");
                }
            }
            case 2 -> System.out.println("Até a proxima!");
        }
    }
}
