package other;

import java.util.Objects;

interface Product {
    void getInfo();
}

class ProductA implements Product {
    @Override
    public void getInfo() {
        System.out.println("This is Product A");
    }
}

class ProductB implements Product {
    @Override
    public void getInfo() {
        System.out.println("This is Product B");
    }
}

class ProductFactory {
    public static Product createProduct(String type) {
        if ("A".equals(type)) {
            return new ProductA();
        } else if ("B".equals(type)) {
            return new ProductB();
        }
        return null;
    }
}

public class ConstructorEx2 {
    public static void main(String[] args) {
        Product productA = ProductFactory.createProduct("A");
        Product productB = ProductFactory.createProduct("B");

        Objects.requireNonNull(productA).getInfo();
        productA.getInfo();
        Objects.requireNonNull(productB).getInfo();
        productB.getInfo();
    }
}
