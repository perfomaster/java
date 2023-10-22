package examples;
import java.util.ArrayList;
import java.util.List;

public class vendor {

    private List<product> productList = new ArrayList<>();

    public List<product> getProductList(){
        return productList;
    }

    public void addProduct(product product){
        this.productList.add(product);
    }

    public product getProductByName(String name){
        for (product product : productList){
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String text = "";
        for (product product : productList){
            text += product.toString() + "\n";
        }
        return text;
    }
}