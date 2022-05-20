package aluraHeranca;

public class Gerente extends Funcionario {
    private int senha;

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    @Override
    public double getBonificacao() {
        // super indica que o atributo vem da super classe
        return super.getBonificacao() + super.getSalario();
    }
}
