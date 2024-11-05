import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class UI extends JPanel {
  boolean display = false;

  void setDisplay(boolean d) {
    this.display = d;
    repaint(); // Request a repaint to update the display
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (display) {
      g.drawOval(100, 100, 50, 50);
      g.fillOval(150, 150, 50, 50);
      g.drawRect(200,100,50,50);
      g.drawRect(200,160,70,50);
      g.fillRect(260, 100, 50, 50);
      setBackground(Color.WHITE);
      g.fillRect(280, 160, 70, 50);
      g.drawString("Drawing shapes", 50, 50);
    }
  }
}

public class DrawingShapes {
  public static void main(String args[]) {
    UI obj = new UI();

    JFrame frm = new JFrame();
    frm.setTitle("Shape Test");
    frm.setSize(700, 700);
    frm.setLayout(new BorderLayout());
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton btn = new JButton("Click Me");
    btn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        obj.setDisplay(true);
      }
    });
    frm.add(btn, BorderLayout.NORTH);
    frm.add(obj,BorderLayout.CENTER);
    frm.setVisible(true);
  }
}
