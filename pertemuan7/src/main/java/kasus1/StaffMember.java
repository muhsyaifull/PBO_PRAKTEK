/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package kasus1;

/**
 *
 * @author Muhammad Syaifullah
 */
abstract public class StaffMember {
    protected String name;
    protected String address;
    protected String phone;
    
    
    public StaffMember (String eName, String eAddress, String ePhone){
        name = eName;
        address = eAddress;
        phone = ePhone;
    }
    public String toString(){
        String result = "Name: " + name + "\n";
        
        result += "Address: " + address + "\n";
        result += "Phone: " + phone;
        
        return result;
    }
    public abstract double pay();
}
