package heranca.application;

import heranca.entities.Account;
import heranca.entities.BusinessAcount;
import heranca.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Wesley", 0.0);
        BusinessAcount bcc = new BusinessAcount(1002, "Matheus", 0.0, 500.0);

        // UPCASTING
        // Objeto da Sub-Classe está sendo atribuido a uma váriavel da Super-Classe
        Account acc01Upcasting = bcc;
        Account acc02Upcasting = new BusinessAcount(1003, "Fernanda", 0.0, 500.0);
        Account acc03Upcasting = new SavingsAccount(1004, "Debóra", 0.0, 0.01);

        // DOWNCASTING
        // É preciso fazer um casting para o tipo da classe
        BusinessAcount acc04DownCasting = (BusinessAcount) bcc;
        acc04DownCasting.loan(100.0);

        //BusinessAcount acc05DownCasting = (BusinessAcount) acc03Upcasting;
        if (acc03Upcasting instanceof BusinessAcount) {
            BusinessAcount acc05DownCasting = (BusinessAcount) acc03Upcasting;
            acc05DownCasting.loan(20.0);
            System.out.println("Loan!");
        }
        if (acc03Upcasting instanceof SavingsAccount) {
            SavingsAccount acc05DownCasting = (SavingsAccount) acc03Upcasting;
            acc05DownCasting.updateBalance();
            System.out.println("Update!");
        }
    }
}
