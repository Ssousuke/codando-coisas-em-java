package aluraHeranca;

// Polimorfismo
public class Main {
    public static void main(String[] args) {
        // deixando explicito que todo gerente é um funcionário
        Funcionario funcionario = new Gerente();
        // o contrario não compila, pois nem todo funcionário é um gerente
        // Gerente gerente = new Funcionario();
        funcionario.setNome("Wesley Matheus");
        // quando é chamado o método autentica, vai dar erro de compilação
        // pois o compilador só analisa apenas a referência, ou seja
        // ele olha apenas a classe Funcionario.
        // não compila -> funcionario.autentica(123456);
        System.out.println(funcionario.getNome());
    }
}
