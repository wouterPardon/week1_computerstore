package be.pxl.computerstore.hardware;

import be.pxl.computerstore.data.KeyboardLayout;

public class Keyboard extends Peripheral {
    private KeyboardLayout keyboardLayout;

    public Keyboard(String vendor, String name, double price, KeyboardLayout keyboardLayout){
        super(vendor, name, price);
        this.keyboardLayout = keyboardLayout;
    }

    @Override
    public String getFullDescription() {
        StringBuilder tekst = new StringBuilder(super.getFullDescription());
        tekst.append("Keyboard layout = " + keyboardLayout);
        return tekst.toString();
    }
}
