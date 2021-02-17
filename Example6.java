/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sca.gui.awt.examples;

/*import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame3 extends Frame{
   Button b1;
   Button b2;
   
   public MyFrame3(String title){
   
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
       
       MyActionListener ac=new MyActionListener();
       b1.addActionListener(ac);   //this line is important for java as it is performing registration of event source(b1) and event listener(ac)
       
       MyActionListener1 ac1= new MyActionListener1();
       b2.addActionListener(ac1);  //registration of event source(b2 button) and event listener (ac1 object)   
   }
   
}

class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent ae) {
         System.exit(0);
    }
}

class MyActionListener1 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("change color clicked");
    }
}


public class Example6 {
    public static void main(String[] args){
      MyFrame3 mf3=new MyFrame3("A Buttoned Frame");    }
}
*/

/*When you have to make a number of buttons in a program, 
then you have to make a number of classes which implements ActionListener to add actoins to the button.
to overcome this problem we can not make a no of classes ,we extends class frame and implements 
ACTIONLISTENER WITHIN A SINGLE CHILD CLASS (MyFrame3) */


import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame3 extends Frame implements ActionListener{
   Button b1;
   Button b2;
   
   public MyFrame3(String title){
   
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
       
       
       b1.addActionListener(this);   //this line is important for java as it is performing registration of event source(b1) and event listener(ac)
       
       
       b2.addActionListener(this);  //registration of event source(b2 button) and event listener (ac1 object)   
   }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==b1)
         System.exit(0);
        else
            System.out.println("change color clicked");
    }
    }
   

public class Example6 {
    public static void main(String[] args){
      MyFrame3 mf3=new MyFrame3("A Buttoned Frame");    }
}



