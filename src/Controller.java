import java.awt.*;

public class Controller {
    public Model model;
    public View view;

    public Controller() {
        this.model = new Model(0, 0, 100, 100, Color.YELLOW);

        this.view = new View();
    }

    public void render(Graphics g){
        this.view.draw(g, this.model);

        // draw backgound
        // draw apple
    }

    public void update() {
        if (this.model.direction == 1)
            this.model.moveRight(20);

        if (this.model.direction == -1)
            this.model.moveLeft(20);

        if (this.model.x >= 500 || this.model.x < 0)
            this.model.direction *= -1;



    }
}
