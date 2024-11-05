import javax.swing.*;

class UI
{
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
    frm.setSize(500, 600);
    txt = new JTextField();
    txt.setBounds(50, 50, 400, 50);
    txt.setFont(new Font("Arial", Font.PLAIN, 24));
    pnl.add(txt);
    frm.setVisible(true);
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