/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Sushil Kumar
 */
import java.util.Scanner;
class employee1
{
    private String name;
    private int yr;
    private String address;
    public employee1()
    {
        name="ABC";
        yr=2021;
        address="XYZ";
    }
    public employee1(String name, int yr, String address)
    {
        this.name=name;
        this.yr=yr;
        this .address=address;
    }
    public void inputName()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER EMPLOYEE NAME");
        name=sc.next();
    }
    public void inputYear()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YEAR OF JOINING");
        yr=sc.nextInt();
    }
    public void inputAddress()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ADRESS");
        address=sc.nextLine();
    }
    public void display()
    {
        System.out.println(name+"\t\t"+yr+"\t\t\t"+address);
    }
}
public class Employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        employee1 e1=new employee1();
        employee1 e2=new employee1();
        e2.inputName();
        e2.inputYear();
        e2.inputAddress();
        employee1 e3=new employee1("SNEHA RANI",2018,"UTTAR PRADESH");
        System.out.println("NAME\t\tYEAR OF JOINING\t\tADDRESS");
        e1.display();
        e2.display();
        e3.display();
    }
    
}
