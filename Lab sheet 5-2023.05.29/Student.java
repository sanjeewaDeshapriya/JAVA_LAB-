package com.mycompany.labsheet5e1;
public class Student extends Person
{
    private String course;
    public Student(int id,String name,String course)
    {
        super(id,name);
        this.course=course;
    }
    public void setCourse(String course)
    {
        this.course= course;
    }
    public String getcourse()
    {
        return course;
    }
}
