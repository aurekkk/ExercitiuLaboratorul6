package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileSystemUserRepository implements UserRepository {
    static ArrayList<User> u;
    File file;
    public FileSystemUserRepository(File file) {
        this.file = file;
    }

    @Override
    public ArrayList<User> filterByUserType(User.UserType userType) {
        ArrayList<User>newu = new ArrayList<>();
        for (int i=0; i<u.size(); i++){
            if (u.get(i).getUserType() == userType)newu.add(u.get(i));
        }
        if(newu!=null)return newu;
        else return null;
    }

    @Override
    public User findById(Long Id) {
        for(int i=0;i<this.u.size();i++)
            if (u.get(i).getID() == Id) return u.get(i);
        return null;
    }

    @Override
    public ArrayList<User> useri() throws FileNotFoundException {
        this.u = new ArrayList<>();
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()) {
            String split[]=sc.nextLine().split(" ");
            u.add(new User(split[0], split[1], split[2], split[3], split[4]));
        }
        sc.close();
        return u;
    }

    @Override
    public User Login(Long Id, String parola) {
        for(int i=0;i<u.size();i++)
            if (u.get(i).getID() == Id && u.get(i).getParola().equalsIgnoreCase(parola)) return u.get(i);
        //System.out.println("User was not found\n");
        return null;
    }
}
