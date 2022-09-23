package Day9.FactoryAssessment;

public class RobotMain {
    public static void main(String[] args) {
 /* When building a robot, a user must configure the following parts:
● Head (With Standard Vision, With Infrared Vision, With Night Vision)
● Body (Square, Round, Triangular, Rectangular)
● Arms (With Hands, With Pinchers, With Boxing Gloves)
● Movement (With Wheels, With Legs, With Tracks)
● Power (Solar, Rechargeable Battery, Biomass)
*/

    Head a= new InfraredVision();
    Body b= new Rectangular();
    Arms c= new Hands();
    Movements d= new Wheels();
    Power e= new Solar();

    RobotFactory robot = new RobotFactory(a, b, c, d, e);
        robot.getArms().handType();
        robot.getBody().shape();
        robot.getHead().vision();
        robot.getMoments().movementType();
        robot.getPower().powerType();
}
}