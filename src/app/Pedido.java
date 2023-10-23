package app;

import java.util.List;

public class Pedido {
    private Usuario usuario;
    private Restaurante restaurante;
    private List<ItemCardapio> itens;

    public Pedido(Usuario usuario, Restaurante restaurante, List<ItemCardapio> itens) {
        this.usuario = usuario;
        this.restaurante = restaurante;
        this.itens = itens;
    }
    public double calcularValorTotal(){
        double total = 0;
        for(ItemCardapio item : itens){
            total += item.getPreco();
        }
        return total;
    }
}
