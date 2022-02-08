
package zdarzenia.kolor.pkg3;
/**
 * @author pawelstradomski
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ZdarzeniaKolor3 extends JFrame
{

    public ZdarzeniaKolor3()
    {
        super("Zdarzenia 3 sposob");
        this.setBounds(600, 300, 400, 400);
        initComponent();
        this.setDefaultCloseOperation(3);
        
    }
    public void initComponent()
    {
        budujButton("czerwony", Color.RED);
        budujButton("niebieski", Color.BLUE);
        
    }
    public void budujButton(String nazwa, final Color k)
    {
        JButton przycisk = new JButton(nazwa);
        panel.add(przycisk);
//        panel.setLayout(new GridLayout(2, 1));//2-wiersze, 1-kolumna
        this.getContentPane().add(panel);
        przycisk.addActionListener(new ActionListener() 
                
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
               panel.setBackground(k);
            }
        });
    }
    JPanel panel = new JPanel();
    
    public static void main(String[] args) {
        
        new ZdarzeniaKolor3().setVisible(true);
    }
    
}
