package model_dao_impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model_dao.SellerDAO;
import model_entities.Department;
import model_entities.Seller;

public class SellerDaoJDBC implements SellerDAO {

    private Connection conn;

    public SellerDaoJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insert(Seller seller) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(Seller seller) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteById(Integer id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Seller findById(Integer id) {

        PreparedStatement st = null;
        ResultSet rs = null;

        try{
            st = conn.prepareStatement(
                "SELECT seller.*, department.name as DepName "
                + "FROM seller "
                + "INNER JOIN department "
                + "ON department.Id = seller.DepartmentId "
                + "WHERE seller.Id = ?"
            ); 
            
            st.setInt(1, id);
            rs = st.executeQuery();

            if(rs.next()){
                
                Department department = new Department();
                    department.setId(rs.getInt("DepartmentId"));
                    department.setName(rs.getString("DepName"));

                Seller seller = new Seller();
                    seller.setId(rs.getInt("Id"));
                    seller.setName(rs.getString("Name"));
                    seller.setEmail(rs.getString("Email"));
                    seller.setBaseSalary(rs.getDouble("BaseSalary"));
                    seller.setBirthdate(rs.getDate("BirthDate"));
                    seller.setDepartment(department);

                return seller;
            }

            return null;
        }
        catch (SQLException e){
            throw new DbException(e.getMessage());
        }
        finally{
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }

    }

    @Override
    public List<Seller> findAll() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
