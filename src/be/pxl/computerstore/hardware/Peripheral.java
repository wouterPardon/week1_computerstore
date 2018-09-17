package be.pxl.computerstore.hardware;

public abstract class Peripheral extends ComputerComponent {

    public Peripheral(String vendor, String name, double price){
        super(vendor, name, price);
    }

    @Override
    public String toString(){
        String className = this.getClass().toString().substring(36);
        return className + " " +  super.toString();
    }
}
