
package game.numbergame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author yogendra singh
 * this window design for Game
 */
public class GameWindow extends JFrame implements ActionListener
{
    JPanel panel;
    JTextField user_no,machine_no;
    JButton play,restart,stop;
    JLabel differnce,attempts,loss,success,loss_p,success_p,attempt_ratio_chance;
    int random_no,attempt,pass,fail;
    public GameWindow(String f_name,String l_name)
    {
        setBounds(150, 100, 1500, 800);
        getContentPane().setBackground(new Color(239, 225, 206));
        setLayout(null);
        setDefaultCloseOperation(3);
        setTitle("yogendra singh");
        // create label==========================================
        JLabel jl1 = new JLabel("WELCOME: "+f_name+" "+l_name);
        jl1.setBounds(100, 0, 300, 80);
        jl1.setForeground(Color.blue);
        jl1.setFont(new Font("relway",Font.ITALIC,30));
        add(jl1);
        
        JLabel jl2 = new JLabel("ENTER NUMBER");
        jl2.setBounds(100, 130, 300, 70);
        jl2.setForeground(Color.blue);
        jl2.setFont(new Font("relway",Font.BOLD,25));
        add(jl2);
        
        JLabel jl3 = new JLabel("Lottery Number");
        jl3.setBounds(500, 130, 300, 80);
        jl3.setForeground(Color.blue);
        jl3.setFont(new Font("relway",Font.BOLD,25));
        add(jl3);
        
        user_no = new JTextField();
        user_no.setBounds(100, 200, 200, 150);
        user_no.setForeground(Color.blue);
        user_no.setFont(new Font("relway",Font.BOLD,90));
        add(user_no);
        
        machine_no = new JTextField();
        machine_no.setBounds(500, 200, 200, 150);
        machine_no.setForeground(Color.blue);
        machine_no.setEditable(false);
        machine_no.setFont(new Font("relway",Font.BOLD,90));
        add(machine_no);
        
        //=================================play button=====================================
        ImageIcon i1 = new ImageIcon("C:\\Users\\91740\\Documents\\Custom Office Templates\\number Game\\src\\icons\\update.png");
        play = new JButton("Play", i1);
        play.setFont(new Font("relway",Font.BOLD,30));
        play.setBounds(300, 400, 200, 70);
        play.setForeground(Color.white);
        play.setBackground(Color.blue);
        play.addActionListener(this);
        add(play);
        //================================Clear button=============================================================
        
        ImageIcon i2 = new ImageIcon("C:\\Users\\91740\\Documents\\Custom Office Templates\\number Game\\src\\icons\\update.png");
        restart = new JButton("Restart", i1);
        restart.setFont(new Font("relway",Font.BOLD,30));
        restart.setBounds(100, 500, 200, 50);
        restart.setForeground(Color.white);
        restart.setBackground(Color.GREEN);
        restart.addActionListener(this);
        add(restart);
        
        //=================================stop button================================
        ImageIcon i3 = new ImageIcon("C:\\Users\\91740\\Documents\\Custom Office Templates\\number Game\\src\\icons\\update.png");
        stop = new JButton("Exit", i1);
        stop.setFont(new Font("relway",Font.BOLD,30));
        stop.setBounds(500, 500, 200, 50);
        stop.setForeground(Color.white);
        stop.addActionListener(this);
        stop.setBackground(Color.RED);
        add(stop);
        
        
        //==================create Panel========================
        panel = new JPanel();
        panel.setBounds(800,0,700,800);
        panel.setBackground(Color.cyan);
        panel.setLayout(null);
        
        JLabel jl4 = new JLabel("CUREENT GAME REPORT:");
        jl4.setBounds(100, 20, 500, 40);
        jl4.setForeground(Color.BLACK);
        jl4.setFont(new Font("relway",Font.BOLD,35));
        panel.add(jl4);
        
        JLabel jl5 = new JLabel("NAME:                            "+f_name+" "+l_name);
        jl5.setBounds(100, 120, 700, 50);
        jl5.setForeground(Color.black);
        jl5.setFont(new Font("relway",Font.ITALIC,30));
        panel.add(jl5);
        
        //===========================================diffrence==================================================
        JLabel jl6 = new JLabel("DIFFRENCE:");
        jl6.setBounds(100, 190, 400, 50);
        jl6.setForeground(Color.black);
        jl6.setFont(new Font("relway",Font.ITALIC,30));
        panel.add(jl6);
        
        differnce = new JLabel();
        differnce.setBounds(400, 190, 400, 50);
        differnce.setForeground(Color.black);
        differnce.setFont(new Font("relway",Font.ITALIC,30));
        panel.add(differnce);
        //===========================================diffrence==================================================
        
        //===========================================Attempts==================================================
        
        JLabel jl7 = new JLabel("ATTEMPTS:");
        jl7.setBounds(100, 260, 400, 50);
        jl7.setForeground(Color.black);
        jl7.setFont(new Font("relway",Font.ITALIC,30));
        panel.add(jl7);
        
        attempts = new JLabel();
        attempts.setBounds(400, 260, 400, 50);
        attempts.setForeground(Color.black);
        attempts.setFont(new Font("relway",Font.ITALIC,30));
        panel.add(attempts);
        
        //===========================================Attempts==================================================
        
        //===========================================Success==================================================
        
        JLabel jl8 = new JLabel("SUCCESS:");
        jl8.setBounds(100, 330, 400, 50);
        jl8.setForeground(Color.black);
        jl8.setFont(new Font("relway",Font.ITALIC,30));
        panel.add(jl8);
        
        success = new JLabel();
        success.setBounds(400, 330, 400, 50);
        success.setForeground(Color.black);
        success.setFont(new Font("relway",Font.ITALIC,30));
        panel.add(success);
        
        //===========================================Success==================================================
        
        //===========================================LOSS==================================================
        
        JLabel jl9 = new JLabel("LOSS:");
        jl9.setBounds(100, 400, 400, 50);
        jl9.setForeground(Color.black);
        jl9.setFont(new Font("relway",Font.ITALIC,30));
        panel.add(jl9);
        
        loss = new JLabel();
        loss.setBounds(400, 400, 400, 50);
        loss.setForeground(Color.black);
        loss.setFont(new Font("relway",Font.ITALIC,30));
        panel.add(loss);
        
        //===========================================Loss==================================================
        //===========================================Success(%)==================================================
        JLabel jl10 = new JLabel("SUCCESS(%):");
        jl10.setBounds(100, 470, 400, 50);
        jl10.setForeground(Color.black);
        jl10.setFont(new Font("relway",Font.ITALIC,30));
        panel.add(jl10);
        
        
        success_p = new JLabel();
        success_p.setBounds(400, 470, 400, 50);
        success_p.setForeground(Color.black);
        success_p.setFont(new Font("relway",Font.ITALIC,30));
        panel.add(success_p);
        
        //===========================================Success(%)==================================================
        //===========================================Loss(%)==================================================
        
        JLabel jl11 = new JLabel("LOSS(%):");
        jl11.setBounds(100, 540, 400, 50);
        jl11.setForeground(Color.black);
        jl11.setFont(new Font("relway",Font.ITALIC,30));
        panel.add(jl11);
        
        loss_p = new JLabel();
        loss_p.setBounds(400, 540, 400, 50);
        loss_p.setForeground(Color.black);
        loss_p.setFont(new Font("relway",Font.ITALIC,30));
        panel.add(loss_p);
        
        //===========================================Loss(%)==================================================
        
        //===========================================Attempt/totalChance==================================================
        
        JLabel jl12 = new JLabel("ATTEMPT / TURNS:");
        jl12.setBounds(100, 610, 500, 50);
        jl12.setForeground(Color.black);
        jl12.setFont(new Font("relway",Font.ITALIC,30));
        panel.add(jl12);
        
        attempt_ratio_chance = new JLabel();
        attempt_ratio_chance.setBounds(400, 610, 200, 50);
        attempt_ratio_chance.setForeground(Color.black);
        attempt_ratio_chance.setFont(new Font("relway",Font.ITALIC,30));
        panel.add(attempt_ratio_chance);
        
        //===========================================Loss(%)==================================================
        
        add(panel);
        
        //==========================================panel end=============================
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        
          // this implemention for restart button============================
        if(e.getSource()==restart)
        {
            int a = JOptionPane.showConfirmDialog(rootPane, "Do you want to restart game?");
            if(a==0)
            {
                restartGame();
                
            }
        }
        if(e.getSource()==stop)
        {
            System.exit(0);
        }
        
       
        else if(e.getSource()==play)
        {
            // number of attempts
             String enter_no=user_no.getText().trim();
             if(!enter_no.matches("^[0-9]{1,3}$"))
            {
                JOptionPane.showMessageDialog(rootPane, "invalid Entry","enter number[0-9]", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                attempt++;
                int user_no = Integer.parseInt(enter_no);
                getRandom();
                machine_no.setText(random_no+"");
                if(user_no==random_no)
                {
                    // increase pass by 1
                    pass++;
                }
                else
                {
                    // increase fail by 1
                    fail++;
                }
                // set all the valuse in corresponding label
                success.setText(pass+" Round");
                loss.setText(fail+" Round");
                attempts.setText(attempt+" round");
                attempt_ratio_chance.setText(attempt+"/7");
                //call set percentage======================= 

                int differnce =  Math.abs(random_no-user_no);
                this.differnce.setText(differnce+"");
                setPercentage();

                // to check the successful attempts=======================================
                 chechkSuccesfulAttemp(pass,attempt);
            } 
        }
    }
   // this method create for genrate Random number from 1 To 100
    private void getRandom()
    {
        Random r1 = new Random();
        random_no = r1.nextInt(5);
    }
    // to calculate the percentage
    private void setPercentage()
    {
        //calucalate success percentage
        int success_per = pass*100/(attempt);
        int fail_per = fail*100/(attempt);
        loss_p.setText(fail_per+"%");
        success_p.setText(success_per+"%");
    }
    // check weather the successfull event is greater than 3
    private void chechkSuccesfulAttemp(int s_attempts,int attempts)
    {
        if(s_attempts>=3)
        {
            JOptionPane.showMessageDialog(this, "you have won three times");
            play.setEnabled(false);   
            int restart = JOptionPane.showConfirmDialog(this,"do you want to restart game." );
            if(restart==0)
            {
                restartGame();
            }
        }
        if(attempt>=7)
        {
            JOptionPane.showMessageDialog(this, "your attempt is end");
            play.setEnabled(false); 
            int restart = JOptionPane.showConfirmDialog(this,"do you want to restart game." );
            if(restart==0)
            {
                restartGame();
            }
        }
    }
    
    // this method is created for  restart the game
    private void restartGame()
    {
                play.setEnabled(true);
                user_no.setText("");
                machine_no.setText("");
                differnce.setText("");
                attempts.setText("");
                success.setText("");
                success_p.setText("");
                attempt_ratio_chance.setText("");
                loss.setText("");
                loss_p.setText("");
                attempt=0;
                pass=0;
                fail=0;
    }
}
