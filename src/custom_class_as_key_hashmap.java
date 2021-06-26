import java.util.HashMap;
import java.util.Objects;

class Product
{
    private int productNo;
    private String productName;

    public Product(int productNo, String productName) {
        this.productNo = productNo;
        this.productName = productName;
    }

    public int getProductNo() {
        return productNo;
    }

    public void setProductNo(int productNo) {
        this.productNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    // here productNo is primary key which identify by equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productNo == product.productNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productNo);
    }

}

public class custom_class_as_key_hashmap {
    public static void main(String[] args) {
        Product p=new Product(1,"Computer");
        Product p1=new Product(2,"Mobile");

        HashMap<Product,String> map=new HashMap();
        map.put(p,"product1");
        map.put(p1,"product2");

        map.forEach((k,v)->System.out.println(k.getProductNo() + " === " + k.getProductName()));

        System.out.println();
        System.out.println("=================================");
        System.out.println();

        // It prints Computer because productNo is same. so it replace by previous object value
        Product p3=new Product(1,"Tv");
        map.put(p3,"product3");

        map.forEach((k,v)->System.out.println(k.getProductNo() + " === " + k.getProductName()));
    }
}
