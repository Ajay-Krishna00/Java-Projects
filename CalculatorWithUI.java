import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class UI implements ActionListener
{
  double num1, num2, result;
  String operator;
  JFrame frm;
  JPanel pnl;
  JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
  JButton btnAdd, btnSub, btnMul, btnDiv, btnEq, btnClr;
  JTextField txt;

  public UI() {
    frm = new JFrame("Calculator");
    pnl = new JPanel();
    frm.add(pnl);
    pnl.setLayout(null);
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm.setSize(470, 600);
    txt = new JTextField();
    txt.setEditable(false);
    txt.setBounds(50, 50, 380, 50);
    txt.setFont(new Font("Arial", Font.BOLD, 24));
    pnl.add(txt);

    btn1 = new JButton("1");
    btn2 = new JButton("2");
    btn3 = new JButton("3");
    btnClr = new JButton("C");
    btn4 = new JButton("4");
    btn5 = new JButton("5");
    btn6 = new JButton("6");
    btnAdd = new JButton("+");
    btn7 = new JButton("7");
    btn8 = new JButton("8");
    btn9 = new JButton("9");
    btnSub = new JButton("-");
    btn0 = new JButton("0");
    btnMul = new JButton("*");
    btnDiv = new JButton("/");
    btnEq = new JButton("=");

    btn1.setBounds(90, 150, 65, 65);
    btn2.setBounds(160, 150, 65, 65);
    btn3.setBounds(230, 150, 65, 65);
    btnClr.setBounds(300, 150, 65, 65);
    btn4.setBounds(90, 220, 65, 65);
    btn5.setBounds(160, 220, 65, 65);
    btn6.setBounds(230, 220, 65, 65);
    btnAdd.setBounds(300, 220, 65, 65);
    btn7.setBounds(90, 290, 65, 65);
    btn8.setBounds(160, 290, 65, 65);
    btn9.setBounds(230, 290, 65, 65);
    btnSub.setBounds(300, 290, 65, 65);
    btn0.setBounds(90, 360, 65, 65);
    btnMul.setBounds(160, 360, 65, 65);
    btnDiv.setBounds(230, 360, 65, 65);
    btnEq.setBounds(300, 360, 65, 65);

    btnEq.setBackground(Color.green);
    btnClr.setBackground(Color.red);
    btnAdd.setBackground(Color.orange);
    btnSub.setBackground(Color.orange);
    btnMul.setBackground(Color.orange);
    btnDiv.setBackground(Color.orange);

    btn1.addActionListener(this);
    btn2.addActionListener(this);
    btn3.addActionListener(this);
    btn4.addActionListener(this);
    btn5.addActionListener(this);
    btn6.addActionListener(this);
    btn7.addActionListener(this);
    btn8.addActionListener(this);
    btn9.addActionListener(this);
    btn0.addActionListener(this);
    btnAdd.addActionListener(this);
    btnSub.addActionListener(this);
    btnMul.addActionListener(this);
    btnDiv.addActionListener(this);
    btnEq.addActionListener(this);
    btnClr.addActionListener(this);

    pnl.add(btn1);
    pnl.add(btn2);
    pnl.add(btn3);
    pnl.add(btnClr);
    pnl.add(btn4);
    pnl.add(btn5);
    pnl.add(btn6);
    pnl.add(btnAdd);
    pnl.add(btn7);
    pnl.add(btn8);
    pnl.add(btn9);
    pnl.add(btnSub);
    pnl.add(btn0);
    pnl.add(btnMul);
    pnl.add(btnDiv);
    pnl.add(btnEq);
    frm.setVisible(true);
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    String s = e.getActionCommand();
    if ("=".equals(s)) {
      num2 = Double.parseDouble(txt.getText());
      calculate();
    } else if ("C".equals(s)) {
      num1 = num2 = 0;
      operator = "";
      txt.setText("");
    } else if ("+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s)) {
      operator = s;
      num1 = Double.parseDouble(txt.getText());
      txt.setText("");
    } else {
      txt.setText(txt.getText() + s);
    }
  }
  
  public void calculate() {
    result = 0;
    try
    {
      switch (operator) {
        case "+":
          result = num1 + num2;
          break;
        case "-":
          result = num1 - num2;
          break;
        case "*":
          result = num1 * num2;
          break;
        case "/":
          if (num2 == 0)
            throw new ArithmeticException("Can't divide by zero");
          result = num1 / num2;
          break;
      }
      txt.setText(String.valueOf(result));
    }
    catch(ArithmeticException e)
    {
      txt.setText("Error:" + e);
    }
    catch(NumberFormatException e)
    {
      txt.setText("Error: Invalid Input");
    }
  }
}
class CalculatorWithUI
{
  public static void main(String args[])
  {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new UI();
      }
    });
  }
}