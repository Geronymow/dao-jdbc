package model.dao;

import model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj); //Inserir o objeto no Banco de dados
    void update(Seller obj); //Atualiza o objeto no BD
    void deleteById(Integer id); //Deleta pelo Id
    Seller findById(Integer id); //Consulta o objeto com esse Id
    List<Seller> findAll(); //Retorna todos os Seller

}
