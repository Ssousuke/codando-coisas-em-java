package listas.questao02.application;

import listas.questao02.entities.Funcionario;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List<Funcionario> funcionario = new ArrayList<>();

        System.out.println("Quantos funcionários deseja registrar?");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Funcionário #" + (i + 1));

            System.out.println("id: ");
            int id = sc.nextInt();

            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Salário: ");
            double salario = sc.nextDouble();

            // Instancia um novo funcionário
            Funcionario func = new Funcionario(id, nome, salario);
            // Adiciona esse funcionário na lista
            funcionario.add(func);
        }

        System.out.println("Informe o ID do funcionário que vai receber o aumento: ");
        int id = sc.nextInt();

        // Usando o método estatico para filtrar funcionário
        Integer posicao = procurarID(funcionario, id);
        if (posicao == null) {
            System.out.println("Esse ID não existe!");
        } else {
            System.out.println("Qual o valor da porcentagem de aumento para o funcionário? ");
            double porcentagem = sc.nextDouble();
            funcionario.get(posicao).aumentoSalario(porcentagem);
        }

        // Usando foreach para buscar funcionários
        for (Funcionario fuc : funcionario) {
            System.out.println(fuc.toString());
        }

        sc.close();
    }

    // Método estatico para procurar funcionário pelo ID
    public static Integer procurarID(List<Funcionario> lista, int id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
