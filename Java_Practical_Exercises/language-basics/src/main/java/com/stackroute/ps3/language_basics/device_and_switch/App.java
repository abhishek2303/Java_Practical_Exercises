package com.stackroute.ps3.language_basics.device_and_switch;

public class App 
{
    public static void main( String[] args )
    {
        Switchable bulb = new Bulb();
        
        //print status of the device after built
        System.out.print("Status: ");
        bulb.printStatus();
        System.out.println();
        
        //switch OFF the device if not
        System.out.println();
        System.out.println("Switching OFF the bulb: ");
        bulb.switchOFF();
        System.out.println();
        
        //check status after switching OFF
        System.out.print("Status: ");
        bulb.printStatus();
        System.out.println();
        
        //switch ON the device if not
        System.out.println();
        System.out.println("Switching ON the bulb: ");
        bulb.switchON();
        System.out.println();
        
        //check status after switching ON
        System.out.print("Status: ");
        bulb.printStatus();
        System.out.println();
    }
    
}
