package listas;

import java.util.ArrayList;
import java.util.List;

public class Questao01 {
    public static void main(String[] args) {

        // Implementando ArrayList
        List<String> lista = new ArrayList<>();

        // Adicionando Itens
        lista.add("Item 00");
        lista.add("Item 01");
        lista.add("Item 02");
        lista.add("Item 03");

        // Adicionando Itens em uma posição
        lista.add(2, "Novo item 02");
        for (String nome : lista) {
            System.out.println(nome);
        }

        // Tamanho da lista
        System.out.println("Tamanho da lista: " + lista.size());


        // Remover Item pelo valor
        lista.remove("Item 01");

        // Remover pela posição
        lista.remove(1);

        // Removendo pelo predicado com Expressão Lambda
        // Explicando: Remove todo o String x em que o x tenha como caractere na primeira posição(0) M
        lista.removeIf(x -> x.charAt(0) == 'M');


        // Filtrando um elemento pelo valor
        System.out.println("Encontrando: Wesley" + lista.indexOf("Wesley"));
    }
}
