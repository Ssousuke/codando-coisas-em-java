package application;

import entities.Departamento;
import entities.HorasDeContrato;
import entities.Trabalho;
import entities.enums.NivelExperiencia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Nome do Departamento: ");
        String departamento = sc.nextLine();

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Nome: ");
        String nivel = sc.nextLine();

        System.out.println("Nome: ");
        Double salarioBase = sc.nextDouble();

        Trabalho trabalho = new Trabalho(nome, NivelExperiencia.valueOf(nivel), salarioBase, new Departamento(departamento));

        System.out.println("Quantos contratos o funcionário tem? ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Data do #" + (i + 1) + "contrato: ");
            Date contratoData = simpleDateFormat.parse(sc.next());

            System.out.println("Valor por hora: ");
            double valorPorHora = sc.nextDouble();

            System.out.println("Duração (EM HORAS): ");
            int quantidadeDeHoras = sc.nextInt();


            HorasDeContrato contrato = new HorasDeContrato(contratoData, valorPorHora, quantidadeDeHoras);
            trabalho.addHorasDeContrato(contrato);

        }
        System.out.println("Mês e ano: ");
        String mesAno = sc.next();

        int ano = Integer.parseInt((mesAno.substring(0, 2)));
        int mes = Integer.parseInt(mesAno.substring(3));

        System.out.println("Nome: " + trabalho.getNome());
        System.out.println("Departamento: " + trabalho.getDepartamento().getNome());
        System.out.println("Total: " + mesAno + ": " + trabalho.faturamento(ano, mes));

        sc.close();
    }
}
