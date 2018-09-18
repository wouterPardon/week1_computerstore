package be.pxl.computerstore.hardware;

public abstract class Peripheral extends ComputerComponent {

    public Peripheral(String vendor, String name, double price){
        super(vendor, name, price);
    }

    @Override
    public String toString(){
        String className = this.getClass().toString().substring(this.getClass().toString().lastIndexOf('.') + 1);
        return className + " " +  super.toString();
    }
}
