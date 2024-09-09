import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Rules extends JFrame implements ActionListener {
    String name;
    JButton Back,start;
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

         JLabel heading = new JLabel("Welcome "+name+" to Tech Quiz");
       heading.setBounds(50,20,700,30); //placing of  heading according to our frame
       heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 30)); //setting size of heading
       heading.setForeground(new Color(100,56,78)); //setting the color of text
       add(heading);  

       JLabel rules = new JLabel();
       rules.setBounds(20,29,700,350); //placing of  heading according to our frame
       rules.setFont(new Font("Tahoma", Font.PLAIN, 20)); //setting size of heading
       rules.setText( "<html>"+ 
       "1. All question are compulsory to attend." + "<br><br>" +
       "2. You can attempt one question at a time." + "<br><br>" +
       "3. There is no negative marking." + "<br><br>" +
       "4. If you open any other website or window we will be notified and you will be disqualified from the exam." + "<br><br>" +
       "5. There is a time limit in each question."+"<br><br"+
   "<html>");
       add(rules);  
       /*BACk  Button*/
      Back = new JButton("Back");
      Back.setBounds(250,500,100,30); //for placing
      Back.setBackground(new Color(30,144,254));//for setting background color of rule button
      Back.setForeground(Color.WHITE);
      Back.addActionListener(this);  //for an click event
      add(Back);

      /*START Button*/
      start = new JButton("Start");
      start.setBounds(400,500,100,30); //for placing
      start.setBackground(new Color(30,144,254));//for setting background color of rule button
      start.setForeground(Color.WHITE);
      start.addActionListener(this);  //for an click event
      add(start);
       
      setSize(800, 650);
       setLocation(350,100);
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
               new Quiz(name);
        }
        else {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String arg[]){
        new Rules("User");
    }
}
