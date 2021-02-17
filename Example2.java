/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sca.gui.awt.examples;

import java.awt.Frame;
import java.util.Date;

public class Example2 {
     public static void main(String[] args){
    Frame fr=new Frame();
    Date d=new Date();
    fr.setTitle(d.toString()); 
    
    fr.setSize(400,400);
    fr.setVisible(true);
    
     } 
}
