package business;

public class Product {
    private int productNo;
    private String pname;
    private String price;
    private int qnty;
    private String Category;

    public Product() {
    }

    public Product(int productNo, String pname, String price, int qnty, String Category) {
        this.productNo = productNo;
        this.pname = pname;
        this.price = price;
        this.qnty = qnty;
        this.Category = Category;
    }

    public int getProductNo() {
        return productNo;
    }

    public void setProductNo(int productNo) {
        this.productNo = productNo;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQnty() {
        return qnty;
    }

    public void setQnty(int qnty) {
        this.qnty = qnty;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    
    public String Print(){
        String line = String.valueOf(getProductNo())+","+getPname()+","+getPrice()+","+getQnty()+","+getCategory();
        return line;
    }
    
    
}
