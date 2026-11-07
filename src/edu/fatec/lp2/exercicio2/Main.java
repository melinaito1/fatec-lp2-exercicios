package edu.fatec.lp2.exercicio2;

public class Main {

    public static void main(String[] args) {

        // 1. Criar supermercado
        Supermercado mercado =
                new Supermercado("Supermercado Astolfo");

        // 2. Criar produto: arroz
        Produto arroz = new Produto(mercado);
        arroz.setNome("Arroz 5kg");
        arroz.setUnidade("Pacote");
        arroz.setDescricao("Arroz branco tipo 1");
        arroz.setPreco(25.90);
        arroz.setDescontoMaximo(20);

        // 3. Criar produto: leite
        Produto leite = new Produto(mercado);
        leite.setNome("Leite integral");
        leite.setUnidade("Litro");
        leite.setDescricao("Leite integral 1L");
        leite.setPreco(5.50);
        leite.setDescontoMaximo(15);

        // 4. Criar produto: cafe
        Produto cafe = new Produto(mercado);
        cafe.setNome("Cafe 500g");
        cafe.setUnidade("Pacote");
        cafe.setDescricao("Cafe torrado e moido");
        cafe.setPreco(18.00);
        cafe.setDescontoMaximo(10);

        // 5. Criar itens de compra
        ItemCompra item1 = new ItemCompra(arroz, 10);
        item1.setQuantidade(2);

        ItemCompra item2 = new ItemCompra(leite, 5);
        item2.setQuantidade(4);

        ItemCompra item3 = new ItemCompra(cafe, 10);
        item3.setQuantidade(1);

        // 6. Criar lista com capacidade de 5 itens
        ListaCompra lista = new ListaCompra(5);

        // 7. Adicionar os itens
        lista.incluir(item1);
        lista.incluir(item2);
        lista.incluir(item3);

        // 8. Exibir os resultados
        System.out.println("\n=== CUPOM DE COMPRA ===");
        System.out.println("Mercado: " + mercado.getNome());

        System.out.printf(
                "%s: R$ %.2f%n",
                arroz.getNome(), item1.calcularPreco());

        System.out.printf(
                "%s: R$ %.2f%n",
                leite.getNome(), item2.calcularPreco());

        System.out.printf(
                "%s: R$ %.2f%n",
                cafe.getNome(), item3.calcularPreco());

        System.out.println("-------------------------");

        System.out.printf(
                "TOTAL: R$ %.2f%n",
                lista.calcularPreco());
    }
}
