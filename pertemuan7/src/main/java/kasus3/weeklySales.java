/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package kasus3;

/**
 *
 * @author Muhammad Syaifullah
 */
public class weeklySales {
    public static void main(String args[]) {
        Salesperson [] salesStaff = new Salesperson [6];
        salesStaff[0] = new Salesperson ("Jane", "Jones", 3000);
        salesStaff[1] = new Salesperson ("Daffy", "Duck", 4935);
        salesStaff[2] = new Salesperson ("James", "Jones", 3000);
        salesStaff[3] = new Salesperson ("Dick", "Walter", 2800);
        salesStaff[4] = new Salesperson ("Don", "Trump", 1570);
        salesStaff[5] = new Salesperson ("Jane", "Black", 3000);
        Sorting.selectionSort(salesStaff);
        System.out.println("\nRanking of Sales for the week\n");
        for(Salesperson s : salesStaff)
        System.out.println(s); 
    }
}
