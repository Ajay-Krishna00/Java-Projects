import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class UI implements ActionListener
{
  JFrame frm;
  JPanel lightpnl,buttonPanel;
  JRadioButton redBtn, yellowBtn, greenBtn;

  UI()
  {
    frm = new JFrame("Traffic Light");
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm.setSize(500, 600);
    frm.setLayout(new BorderLayout());
    lightpnl = new JPanel(){
      public void paintComponent(Graphics g)
      {
        super.paintComponent(g);
        drawLight(g);
      }
    };
    buttonPanel = new JPanel();
    ButtonGroup bg = new ButtonGroup();
    
    redBtn = new JRadioButton("Red");
    redBtn.addActionListener(this);
    bg.add(redBtn);
    buttonPanel.add(redBtn);

    yellowBtn = new JRadioButton("Yellow");
    yellowBtn.addActionListener(this);
    bg.add(yellowBtn);
    buttonPanel.add(yellowBtn);
    
    greenBtn = new JRadioButton("Green");
    greenBtn.addActionListener(this);
    bg.add(greenBtn);
    buttonPanel.add(greenBtn);
  
    frm.add(lightpnl, BorderLayout.CENTER);
    frm.add(buttonPanel, BorderLayout.SOUTH);
    frm.setVisible(true);
  }

  public void actionPerformed(ActionEvent e)
  {
    lightpnl.repaint();
  }

  void drawLight(Graphics g)
  {
    g.setColor(Color.BLACK);
    g.fillRect(125, 50, 200, 450);
    g.setColor(redBtn.isSelected() ? Color.RED : Color.GRAY);
    g.fillOval(150, 60, 130, 130);
    g.setColor(yellowBtn.isSelected() ? Color.YELLOW : Color.GRAY);
    g.fillOval(150, 210, 130, 130);
    g.setColor(greenBtn.isSelected() ? Color.GREEN : Color.GRAY);
    g.fillOval(150, 350, 130, 130);
  }
}
public class TrafficLightUI {
  public static void main(String args[])
  {
    SwingUtilities.invokeLater(new Runnable() {
      public void run()
      {
        new UI();
      }
    });
  }
}
