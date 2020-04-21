package com.capgemini.sam;

public class Rectangle  implements Shape
{
    int m_length;
    int m_breadth;
    
    public Rectangle(int length, int breadth)
    {
        this.m_length = length;
        this.m_breadth = breadth;
        
    }
    public int getArea()
    {
        if(m_breadth != 0 && m_length != 0)
        {
            return m_breadth*m_length;
        }
        
        return 0;
    }

    public String getName()
    {
       
        return  "I am rectangle";
    }


    public String draw()
    {
        return  "I am creating a rectangle";
    }

}
