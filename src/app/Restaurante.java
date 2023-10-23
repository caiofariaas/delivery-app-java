package app;

import java.util.List;

public class Restaurante {
    private String nome;
    private String cnpj;
    private List<ItemCardapio> cardapio;
    private Coordenadas localizacao;

    public Restaurante(String nome, String cnpj, Coordenadas localizacao, List<ItemCardapio> cardapio){
        this.nome = nome;
        this.cnpj = cnpj;
        this.cardapio = cardapio;
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }

    public List<ItemCardapio> getCardapio() {
        return cardapio;
    }

    public void addItemCardapio(ItemCardapio item){
        cardapio.add(item);
    }
    public void removeItemCardapio(ItemCardapio item){
        cardapio.remove(item);
    }
    public void mostrarCardapio(){
        for(ItemCardapio item : cardapio){
            System.out.println(item.getNome() + " - R$" + item.getPreco());
        }
    }
}