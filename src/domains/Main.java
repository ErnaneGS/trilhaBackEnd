package domains;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Categoria
        Category categoria01 = new Category(01L, "Salario", "Pagamento de salário ao funcionário");

        Category categoria02 = new Category();
        categoria02.setId(02L);
        categoria02.setName("Vale Transporte");
        categoria02.setDescription("Pagamento de Vale Transporte ao funcionário");

        System.out.println();
        System.out.println("Imprimindo as categorias:");
        System.out.println(categoria01.toString());
        System.out.println(categoria02.toString());

        //Lancamento
        Entry lancamento01 = new Entry(01L, "Pagamento de salário", "Pagamento mensal", "Receita", "5000,00", "23022022", true, 1L);

        Entry lancamento02 = new Entry();
        lancamento02.setId(02L);
        lancamento02.setName("Pagamento de vale transporte");
        lancamento02.setDescription("Pagamento referente ao mês de janeiro");
        lancamento02.setType("Receita");
        lancamento02.setAmount("500,00");
        lancamento02.setDate("23022022");
        lancamento02.setPaid(true);
        lancamento02.setCategoriaId(02L);

        //Produto
        Product produto01 = new Product(01L, "Cadeira de escritório", "Cadeira de escritório giratória", 150.00);
        Product produto02 = new Product(02L, "Mesa de escritório", "Mesa de escritório MDF", 250.00);
        Product produto03 = new Product(03L, "Ventilador", "Ventilador de mesa médio", 90.00);
        Product produto04 = new Product(04L, "Abajur", "Abajur médio", 40.00);
        Product produto05 = new Product(05L, "Umidifcador de ar", "Umidificador de ar 3 em 1", 450.0);

        List<Product> produtos = Arrays.asList(produto01, produto02, produto03, produto04, produto05);

        for (Product p : produtos) {
            p.setPrice(p.getPrice() + 10.00);
        }

        System.out.println();
        System.out.println("Imprimindo todos os produtos");;

        for (Product p : produtos) {
            System.out.println(p);
        }

        produtos.sort(Comparator.comparing(Product::getPrice).reversed());

        List<Product> produtosMaisCaros = produtos.stream().limit(3).toList();

        System.out.println();
        System.out.println("Imprimindo os 03 produtos mais caros");

        for (Product p : produtosMaisCaros) {
            System.out.println(p);
        }

    }

}