package funcionario.entities;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double tax;

    public double salarioLiquido() {
        return salarioBruto - tax;
    }

    public void aumentaSalario(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100;
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome + ", Sálario Liquido: " + salarioLiquido();
    }
}
