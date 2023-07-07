package Implementation;


import Entity.Product;

import java.util.ArrayList;
import java.util.List;

public class SearchMultiple {

    public List<String> displayProducts(Product product){

        if(product.getProductList().contains(product.getProductName())){
            return product.getProductList();
        }
        else {
            return null;
        }

    }
}
