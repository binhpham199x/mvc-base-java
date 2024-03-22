import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class Game {
    public MyPanel panel;

    public Controller controller;

    public Game() {
        //        Creating game Objects
        this.controller = new Controller();


//        Creating game Window
        this.panel = new MyPanel(800, 600, Color.BLACK);
        this.panel.setGame(this);

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        frame.add(this.panel);
        frame.pack();


        frame.setLocationRelativeTo(null);


    }

    public void start() {
        int FPS = 60;
        int FPSCount = 0;

        long timePerFrame = TimeUnit.SECONDS.toNanos(1) / FPS;

//        1 second = 1_000_000_000 nano second
        long timeStart = System.nanoTime();
        long countStart = System.nanoTime();


        while (true) {
            long timeNow = System.nanoTime();

            if (timeNow - timeStart >= timePerFrame) {

//            update logics
                this.controller.update();

                this.panel.repaint();

                timeStart = timeNow;
                FPSCount++;
            }

            if (timeNow - countStart >= TimeUnit.SECONDS.toNanos(1)) {
                System.out.println("FPS: " + FPSCount);
                FPSCount = 0;
                countStart = timeNow;
            }
        }
    }

}
