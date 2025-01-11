package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) throws ParseException {

        SellerDao sellerDao = DaoFactory.createsellerDao();

        System.out.println("=== TEST 1: Seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        System.out.println();

        System.out.println("=== TEST 2: Seller findByDepartment ===");
        Department dep = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(dep);
        for(Seller obj : list) {
            System.out.println(obj);
        }
        System.out.println();

        System.out.println("=== TEST 3: Seller findAll ===");
        list = sellerDao.findAll();
        for(Seller obj : list) {
            System.out.println(obj);
        }
        System.out.println();

        System.out.println("=== TEST 4: Seller insert ===");
        Seller newSeller = new Seller(
                null,"Greg","greg@gmail.com",new Date(),4000.0, dep);
        sellerDao.insert(newSeller);
        System.out.println("INSERTED! NEW ID: " + newSeller.getId());

    }
}
