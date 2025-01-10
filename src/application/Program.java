package application;

import model.entities.Department;
import model.entities.Seller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        Seller sl = new Seller(14,"Guilherme","guilherme@gmail.com",
                sdf.parse("18/12/2004"), 2000.0, new Department(14,"Boxes"));

        System.out.println(sl.toString());



    }
}
