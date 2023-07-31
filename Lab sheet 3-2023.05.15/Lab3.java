
package com.mycompany.lab3;
public class Lab3 
{

    public static void main(String[] args) 
    {
        Employee1 e1=new Employee1();
        e1.setage(25);
        e1.setname("Nimal");
        e1.setsalary(25000);
        System.out.println("Your name is "+e1.getname());
        System.out.println("Your age is: "+e1.getage());
        System.out.println("Your current salary is: "+e1.getsalary());

    }
}
