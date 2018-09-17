package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Computable;
import be.pxl.computerstore.util.TooManyPeripheralsException;

public class ComputerSystem extends ComputerComponent implements Computable {
    private Processor processor;
    private HardDisk hardDisk;
    private ComputerCase computerCase;
    private Peripheral[] peripherals = new Peripheral[3];
    public static final int MAX_PERIPHERAL = 3;

    public ComputerSystem(){
        super("", "", 0);
    }

    public void addPeripheral(Peripheral peripheral) throws TooManyPeripheralsException {
        Boolean full = true;
        for (int i = 0; i < peripherals.length; i++){
            if (peripherals[i] == null){
                peripherals[i] = peripheral;
                full = false;
                break;
            }
        }

        if (full){
            throw new TooManyPeripheralsException("De array zit al vol");
        }
    }

    public void removePeripheral(String articleNumber){
        for (int i = 0; i < peripherals.length ; i++) {
            if (peripherals[i] != null) {
                if (peripherals[i].getArticleNumber().equals(articleNumber)) {
                    peripherals[i] = null;
                }
            }
        }
    }

    public int getNumberOfPeripherals() {
        int count = 0;

        for (int i = 0; i < peripherals.length; i++){
            if (peripherals[i] != null) {
                count++;
            }
        }

        return count;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }

    public Peripheral[] getPeripherals() {
        return peripherals;
    }

    @Override
    public double totalPriceExcl() {
        double currentPrice = 0;
        currentPrice += processor.getPrice() + computerCase.getPrice();

        if(hardDisk != null) {
            currentPrice += hardDisk.getPrice();
        }

        for (int i = 0; i < peripherals.length; i++) {
            if (peripherals[i] != null) {
                currentPrice += peripherals[i].getPrice();
            }
        }

        return currentPrice;
    }

    @Override
    public double totalPriceIncl() {
       return totalPriceExcl() * 1.21;
    }
}
