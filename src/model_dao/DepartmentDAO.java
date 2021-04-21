package model_dao;

import java.util.List;

import model_entities.Department;

public interface DepartmentDAO {

    void insert(Department department);

    void update(Department department);

    void deleteById(Integer id);

    Department findById(Integer id);

    List<Department> findAll();
}
