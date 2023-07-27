/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab727;

/**
 *
 * @author sanjeewa
 */
public class GreenlightThread implements Runnable{
    public void run(){
         for (int i = 1; i <= 10; i++){
        System.out.println("Green");
        try {
                    Thread.sleep(10000);
                } 
        catch (InterruptedException e) {
                }
    
    }
    }
    
}
