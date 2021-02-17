/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sca.gui.awt.examples;

import java.awt.Color;
import java.awt.Frame;

class MyFrame extends Frame{
    
   public MyFrame(String title)
   {
   super(title);
   setSize(400,400);
   setVisible(true);
   setBackground(Color.DARK_GRAY);
   }
}


public class Example4 {
    public static void main(String[] args){
    MyFrame fr=new MyFrame("deepika's frame");
    
    
    }
    
    
}
