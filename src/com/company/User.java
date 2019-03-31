package com.company;

import java.util.Optional;

public class User {
    public User() {

    }

    public enum UserType {
        ADMIN("ADMIN"),
        SIMPLE_USER("SIMPLE_USER"),
        SUPER_ADMIN("SUPER_ADMIN");
        private String value;
        UserType(String value){
            this.value=value;
        }

        public String getValue() {
            return value;
        }
    }
    String nume;
    String prenume;
    Long ID;
    String parola;

    UserType userType;

    public User(String ID,String nume, String prenume, String parola, String userType) {
        this.ID = Long.parseLong(ID);
        this.nume = nume;
        this.prenume = prenume;
        this.parola = parola;
        for (UserType ob : UserType.values()){
            if(ob.value.equalsIgnoreCase(userType)) {
                this.userType = ob;
            }
        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public void print(){
        if(this == null) System.out.println("User not found\n");
        else System.out.println(getID()+ " " + getNume() + " " + getPrenume() + " " + getParola() + " " + getUserType() + "\n");
    }

}
