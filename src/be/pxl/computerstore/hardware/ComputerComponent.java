package be.pxl.computerstore.hardware;

public class ComputerComponent {
    private String vendor;
    private String name;
    private double price;
    private String articleNumber;
    private static int number = 1;

    {
        number++;
    }

    public ComputerComponent(String vendor, String name, double price){
        this.vendor = vendor;
        this.name = name;
        this.price = price;
        setArticleNumber();
    }

    private void setArticleNumber() {
        articleNumber = vendor;
        String zeros = "";
        if (articleNumber.length() >= 3){
            articleNumber = articleNumber.substring(0, 3).toUpperCase();
        }else {
            while (articleNumber.length() < 3) {
                articleNumber += "X";
            }
        }

        articleNumber += "-";

        int numberOffZero = 5 - Integer.toString(number).length();
        for (int i = 0; i < numberOffZero; i++){
            zeros += "0";
        }

        articleNumber += zeros + number;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getArticleNumber(){
        return this.articleNumber;
    }

    @Override
    public String toString(){
        return name + " (" +  articleNumber + ")";
    }

    public String getFullDescription(){
        StringBuilder tekst = new StringBuilder();
        tekst.append("ArticleNumber = " + articleNumber + "\n" + "Vendor = " + vendor + "\n" + "Name = " +  name + "\n" + "Price = " + price + "\n");

        return tekst.toString();
    }
}
