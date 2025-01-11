package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

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
        System.out.println();

        System.out.println("=== TEST 5: Seller update ===");
        seller = sellerDao.findById(1);
        seller.setName("Bob Brown Caine");
        sellerDao.update(seller);
        System.out.println("Update Completed");
        System.out.println();

        System.out.println("=== TEST 6: Seller delete ===");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        sc.nextLine();
        sellerDao.deleteById(id);
        System.out.println("Want to delete more?");
        String resp = sc.nextLine();
        while (resp.equalsIgnoreCase("yes")) {
            System.out.print("Enter id for delete test: ");
            id = sc.nextInt();
            sc.nextLine();
            sellerDao.deleteById(id);

            System.out.println("Want to delete more?");
            resp = sc.nextLine();
        }

        sc.close();
    }
}
