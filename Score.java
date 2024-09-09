import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;


public class Score extends JFrame implements ActionListener{
    Score(String name , int score){
         setLayout(null);
         setBounds(450,150,750,550);
         getContentPane().setBackground(Color.WHITE);
       

        /*for adding image */
        // String imagepath = "C:/Users/ASUS/Desktop/codes/QuizApp/score2.jpg";
        // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(imagepath));
        // Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        // ImageIcon i3 = new ImageIcon(i2);
        // JLabel image = new JLabel(i3);
        // image.setBounds(0,200,300,250);
        // add(image);
             
       String imagepath = "C:/Users/ASUS/Desktop/codes/QuizApp/score2.jpg"; //adding image path in our codee
       ImageIcon i1 = new ImageIcon(imagepath); // converting image path to image for our code 
    //    Image i2 = i1.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH);
       JLabel image = new JLabel(i1);   //used to add image or text in our fram
       image.setBounds(0,200,400,200);
       add(image);

        JLabel heading = new JLabel("Thank you " + name+" for playing Tech Quiz");
        heading.setBounds(45,30,700,40);
        heading.setFont(new Font("Spanish",Font.PLAIN,30));
       add(heading);

        JLabel lblscore = new JLabel("Your score is "+ score);
        lblscore.setBounds(450,200,300,40);
        lblscore.setFont(new Font("Spanish",Font.PLAIN,30));
       add(lblscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(470, 270, 120, 30);
        // submit.setFont(new Font("Tahoma", Font.PLAIN,22));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }
    public static void main(String arg[]){
        new Score("user",0);
    }
    
    
    
}
