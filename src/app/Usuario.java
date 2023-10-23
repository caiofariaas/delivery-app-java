package app;

import java.util.List;

public class Usuario {
    private String nome;
    private Coordenadas endereco;
    private String cpf;

    public Usuario(String nome, Coordenadas endereco, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public Pedido fazerPedido(Restaurante restaurante, List<ItemCardapio> itens){
        return new Pedido(this, restaurante, itens);
    }

}
