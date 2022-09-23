package Day9.FactoryAssessment;

public class RechargeableBattery implements Power{
    @Override
    public void powerType() {
        System.out.println("Rechargeable Battery type part");
    }
}