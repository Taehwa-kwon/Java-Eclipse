package ex03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingCalculator2 extends JFrame implements ActionListener{
   
   JTextField txt1, txt2,txt3;
   JButton btnAdd, btnMul, btnMin, btnDiv;
   JLabel lbl;
   
   public SwingCalculator2() {
      this.setTitle("계산기");
      this.setLayout(new FlowLayout());
      
      txt1 = new JTextField("0", 20);
      txt2 = new JTextField("0", 20);
      txt3 = new JTextField("0", 20);
      btnAdd = new JButton("  +  ");
      btnMin = new JButton("  -  ");
      btnMul = new JButton("  x  ");
      btnDiv = new JButton("  ÷  ");
      lbl = new JLabel("     결과     ");
      
      this.add(txt1);
      this.add(txt2);
      this.add(btnAdd);
      this.add(btnMin);
      this.add(btnMul);
      this.add(btnDiv);
      this.add(lbl);
      this.add(txt3);

      btnAdd.addActionListener(this);
      btnMin.addActionListener(this);
      btnMul.addActionListener(this);
      btnDiv.addActionListener(this);
      
      
      this.setSize(300,400);
      this.setVisible(true);
   }
   
   public static void main(String[] args) {
      new SwingCalculator2();
   }

   @Override
   public void actionPerformed(ActionEvent e) {
         if(e.getSource() == btnAdd) {
            Double a = Double.valueOf(txt1.getText()) + Double.valueOf(txt2.getText()); // txt1 은 현재 JTextField 타입이니깐 참조형타입 
            String b = String.valueOf(a);
            txt3.setText(b);
            
        	//======================================형변환================================================//
    		//	문자 -> 숫자
    		//	1.Integer.valueOf(변수명)		String->Int  
    		//	2.Double.valueOf(변수명)		String->Double
    		//
    		//	숫자 -> 문자
    		//	1.Integer.toString(변수명) 	Int -> String 
    		//	2.Double.toString (변수명) 	Double->String 
    		//==========================================================================================//
            
            
         } if(e.getSource() == btnMin) {
            Double a = Double.valueOf(txt1.getText()) - Double.valueOf(txt2.getText());
            String b = String.valueOf(a);
            txt3.setText(b);
         } if(e.getSource() == btnMul) {
            Double a = Double.valueOf(txt1.getText()) * Double.valueOf(txt2.getText());
            String b = String.valueOf(a);
            txt3.setText(b);
         } if(e.getSource() == btnDiv) {
            Double a = Double.valueOf(txt1.getText()) / Double.valueOf(txt2.getText());
            String b = String.valueOf(a);
            txt3.setText(b);
         }
   }

}