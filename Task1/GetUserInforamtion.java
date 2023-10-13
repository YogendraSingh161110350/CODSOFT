
package game.numbergame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 91740
 * this class is designed for GUI part for Getting player Information
 */
public class GetUserInforamtion extends JFrame implements ActionListener
{
    private String first_name;
    private String last_name;
    private JTextField f_name;
    private JTextField l_name;
    private JButton next;
    // no argument constructor to  crate GUI part
    public GetUserInforamtion()
    {
        setBounds(500, 300, 800, 400);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setDefaultCloseOperation(3);
        setResizable(false);
        //==================create labels and text Fields  start========================
        JLabel jl0 = new JLabel("Welcome In Number Game".toUpperCase());
        jl0.setBounds(100, 10,600, 50);
        jl0.setForeground(Color.CYAN);
        jl0.setFont(new Font("Arial", Font.TYPE1_FONT, 40));
        add(jl0);
        
        JLabel jl1 = new JLabel("Enter First Name:");
        jl1.setBounds(100, 100,200, 50);
        jl1.setFont(new Font("Arial", Font.TYPE1_FONT, 20));
        add(jl1);
        
        f_name = new JTextField();
        f_name.setBounds(400, 110,300, 35);
        f_name.setFont(new Font("Arial", Font.ITALIC, 15));
        add(f_name);
        
        JLabel jl2 = new JLabel("Enter First Name:");
        jl2.setBounds(100, 155,200, 50);
        jl2.setFont(new Font("Arial", Font.TYPE1_FONT, 20));
        add(jl2);
        
        l_name = new JTextField();
        l_name.setBounds(400, 160,300, 35);
        l_name.setFont(new Font("Arial", Font.ITALIC, 15));
        add(l_name);
        //==================create labels and text Fields  End  ========================
        
        next = new JButton("Next");
        next.setBounds(300, 230, 150, 50);
        next.setFont(new Font("relway", Font.BOLD, 20));
        next.setBackground(Color.cyan);
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);
        setVisible(true);
    }
    // to handle the events
    @Override
    public void actionPerformed(ActionEvent e)
    {
        first_name=f_name.getText().trim().toUpperCase();
        last_name=l_name.getText().trim().toUpperCase();
        if(e.getSource()==next && !first_name.equals("") && !last_name.equals(""))
        {
            new GameWindow(first_name, last_name).setVisible(true);
            setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Inavlid Name", "enter valid name", JOptionPane.ERROR_MESSAGE);
        }
    }
}
