/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab727;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sanjeewa
 */
public class Lab727 {

    public static void main(String[] args) {
        
        RedlightThread RT = new RedlightThread(); 
        GreenlightThread GT = new GreenlightThread();
        YellowlightThread YT = new YellowlightThread();
        
        Thread t1 = new Thread(RT);
        Thread t2 = new Thread(GT);
        Thread t3 = new Thread(YT);
        t3.start();
        try {
            t1.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Lab727.class.getName()).log(Level.SEVERE, null, ex);
        }
        t1.start();
        
        try {
            t2.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Lab727.class.getName()).log(Level.SEVERE, null, ex);
        }
        t2.start();
        
        
        
        
        
    }
}
