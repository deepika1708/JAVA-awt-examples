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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class MyFrame5 extends Frame implements ActionListener{
   Button b1,b2,b3;
   int count=0;
    Random obj;
       
      public MyFrame5(String title){
       
      
     setTitle(title);
     
       b1=new Button ("Click me");
       b2= new Button("change color");
       b3= new Button("EXIT");
       
       FlowLayout fl=new FlowLayout();
       setLayout(fl);
       add(b1);
       add(b2);
       add(b3);
       
      
       setSize(400,400);
       
       setVisible(true);
       
       b1.addActionListener(this);   //this line is important for java as it is performing registration of event source(b1) and event listener(ac)
       b2.addActionListener(this);  //registration of event source(b2 button) and event listener (ac1 object)   
       b3.addActionListener(this);  //registration of event source(b2 button) and event listener (ac1 object)   
       obj=new Random();
   
   }
    @Override
    public void actionPerformed(ActionEvent ae) {
        
       if(ae.getSource()==b1)
       {
           ++count;
          setTitle(String.valueOf(count));
       }
       else if(ae.getSource()==b2)
       {
           int red=obj.nextInt(256);
           int green=obj.nextInt(256);
           int blue=obj.nextInt(256);
           Color color=new Color(red,green,blue);
          setBackground(color);
       }
       else
          System.exit(0);  
    }
   
}
   
public class Example8 {
    public static void main(String[] args){
         
      MyFrame5 mf5=new MyFrame5("0");  
     
}
}



