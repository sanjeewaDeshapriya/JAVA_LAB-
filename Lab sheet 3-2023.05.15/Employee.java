
package com.mycompany.pactical2;
public class Employee 
{
    private String name;
    private double bonus;
    private double basic_salary;
    public Employee(String n,double b,double bs)
    {
        name=n;
        bonus=b;
        basic_salary=bs;
    }
    
    public String getname()
    {
        return name;
    }
    public double getbonus()
    { 
        return bonus;
    }
    public double getbasicSalary()
    { 
        return basic_salary;
    }
    public void setname(String n)
    {
        name=n;
    }
    public void setbonus(int b)
    { 
        bonus=b;
    }
    public void setbasicSalary(double bs)
    { 
        basic_salary=bs;
    }
    public double calculatetotalOfBonus()
    {
        return basic_salary+bonus;
    }
   
}
