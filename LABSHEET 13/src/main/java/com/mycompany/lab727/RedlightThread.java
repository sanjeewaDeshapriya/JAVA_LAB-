/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab727;

/**
 *
 * @author sanjeewa
 */
public class RedlightThread implements Runnable{
    public void run(){
         for (int i = 1; i <= 10; i++){
        System.out.println("Red");
        try {
                    Thread.sleep(5000);
                } 
        catch (InterruptedException e) {
                }
    
    }
    }
    
}
