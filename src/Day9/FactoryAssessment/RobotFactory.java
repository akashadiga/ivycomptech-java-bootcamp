package Day9.FactoryAssessment;

public class RobotFactory {
    private Head head;
    private Body body;
    private Arms arms;
    private Movements moments;
    private Power power;


    public RobotFactory(Head head, Body body, Arms arms, Movements moments, Power power) {
        this.head = head;
        this.body = body;
        this.arms = arms;
        this.moments = moments;
        this.power = power;
    }

    public Head getHead() {
        return head;
    }

    public Body getBody() {
        return body;
    }

    public Arms getArms() {
        return arms;
    }

    public Movements getMoments() {
        return moments;
    }

    public Power getPower() {
        return power;
    }
}