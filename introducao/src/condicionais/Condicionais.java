package condicionais;

public class Condicionais {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 16;
        int quantidadePessoas = 3;
        // Tradicionalmente usamos o if desta forma
        if (idade >= 18) {
            System.out.println("Maior de idade!");
        } else {
            if (quantidadePessoas >= 2) {
                System.out.println("Não tem 18, mas pode entrar acompanhado!");
            } else {
                System.out.println("Não tem 18 e não está acompanhado!");
            }
            System.out.println("Fim da condicional!");
        }

        // Mas caso exista apenas uma seja necessário apenas um teste de condição "instrução"
        // podemos usar essa sintaxe do if
        if (idade > 11)
            System.out.println("Isso também funciona!");

    }
}
