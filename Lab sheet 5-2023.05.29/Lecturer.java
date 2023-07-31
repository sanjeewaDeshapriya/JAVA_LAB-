
package com.mycompany.labsheet5e1;
public class Lecturer extends Person
{
    private String program;
    public Lecturer(int id,String name,String program)
    {
        super(id,name);
        this.program=program;
    }
    public void setProgram(String program)
    {
        this.program=program;
    }
    public String getProgram()
    {
        return program;
    }
}
