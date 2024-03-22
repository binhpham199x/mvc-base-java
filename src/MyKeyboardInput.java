import java.awt.event.*;

public class MyKeyboardInput extends KeyAdapter {
   private MyPanel panel;

   public MyKeyboardInput(MyPanel panel) {
      this.panel = panel;
   }

   @Override
   public void keyPressed(KeyEvent e) {
//      super.keyPressed(e);
//      int keyCode = e.getKeyCode();
//      System.out.println(keyCode);

      // give panel the key event forwards
      this.panel.processKeyInputEvent(e);
   }

}
