package byteBank;

// Introdução a orientação a objetos da plataforma Alura
public class Conta {
    // Atributos de instancia
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    // Atributo da classe
    // É um atributo que pertence a classe e não a instancia
    private static int totalDeContas;

    public Conta(int agencia, int numero) {
        Conta.totalDeContas++;
        this.saldo = 0;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    // getter e setter
    // Os atributos privados e só podem ser usados dentro da propria classe
    // Mas é possivel acessar esses atributos atraves de métodos que retornam eles.

    // Os métodos getAtributo são usados para retornar um atributo
    // Os métodos setAtributo são usados para modificar uma atributo, "settar" um novo valor
    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        } else {
            System.out.println("Não pode ser inserido um número menor que zero!");
        }
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    // Os métodos que retornam um valor estático devem receber o "static"
    // para que possam ser referenciados a partir da classe
    // EX: Conta.getTotalDeContas()
    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }
}
