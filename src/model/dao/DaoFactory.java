package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createsellerDao() {
        return new SellerDaoJDBC();

        //Inserir a dependência sem mostrar a implementação
    }
}
