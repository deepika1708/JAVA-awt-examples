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

class MyFrame4 extends Frame implements ActionListener{
   Button b1;
   Button b2;
   Button b3;
   Button b4;
   public MyFrame4(String title){
   
       super (title);
     
       b1=new Button ("RED");
       b2= new Button("GREEN");
       b3= new Button("BLUE");
       b4= new Button("EXIT");
       
       FlowLayout fl=new FlowLayout();
       setLayout(fl);
       add(b1);
       add(b2);
       add(b3);
       add(b4);
       
       setSize(400,400);
       
       setVisible(true);
       
       
       b1.addActionListener(this);   //this line is important for java as it is performing registration of event source(b1) and event listener(ac)
       b2.addActionListener(this);  //registration of event source(b2 button) and event listener (ac1 object)   
       b3.addActionListener(this);  //registration of event source(b2 button) and event listener (ac1 object)   
       b4.addActionListener(this);  //registration of event source(b2 button) and event listener (ac1 object)   
  
   }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==b1)
         setBackground(Color.RED);
       else if(ae.getSource()==b2)
           setBackground(Color.GREEN);
        else if(ae.getSource()==b3)
           setBackground(Color.BLUE);
        else
          System.exit(0);  
    }
    }
   

public class Example7 {
    public static void main(String[] args){
      MyFrame4 mf4=new MyFrame4("Four Button Frame");    }
}



