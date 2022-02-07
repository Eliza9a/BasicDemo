package game;

/**
 * Your main game entry point
 */
public class Game {


    /** Initialise a new Game. */
    public Game() {

        //1. make an empty game world
        // World world = new World();

        GameWorld world = new GameWorld();

        //3. make a view to look into the game world
        // UserView view = new UserView(world, 500, 500);
        GameView view = new GameView(world, 500, 500);

        // start our game world simulation!
        world.start();
    }

    /** Run the game. */
    public static void main(String[] args) {

        new Game();
    }
}
