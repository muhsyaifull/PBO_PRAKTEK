/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package kasus1;

/**
 *
 * @author Muhammad Syaifullah
 */
public class Employee extends StaffMember{
    protected String socialSecurityNumber;
    protected double payRate;
    
    public Employee (String eName, String eAddress, String ePhone,
                    String socSecNumber, double rate){
        super (eName, eAddress, ePhone);
        
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }
    public String toString(){
        String result = super.toString();
        result += "\nSocial Security Number: " + socialSecurityNumber;
        return result;
    }
    
    public double pay(){
        return payRate;
    }
}
