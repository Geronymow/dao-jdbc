package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        //System.out.println("=== TEST 1: Department findById ===");
        Department dep = departmentDao.findById(1);
        //System.out.println();

        //System.out.println("=== TEST 2: Department findByDepartment ===");
        //System.out.println();

        System.out.println("=== TEST 3: Department findAll ===");


        System.out.println();

        //System.out.println("=== TEST 4: Department insert ===");
        //Department newDep = new Department(5, "Music");
        //departmentDao.insert(newDep);
        //System.out.println("INSERTED! NEW ID: " + newDep.getId());
        //System.out.println();

        //System.out.println("=== TEST 5: Department update ===");
        //dep = departmentDao.findById(5);
        //dep.setName("Song");
        //departmentDao.update(dep);
        //System.out.println("Update Completed");
        //System.out.println();

        //System.out.println("=== TEST 6: Department delete ===");
        //System.out.println();



    }
}
