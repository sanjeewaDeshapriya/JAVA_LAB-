
package com.mycompany.practical1;
public class Item 
{
    protected int location;
    protected String Description;
    public Item(int lo,String de)
    {
        location=lo;
        Description=de;
    }
    public void setlocation(int lo)
    {
        location=lo;
    }
    public int getlocation()
    {
        return location;
    }
    public void setDescription(String de)
    {
        Description=de;
    }
    public String getDescription()
    {
        return Description;
    }
    public void display()
    {
        System.out.println("The location is: "+location);
        System.out.println("The Description is: "+Description);
    }
}
