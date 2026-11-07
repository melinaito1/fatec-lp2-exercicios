package edu.fatec.lp2.exercicio2;

public class ItemCompra implements Calculavel {

    private int quantidade;
    private Produto produto;
    private double desconto;

    public ItemCompra(Produto produto, double desconto) {
        if (produto == null) {
            throw new IllegalArgumentException(
                    "O produto nao pode ser nulo.");
        }

        this.produto = produto;
        setDesconto(desconto);
        this.quantidade = 1;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException(
                    "A quantidade deve ser maior que zero.");
        }
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException(
                    "O produto nao pode ser nulo.");
        }
        if (desconto > produto.getDescontoMaximo()) {
            throw new IllegalArgumentException(
                    "O desconto atual excede o limite do novo produto.");
        }
        this.produto = produto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        if (desconto < 0 ||
                desconto > produto.getDescontoMaximo()) {
            throw new IllegalArgumentException(
                    "Desconto fora do limite permitido.");
        }

        this.desconto = desconto;
    }

    @Override
    public double calcularPreco() {
        double valorTotal = produto.getPreco() * quantidade;
        double valorDesconto = valorTotal * desconto / 100;

        return valorTotal - valorDesconto;
    }
}
