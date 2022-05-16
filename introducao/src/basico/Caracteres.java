package basico;

public class Caracteres {
    public static void main(String[] args) {
        // Um unico caractere unicode
        char letra = 'M';
        System.out.println(letra);

        // O char também guarda o valor que serve para identificar o caractere unicode
        char b = 66;
        System.out.println(b);

        // recebendo o valor e somando
        b += 1;
        System.out.println(b);

        // String
        String frase = "Olá mundo!";
        System.out.println(frase);

        // Concatenação de strings
        frase += " Isso é uma concatenação em java!";
        System.out.println(frase);
    }
}
