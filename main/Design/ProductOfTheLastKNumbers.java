package Design;

import java.util.ArrayList;
import java.util.List;

public class ProductOfTheLastKNumbers {
    private List<Integer> prefixProduct;

    public ProductOfTheLastKNumbers() {
        prefixProduct = new ArrayList<>();
        prefixProduct.add(1);
    }

    public void add(int num) {
        if (num > 0) {
            int preProduct = prefixProduct.get(prefixProduct.size() - 1);
            prefixProduct.add((num * preProduct));
        } else {
            prefixProduct = new ArrayList<>();
            prefixProduct.add(1);
        }
    }

    public int getProduct(int k) {
        int size = prefixProduct.size();

        return k < size ? prefixProduct.get(size - 1) / prefixProduct.get(size - k - 1) : 0;
    }

}
