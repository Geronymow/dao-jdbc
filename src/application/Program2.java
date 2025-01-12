package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: Department findById ===");
        Department dep = departmentDao.findById(5);
        System.out.println(dep);
        System.out.println();

        System.out.println("=== TEST 2: Department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }
        System.out.println();

        System.out.println("=== TEST 3: Department insert ===");
        Department newDep = new Department(6, "Music");
        departmentDao.insert(newDep);
        System.out.println("INSERTED! NEW ID: " + newDep.getId());
        System.out.println();

        System.out.println("=== TEST 4: Department update ===");
        dep = departmentDao.findById(5);
        dep.setName("Music");
        departmentDao.update(dep);
        System.out.println("Update Completed");
        System.out.println();

        System.out.println("=== TEST 5: Department delete ===");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        sc.nextLine();
        departmentDao.deleteById(id);
        System.out.println("Want to delete more?");
        String resp = sc.nextLine();
        while (resp.equalsIgnoreCase("yes")) {
            System.out.print("Enter id for delete test: ");
            id = sc.nextInt();
            sc.nextLine();
            departmentDao.deleteById(id);

            System.out.println("Want to delete more?");
            resp = sc.nextLine();
        }

        System.out.println();

        sc.close();

    }
}
