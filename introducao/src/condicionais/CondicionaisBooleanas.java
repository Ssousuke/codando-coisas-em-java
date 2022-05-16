package condicionais;

public class CondicionaisBooleanas {
    public static void main(String[] args) {
        System.out.println("Testando condicionais booleanas");
        int idade = 16;
        boolean acompanhado = true;
        // && = Condicional booleana que representa o " E ", as duas condicionais devem ser verdadeiras
        // || = Condicional booleana que representa o  " OU ". uma das duas condicionais deve ser verdadeira
        if (idade >= 18 || acompanhado) {
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Não pode entrar!");
        }
    }
}
