package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        var f= new FileSystemUserRepository(new File("G:\\Proiecte IntelliJ\\ExercitiuLaboratorul6\\src\\com\\company\\date.txt"));
        ArrayList<User> u =f.useri();
        for (int i=0; i<u.size(); i++){
            u.get(i).print();
        }

        try{
            f.findById(15L).print();
        }catch(Exception e){
            System.out.println("No User with the given ID\n");
        }
        try {
            f.Login(13L, "barcealona").print();
        }catch (Exception e){
            System.out.println("No User with the given Login informations\n");
        }
        ArrayList<User> hei=f.filterByUserType(User.UserType.ADMIN);
        for (int i=0; i<hei.size(); i++){
            hei.get(i).print();
        }
  }
}
