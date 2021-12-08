package product.applicaiton;

import product.entities.ImportedProduct;
import product.entities.Product;
import product.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> listProduct = new ArrayList<>();

        System.out.println("Enter com o número de produtos: ");
        int productNumber = sc.nextInt();

        for (int i = 0; i < productNumber; i++) {
            System.out.println("Dados do produto #" + (i + 1));

            System.out.println("O produto é comum/usado/importado (c/u/i)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();

            System.out.println("Produto: ");
            String product = sc.nextLine();


            System.out.println("Preço: ");
            double price = sc.nextDouble();

            if (type == 'i') {
                System.out.println("Taxa alfandegária: ");
                double customFee = sc.nextDouble();
                Product productImported = new ImportedProduct(product, price, customFee);
                listProduct.add(productImported);

            } else if (type == 'u') {
                System.out.println("Data de fabricação: (dd/MM/yyyy)");
                Date manufaturedDate = sdf1.parse(sc.next());
                Product productUsed = new UsedProduct(product, price, manufaturedDate);
                listProduct.add(productUsed);
            } else {
                Product comomProduct = new Product(product, price);
                listProduct.add(comomProduct);
            }
        }
        System.out.println("Tag de preços: ");
        for (Product x : listProduct) {
            System.out.println(x.priceTag());
        }

        sc.close();
    }
}
