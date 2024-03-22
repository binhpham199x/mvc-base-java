import java.awt.event.*;

public class MyKeyboardInput extends KeyAdapter {

   @Override
   public void keyPressed(KeyEvent e) {
//      super.keyPressed(e);
      int keyCode = e.getKeyCode();

      System.out.println(keyCode);

   }

}
