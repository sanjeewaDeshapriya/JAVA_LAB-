
package com.mycompany.labsheet4e1;
public class Labsheet4e1 
{

    public static void main(String[] args)
    {
        Employee e1=new Employee();
        e1.setEmpId(28931);
        e1.setEmpName("Mr.Bogdan");
        e1.setEmpDesignation("Clerk");
        e1.getEmpId();
        e1.getEmpName();
        e1.getEmpDesignation();
        System.out.println("Employee Id: "+e1.getEmpId());
        System.out.println("Employee Name: "+e1.getEmpName());
        System.out.println("Employee Designation: "+e1.getEmpDesignation());
        Employee e2=new Employee();
        e2.setEmpId(28932);
        e2.setEmpName("Ms.Bird");
        e2.setEmpDesignation("Clerk");
        e2.getEmpId();
        e2.getEmpName();
        e2.getEmpDesignation();
        System.out.println("Employee Id: "+e2.getEmpId());
        System.out.println("Employee Name: "+e2.getEmpName());
        System.out.println("Employee Designation: "+e2.getEmpDesignation());
        
        
    }
}
