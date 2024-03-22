import java.awt.*;

public class View {

    public void draw(Graphics g, Model model){
        Graphics2D g2 = (Graphics2D)g;

        Rectangle rectangle = new Rectangle(model.x, model.y, model.width, model.height);
        g2.setColor(model.color);
        g2.fillRect(model.x, model.y, model.width, model.height);
        g2.draw(rectangle);

    }
}
