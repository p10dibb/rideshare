package com.example.rideshare;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private  String password;


    User(){
        this.firstName="";
        this.lastName="";
        this.email="";
        this.phone="";
        this.password="";
    }


    public void SetFirstName(String name ){
        this.firstName=name;
    }
    public void SetLastName(String name ){
        this.lastName=name;
    }

    // checks for '@' and '.' Ex: Paul@gmail.com is good
    public boolean SetEmail(String name){
        char dotCheck[]= name.toCharArray();

        if(name.contains("@")&&(dotCheck[dotCheck.length-3]=='.'||dotCheck[dotCheck.length-4]=='.')){
            this.email=name;
            return true;
        }
        return false;
    }

    //checks for all char are digits and length =10
    public boolean SetPhone(String phone){
        char numCheck[]=phone.toCharArray();
        if(numCheck.length==10) {
            for (int i = 0; i < numCheck.length; i++) {
                if (numCheck[i] < '0' || numCheck[i] > '9') {
                    return false;
                }
            }

            this.phone=phone;
            return true;
        }
        else {
            return false;
        }
    }

    //CHECKS FOR UPPERCASE character and  length =   6<=L<=20
    public boolean SetPassword(String pass){
        char passTest[]=pass.toCharArray();
        boolean upper =false;

        if(passTest.length>=6 && passTest.length<=20){
            for(int i=0; i<passTest.length;i++){
                if ((passTest[i]>='A') &&passTest[i]<='Z'){
                    upper=true;
                }
            }

            if(upper){
                this.password=pass;
                return true;

            }

        }
        return false;
    }


    public String GetFirstName(){
        return firstName;
    }

    public String GetLastName(){
        return lastName;
    }

    public String GetEmail(){
        return email;
    }

    public String GetPhone(){
        return  this.phone;
    }

    public String GetPassword(){
        return this.password;
    }
}

