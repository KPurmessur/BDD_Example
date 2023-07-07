package Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private String productName;
    private int price;

    public List<String> getProductList(){
        List<String> productList = new ArrayList<>();
        productList.add("Microsoft Surface Pro");
        productList.add("HP Spectre x360 16");
        productList.add("DELL Inspiron 7620 2-in-1");
        return productList;
    }


}
