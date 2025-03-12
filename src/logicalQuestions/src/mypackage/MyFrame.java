package mypackage;
import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MyFrame());

        JFrame jf = new JFrame("Register Form");
        jf.setSize(600, 450);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        
        //Label Name
        JLabel jl1 = new JLabel("Enter Name: ");
        jl1.setBounds(100, 50, 100, 30);
        jf.add(jl1); 
        
        //Label Email
        JLabel jl = new JLabel("Enter Email: ");
        jl.setBounds(100, 100, 100, 30);
        jf.add(jl); 

        //Label Password
        JLabel jl2 = new JLabel("Enter Pass: ");
        jl2.setBounds(100, 150, 100, 30);
        jf.add(jl2); 
        
        // Name Text Fields
        JTextField jt = new JTextField();
        jt.setBounds(200, 60, 200, 30); 
        // Fixed Y-coordinate to align with label
        jf.add(jt);
        
     // Email Text Fields
        JTextField jt1 = new JTextField();
        jt1.setBounds(200, 100, 200, 30); 
        // Fixed Y-coordinate to align with label
        jf.add(jt1);
        
     // Password Text Fields
        JTextField jt2 = new JTextField();
        jt2.setBounds(200, 140, 200, 30); 
        // Fixed Y-coordinate to align with label
        jf.add(jt2);
        
     // Label Gender
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(100, 200, 100, 30);
        jf.add(genderLabel);
        
     // Label City
        JLabel cityLabel = new JLabel("City:");
        cityLabel.setBounds(100, 250, 100, 30);
        jf.add(cityLabel);
        
     // City Drop-down (ComboBox)
        String[] cities = {"Select City", "San Francisco", "Los Angeles", "New York", "Chicago", "Houston"};
        JComboBox<String> cityDropdown = new JComboBox<>(cities);
        cityDropdown.setBounds(200, 250, 200, 30);
        jf.add(cityDropdown);
        
     
      //Gender Radio Box
        JRadioButton mButton = new JRadioButton("M");
        mButton.setBounds(200, 200, 80, 30);
        jf.add(mButton);
        
      //Gender Radio Box
        JRadioButton fButton = new JRadioButton("F");
        fButton.setBounds(280, 200, 80, 30);
        jf.add(fButton);
        
        //Register Me button
        JButton jb1=new JButton("Register Me");
        jb1.setBounds(200, 290, 200, 40);
        jf.add(jb1);
        
        //Cancel Button
        JButton jb2=new JButton("Cancel");
        jb2.setBounds(200, 340, 200, 40);
        jf.add(jb2);
           
        jf.setVisible(true);
        //Control Shift O to get a pre-defined methods.
    }
}
//Create a box with Register Here header. Add name: Textfield,email: TextField, password: Text Filed,gender: JRadioButtons(Male/Female),city: JcomboBox drop-down. RegisterButton, Cancel..
//This ensures that Swing components are created on the Event Dispatch Thread (EDT), which is the recommended practice.