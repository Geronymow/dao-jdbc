package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createsellerDao() {
        return new SellerDaoJDBC(DB.getConnection());

        //Inserir a dependência sem mostrar a implementação
    }
}
