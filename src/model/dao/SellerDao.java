package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.sql.SQLException;
import java.util.List;

public interface SellerDao {

    void insert(Seller obj); //Inserir o objeto no Banco de dados
    void update(Seller obj) throws SQLException; //Atualiza o objeto no BD
    void deleteById(Integer id); //Deleta pelo Id
    Seller findById(Integer id); //Consulta o objeto com esse Id
    List<Seller> findAll(); //Retorna todos os Seller
    List<Seller> findByDepartment(Department department); //Achar pelo Department

}
