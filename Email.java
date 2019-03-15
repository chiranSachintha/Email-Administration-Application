
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NipunPC
 */
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    
    //constructor to receive first name and the last name
    
    public Email(String firstName, String lastName){
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.department=setDepart();
        this.password = randomPassword(8);
    }
    
    //set department
    
    private String setDepart(){
        System.out.print("Enter the department\n 1 for sales\n 2 for Development\n 3 for Accounting\n 0 foe None\n ");
        Scanner scanner = new Scanner(System.in);
        int deptChoice = scanner.nextInt();
        
        if(deptChoice == 1){
            return "Sales";
        }else if(deptChoice == 2){
            return "development";
        }else if(deptChoice == 3){
            return "Accounting";
        }else{
            return "None";
        }
    }
    public String getDepart(){
        
        return department;
    }
    private String randomPassword(int length){
        String passwordSet="abcdefghijklmnopqrstuvwxyz0123456789@#!";
        char[] password= new char[length];
        for(int i =0; i<length; i++){
            int rand = (int)(Math.random()*(passwordSet.length()-1));
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }
    public String getPassword(){
        return this.password;
    }
        
        
}
