import java.awt.*;
import java.awt.event.*;

public class Controller {
   public Model model;
   public View view;

   public Controller() {
      this.model = new Model(0, 0, 100, 100, Color.YELLOW);

      this.view = new View();
   }

   public void render(Graphics g) {
      this.view.draw(g, this.model);

      // draw backgound
      // draw apple
   }

   public void update() {
      checkBorder();
//        if (this.model.xDirection == 1)
//            this.model.moveRight(20);
//
//        if (this.model.xDirection == -1)
//            this.model.moveLeft(20);
//
//        if (this.model.x >= 500 || this.model.x < 0)
//            this.model.xDirection *= -1;

      this.model.move(20);
   }

   public void checkBorder() {
      if (model.x >= 800 - 100)
         model.x = 800 - 100;
      if (model.x < 0)
         model.x = 0;
      if (model.y >= 600 - 100)
         model.y = 600 - 100;
      if (model.y < 0)
         model.y = 0;
   }

   public void processKeyEvent(KeyEvent e) {
      // logic for handling event
      int keyCode = e.getKeyCode();

      int stepSize = 100;

      switch (keyCode) {
         case KeyEvent.VK_W -> this.model.changeDirection(Direction.UP);
         case KeyEvent.VK_S -> this.model.changeDirection(Direction.DOWN);
         case KeyEvent.VK_A -> this.model.changeDirection(Direction.LEFT);
         case KeyEvent.VK_D -> this.model.changeDirection(Direction.RIGHT);
      }
   }
}
