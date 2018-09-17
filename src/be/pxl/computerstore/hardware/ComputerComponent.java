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

        if (articleNumber.length() >= 3){
            articleNumber = articleNumber.substring(0, 3).toUpperCase();
        }else {
            while (articleNumber.length() < 3) {
                articleNumber += "X";
            }
        }

        articleNumber += "-";

        if(number > 9){
            articleNumber += "000" + number;
        }else if(number > 99){
            articleNumber += "00" + number;
        }else if(number > 999){
            articleNumber += "0" + number;
        }else if(number > 9999){
            articleNumber += number;
        }else {
            articleNumber += "0000" + number;
        }


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
