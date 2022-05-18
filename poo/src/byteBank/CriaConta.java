package byteBank;

public class CriaConta {
    public static void main(String[] args) {
        Cliente wesley = new Cliente("Wesley Farias", "555.555.555-12", "Desenvolvedor de Software");

        Conta wesleyConta = new Conta(1001, 23345);
        wesleyConta.deposita(100.0);
        wesleyConta.deposita(200.0);
        wesleyConta.saca(150.0);

        // Composição é basicamente usar uma classe dentro da outra.
        // Mais precisamente é fazer com que duas classes troquem informações.
        // neste casso a Classe Conta está recebendo informações da classe Cliente.
        wesleyConta.setTitular(wesley);
        System.out.println(wesleyConta.getTitular().getNome());
        System.out.println(wesleyConta.getSaldo());

        // setando uma nova profissão
        wesleyConta.getTitular().setProfissao("Desenvolvedor de Software Júnior");
        System.out.println(Conta.getTotalDeContas());


    }
}
