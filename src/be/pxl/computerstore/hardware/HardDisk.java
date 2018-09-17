package be.pxl.computerstore.hardware;

public class HardDisk extends ComputerComponent {
    private int capacity;

    public HardDisk(String vendor, String name, double price, int capacity){
        super(vendor, name, price);
        this.capacity = capacity;
    }

    @Override
    public String getFullDescription() {
        StringBuilder tekst = new StringBuilder(super.getFullDescription());
        tekst.append("Capacity = " + capacity);
        return tekst.toString();
    }
}
