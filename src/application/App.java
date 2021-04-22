package application;

import model_dao.DaoFactory;
import model_dao.SellerDAO;
import model_entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        
        SellerDAO sellerDAO = DaoFactory.createSellerDao();

        System.out.println("=== Teste Numero 1: Seller FindById ===");
        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);
        
    }
}
