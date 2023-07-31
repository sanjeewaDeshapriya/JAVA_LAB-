
package com.mycompany.pactical2;
public class Pactical2 {

    public static void main(String[] args) 
    {
        Employee e1=new Employee("Nimal",5000,25000);
        System.out.println("Your name is "+e1.getname());
        System.out.println("Your bonus amount is: "+e1.getbonus());
        System.out.println("Your current salary is: "+e1.getbasicSalary());
        System.out.println("Your Total Bonus amount is: "+e1.calculatetotalOfBonus());
    }
}
