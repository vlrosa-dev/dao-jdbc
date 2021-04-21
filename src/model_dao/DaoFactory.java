package model_dao;

import db.DB;
import model_dao_impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDAO createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
    
}
