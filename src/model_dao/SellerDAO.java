package model_dao;

import java.util.List;

import model_entities.Seller;

public interface SellerDAO {

    void insert(Seller seller);

    void update(Seller seller);

    void deleteById(Integer id);

    Seller findById(Integer id);

    List<Seller> findAll();
}
