package game;

import city.cs.engine.UserView;
import org.jbox2d.common.Vec2;

import javax.swing.*;

public class GameView extends UserView {
    public GameView(GameWorld world, int width, int height) {
        super(world, width, height);
        UserView view = new UserView(world, 600, 600);
        view.setZoom(10);
        view.setCentre(new Vec2(7, -9));

        //optional: draw a 1-metre grid over the view
        //view.setGridResolution(1);


        //4. create a Java window (frame) and add the game
        //   view to it
        final JFrame frame = new JFrame("City Game");
        frame.add(view);

        // enable the frame to quit the application
        // when the x button is pressed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        // don't let the frame be resized
        frame.setResizable(false);
        // size the frame to fit the world view
        frame.pack();
        // finally, make the frame visible
        frame.setVisible(true);
        //optional: uncomment this to make a debugging view
        //  JFrame debugView = new DebugViewer(world, 500, 500);

    }
}
