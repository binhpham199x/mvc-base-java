import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public Game game;


    public MyPanel(int width, int height, Color bgColor) {
        this.setPreferredSize(new Dimension(width, height));

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

}

