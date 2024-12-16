import java.io.*;
import javax.swing.*;
import java.awt.*;
class project extends JFrame{
JFrame frame=new JFrame();
JButton a=new JButton("Array");
JButton c=new JButton("Circular Queue");
JButton s=new JButton("Stack");
project(){
a.setBounds(50,100,100,50);
a.setBackground(Color.green);
frame.add(a);
frame.setSize(400,400);
frame.setLayout(null);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
}
public static void main(String args[]){
project p=new project();
}
}