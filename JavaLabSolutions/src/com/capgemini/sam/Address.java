package com.capgemini.sam;

public class Address
{
    
    private int doornumber;
    
    private String streetName;
    
    private String city;
    
    private long pincode;
    
    public int getDoornumber()
    {
        return doornumber;
    }

    public void setDoornumber(int doornumber)
    {
        this.doornumber = doornumber;
    }

    public String getStreetName()
    {
        return streetName;
    }

    public void setStreetName(String streetName)
    {
        this.streetName = streetName;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public long getPincode()
    {
        return pincode;
    }

    public void setPincode(long pincode)
    {
        this.pincode = pincode;
    }

}