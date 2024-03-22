import java.awt.*;

public class Model {

   public int x;
   public int y;
   public int width;
   public int height;

   public int xDirection = 1;
   public int yDirection = 1;


   public Color color;

   public Model(int x, int y, int width, int height, Color color) {
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
      this.color = color;
   }

   public void moveRight(int stepSize) {
      this.x += stepSize;
   }

   public void moveLeft(int stepSize) {
      this.x -= stepSize;
   }

   public void moveUp(int stepSize) {
      this.x += stepSize;
   }

   public void moveDown(int stepSize) {
      this.x -= stepSize;
   }

}
