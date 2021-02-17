/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sca.gui.awt.examples;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

class MyFrame2 extends Frame{
   Button b1;
   Button b2;
   
   public MyFrame2(String title){
   
       super (title);
       b1=new Button ("Close app");
       b2= new Button("Change color");
       
       FlowLayout fl=new FlowLayout();
       setLayout(fl);
       add(b1);
       add(b2);
       
       setSize(400,400);
       setBackground(Color.CYAN);
       setVisible(true);
       
       b1.setBackground(Color.PINK);
       
       
   }
   
}
public class Example5 {
    public static void main(String[] args){
      MyFrame2 mf2=new MyFrame2("A Buttoned Frame");    }
}
