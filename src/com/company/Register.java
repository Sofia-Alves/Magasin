package com.company;

class Register {

    private String Id;
    private String password;

    public Register(String firstName, String password) {
        this.Id = firstName;
        this.password = password;
    }

    public String getId() {
        return Id;
    }

    public void setId(String firstName) {
        this.Id = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

//cree les methodes ici
// comparer les Id et password

   /* private static void printRegisterData(Register register) {
        System.out.println(register.getId());
        System.out.println(register.getPassword());

    }*/