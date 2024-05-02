package application;

import model.entities.Product;
import model.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        double sum2 = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');
        double sum3 = ps.filteredSum(list,p -> p.getPrice() <= 100.00 );
        double sum4 = ps.filteredSum(list,p -> p.getName() == "Tv");

        System.out.println("Sum where First letter is T : " + String.format("%.2f", sum));
        System.out.println("Sum where First letter is M : " + String.format("%.2f", sum2));
        System.out.println("Sum where Product Price is lees than a hundred : " + String.format("%.2f", sum3));
        System.out.println("Sum where Name is 'Tv' : " + String.format("%.2f", sum4));
    }
}