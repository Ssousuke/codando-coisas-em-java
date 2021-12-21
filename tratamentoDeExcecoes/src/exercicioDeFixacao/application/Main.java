package exercicioDeFixacao.application;

import exercicioDeFixacao.model.entities.Accounts;
import exercicioDeFixacao.model.exceptions.DomainException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter account data");

            System.out.println("Number: ");
            int number = sc.nextInt();

            System.out.println("Holder: ");
            String holder = sc.nextLine();
            sc.nextLine();

            System.out.println("Initial Balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw Limit: ");
            double withdraw = sc.nextDouble();

            Accounts accounts = new Accounts(number, holder, balance, withdraw);

            System.out.println("Enter amount for withdraw: ");
            accounts.withdraw(sc.nextDouble());

            System.out.println("New Balance: " + accounts.getBalance());

            System.out.println("Enter a new Deposit: ");
            accounts.deposit(sc.nextDouble());

            System.out.println("New Balance: " + accounts.getBalance());

        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Erro ao processar solicitação!");
        } catch (DomainException domainException) {
            System.out.println(domainException);
        }
        sc.close();
    }
}
