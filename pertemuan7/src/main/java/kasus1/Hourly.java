/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package kasus1;

/**
 *
 * @author Muhammad Syaifullah
 */
// hourly paid employee

public class Hourly extends Employee {
	private int hoursWorked;
	
	public Hourly(String eName, String eAddress, String ePhone,
			String socSecNumber, double rate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		
		hoursWorked = 0;
	}
	
	
	public void addHours(int moreHours) {
		hoursWorked += moreHours;
	}
	
	
	public double pay() {
		double payment = payRate * hoursWorked;
		hoursWorked = 0;
		
		return payment;
	}
	
	
	public String toString() {
		String result = super.toString();
		result += "\nCurrent hours: " + hoursWorked;
		
		return result;
	}
}

