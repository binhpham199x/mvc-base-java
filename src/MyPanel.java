import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyPanel extends JPanel {
   public Game game;


   public MyPanel(int width, int height, Color bgColor) {
      this.setPreferredSize(new Dimension(width, height));

      this.setFocusable(true);

      this.setBackground(bgColor);
   }

   public void setGame(Game game) {
      this.game = game;
   }

   @Override
   protected void paintComponent(Graphics g) {
      super.paintComponent(g);

      game.controller.render(g);
   }

   public void processKeyInputEvent(KeyEvent e) {
      this.game.processKeyEvent(e);
   }

}

