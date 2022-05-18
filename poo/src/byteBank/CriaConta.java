package byteBank;

public class CriaConta {
    public static void main(String[] args) {
        Cliente wesley = new Cliente();
        wesley.setNome("Wesley Farias");
        wesley.setCpf("555.555.555-12");
        wesley.setProfissao("Desenvolvedor de software");

        Conta wesleyConta = new Conta();
        wesleyConta.deposita(100.0);
        wesleyConta.deposita(200.0);
        wesleyConta.saca(150.0);

        // Composição é basicamente usar uma classe dentro da outra.
        // Mais precisamente é fazer com que duas classes troquem informações.
        // neste casso a Classe Conta está recebendo informações da classe Cliente.
        wesleyConta.setTitular(wesley);
        System.out.println(wesleyConta.getTitular().getNome());
        System.out.println(wesleyConta.getSaldo());
    }
}
