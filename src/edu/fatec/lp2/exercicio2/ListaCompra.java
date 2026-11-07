package edu.fatec.lp2.exercicio2;

public class ListaCompra implements Calculavel {

    private ItemCompra[] itensCompra;
    private int qtdeMax;
    private int totalItens;

    public ListaCompra(int qtdeMax) {
        if (qtdeMax <= 0) {
            throw new IllegalArgumentException(
                    "A capacidade deve ser maior que zero.");
        }

        this.qtdeMax = qtdeMax;
        this.itensCompra = new ItemCompra[qtdeMax];
        this.totalItens = 0;
    }

    public ItemCompra[] getItensCompra() {
        return itensCompra.clone();
    }

    public int getQtdeMax() {
        return qtdeMax;
    }

    public int getTotalItens() {
        return totalItens;
    }

    public void incluir(ItemCompra item) {
        if (item == null) {
            throw new IllegalArgumentException(
                    "O item nao pode ser nulo.");
        }

        if (totalItens < qtdeMax) {
            itensCompra[totalItens] = item;
            totalItens++;

            System.out.println("Item incluido: "
                    + item.getProduto().getNome());
        } else {
            System.out.println("Lista de compras cheia!");
        }
    }

    @Override
    public double calcularPreco() {
        double total = 0;

        for (int i = 0; i < totalItens; i++) {
            total += itensCompra[i].calcularPreco();
        }

        return total;
    }
}
