// import java.awt.Color;
// import java.awt.Image;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame; //including Jframe
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    JButton rules, Back;
    JTextField tfname;
    Login(){
      setLayout(null); // setting all the layout fram to null
      /*Image adding portion */
       String imagepath = "C:/Users/ASUS/Desktop/codes/QuizApp/login.jpeg"; //adding image path in our codee
       ImageIcon i1 = new ImageIcon(imagepath); // converting image path to image for our code
       JLabel image = new JLabel(i1);//used to add image or text in our fram
       image.setBounds(0,0,600,500);
       add(image);
/*Heading adding portion */
       JLabel heading = new JLabel("Tech Quiz");
       heading.setBounds(750,60,300,45); //placing of  heading according to our frame
       heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40)); //setting size of heading
       heading.setForeground(new Color(100,56,78)); //setting the color of text
       add(heading);  
       /*Name adding portion */
       JLabel name = new JLabel("Enter your name");
       name.setFont(new Font("Mongolian Baiti", Font.BOLD, 20)); //setting size of heading
       name.setForeground(Color.BLACK); //setting the color of text
       name.setBounds(810,150,300,45); //placing of  heading according to our frame
       add(name);   
     /*for enterinf user name by User */
        tfname = new JTextField(); // for including text by user
       tfname.setBounds(735, 200,300,40); //placing the text feild
       tfname.setFont(new Font("Times New Roman",Font.PLAIN,30));
       add(tfname);
     /*RUles  Button*/
    rules = new JButton("Rules");
     rules.setBounds(735,270,120,25); //for placing
     rules.setBackground(new Color(30,144,254));//for setting background color of rule button
     rules.setForeground(Color.WHITE);
     rules.addActionListener(this); //for an click event
     add(rules);

      /*BACk  Button*/
      Back = new JButton("Back");
      Back.setBounds(915,270,120,25); //for placing
      Back.setBackground(new Color(30,144,254));//for setting background color of rule button
      Back.setForeground(Color.WHITE);
      Back.addActionListener(this);  //for an click event
      add(Back);
      
          setSize(1200,500); //setting size of frame
        setLocation(200,200); //seeting location of frame
        setVisible(true); //setting the visibility of frame
    }
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource() == rules){
      String name = tfname.getText();
      setVisible(false);
      new Rules(name);

    }else if(ae.getSource() == Back){
       this.setVisible(false);
    }
    }
    public static void main(String arg[]){
        new Login();
        
    }
}