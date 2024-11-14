import javax.swing.*;  
public class SwingDemo {  
public static void main(String[] args) {  
JFrame f=new JFrame();//creating instance of JFrame  
          
JButton b=new JButton("click");//creating instance of JButton  
JButton c=new JButton("click Me");//creating instance of JButton  
JButton a=new JButton("click");//creating instance of JButton  
JButton d=new JButton("click");//creating instance of JButton  
JButton e=new JButton("click");//creating instance of JButton  
b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
a.setBounds(130,200,100, 40);//x axis, y axis, width, height  
c.setBounds(130,300,100, 40);//x axis, y axis, width, height  
d.setBounds(130,400,100, 40);//x axis, y axis, width, height  
e.setBounds(130,500,100, 40);//x axis, y axis, width, height  
          
f.add(a);//adding button in JFrame  
f.add(b);//adding button in JFrame  
f.add(c);//adding button in JFrame  
f.add(d);//adding button in JFrame  
f.add(e);//adding button in JFrame  

f.setSize(1000,700);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  
}  