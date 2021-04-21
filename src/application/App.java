package application;

import java.util.Date;

import model_entities.Department;
import model_entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        
        Department obj = new Department(2, "Books");

        Seller seller = new Seller(21, "Victor", "victor@gmail.com", new Date(), 2000.0, obj);

        System.out.println(seller);
    }
}
