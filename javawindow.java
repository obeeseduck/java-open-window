import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Dimension;
public class javawindow extends JFrame implements ActionListener {
    
    private int count = 0;

    private JLabel jl;
    private JButton jb;
    private JPanel jp1, jp2;

    public javawindow() {
       
        //FRAME

        setTitle("Make me fullscreen to play the clicker game!");
        pack();
        getContentPane().setBackground(Color.PINK);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        //PANEL

        jp2 = new JPanel();

        //TEXT

        jl = new JLabel("Number of clicks: ");
        add(jp1);
        jp2.add(jl);
        
        //BUTTON
        
        jb = new JButton("Press me");
        jb.addActionListener(this);
        jp2.add(jb);
        

    }
    public static void main(String[] args){
        javawindow t = new javawindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        jl.setText("Number of clicks: " + count);
    }
    public Dimension getPreferredSize() {
        return new Dimension(1000, 1000);
    }

}
