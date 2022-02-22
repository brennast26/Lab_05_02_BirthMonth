package com.company;

public class Main {

    public static void main(String[] args)
    {
	int birthmonth = 15;
    //System.out.println("The birth month entered was "+birthmonth);
    if (birthmonth < 1 || birthmonth > 12)
        {
        System.out.println("You entered an incorrect month value "+birthmonth);
        }
    else
        {
        System.out.println("Your birth month is "+birthmonth);
        }
    }
}
