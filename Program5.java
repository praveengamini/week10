import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class swing extends JFrame{
    JLabel user,password;
    JTextField text1,text2;
    JButton button;
    swing(){
        user=new JLabel("userID:-");
        text1=new JTextField("enter Id here...",25);
        button=new JButton("submit");
        text2=new JTextField("enter password here...",25);
        password=new JLabel("password:-");
        this.add(user);
        this.add(text1);
        this.add(password);
        this.add(text2);
        this.add(button);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setVisible(true);    


    }
    
    public static void main(String[] args) {
        swing obj =new swing();
    }  
}
