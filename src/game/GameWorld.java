package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class GameWorld extends World {
    public GameWorld() {
        super();

        // make the ground
        Shape shape = new BoxShape(11, 0.5f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0f, -11.5f));

        // make the character
        Student student = new Student(this);
        student.setPosition(new Vec2(7, -9));

        //**move** here the rest of the code from Gave.java that
        //populates the World - add platforms, Student, etc.
        //(don't add anything related to the view)


        // make a platform
        Shape platformShape = new BoxShape(3.5f, 0.5f);
        StaticBody platform1 = new StaticBody( this, platformShape );
        platform1.setPosition(new Vec2(-8, 5.5f));
        platform1.setAngleDegrees(-45);
        //second platform
        Shape platformShape2 = new BoxShape(3.5f, 0.5f);
        StaticBody platform2 = new StaticBody(this, platformShape2);
        platform2.setPosition(new Vec2(8, 5.5f));

        //wall1
        Shape wallShape = new BoxShape(0.5f, 5.5f);
        StaticBody wall1 = new StaticBody(this, wallShape);
        wall1.setPosition(new Vec2(-11.5f, -6.5f));

        //wall2
        Shape wallShape2 = new BoxShape(0.5f, 5.5f);
        StaticBody wall2 = new StaticBody(this,  wallShape2);
        wall2.setPosition(new Vec2(11.5f, -6.5f));

        //circular Dynamic body
        Shape ballShape = new CircleShape(1.5f);
        DynamicBody ball = new DynamicBody(this, ballShape);
        ball.setPosition(new Vec2(-8f, 6.5f));


    }
}
