package be.pxl.computerstore.hardware;

public class Processor extends ComputerComponent {
    private double clockspeed;

    public Processor(String vendor, String name, double price, double clockspeed) {
        super(vendor, name, price);
        setClockspeed(clockspeed);
    }

    public double getClockspeed() {
        return clockspeed;
    }

    public void setClockspeed(double clockspeed) {
        if (clockspeed < 0.7){
            this.clockspeed = 0.7;
        }else {
            this.clockspeed = clockspeed;
        }
    }

    @Override
    public String getFullDescription(){
        StringBuilder tekst = new StringBuilder(super.getFullDescription());
        tekst.append("Clock speed = " + clockspeed + "GHz \n");
        return tekst.toString();
    }
}
