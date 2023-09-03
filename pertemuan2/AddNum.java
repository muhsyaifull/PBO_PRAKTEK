/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;
import java.io.IOException;

/**
 *
 * @author Muhammad Syaifullah
 */
public class AddNum {
    public int addNum(int numA, int numB) {
        return numA + numB; 
    }
    
    public static void main(String args[]) throws IOException{
        AddNum obj = new AddNum();
        int sum = obj.addNum(10, 20);
        
        System.out.println("Sum of 10 and 20 is =" + sum);
    }
}
