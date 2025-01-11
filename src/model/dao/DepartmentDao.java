package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insert(Department obj); //Inserir o objeto no Banco de dados
    void update(Department obj); //Atualiza o objeto no BD
    void deleteById(Integer id); //Deleta pelo Id
    Department findById(Integer id); //Consulta o objeto com esse Id
    List<Department> findAll(); //Retorna todos os Departamentos

}
