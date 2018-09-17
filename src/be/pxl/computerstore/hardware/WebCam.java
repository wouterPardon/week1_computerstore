package be.pxl.computerstore.hardware;

public class WebCam extends Peripheral {
    private int frameRate;

    public WebCam(String vendor, String name, double price, int frameRate){
        super(vendor, name, price);
        this.frameRate = frameRate;
    }
    @Override
    public String getFullDescription(){
        StringBuilder tekst = new StringBuilder(super.getFullDescription());
        tekst.append("Frame rate = " + frameRate);
        return tekst.toString();
    }
}
