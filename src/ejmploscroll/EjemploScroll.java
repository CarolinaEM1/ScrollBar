/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejmploscroll;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

/**
 *
 * @author Carolina EM
 */
public class EjemploScroll {

    public EjemploScroll() {
     
    JFrame f= new JFrame("Scrollbar Example");  
    final JLabel label = new JLabel();          
    label.setHorizontalAlignment(JLabel.CENTER);    
    label.setSize(400,100);  
    final JScrollBar s=new JScrollBar();  
    s.setBounds(100,100, 50,100);  
    f.add(s); f.add(label);  
    f.setSize(400,400);  
   f.setLayout(null);  
   f.setVisible(true);  
   s.addAdjustmentListener(new AdjustmentListener() {  
    public void adjustmentValueChanged(AdjustmentEvent e) {  
       label.setText("Vertical Scrollbar value is:"+ s.getValue());  
    }  
 });  
}  
    }
    

