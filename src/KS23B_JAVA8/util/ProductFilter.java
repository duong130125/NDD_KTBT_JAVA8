package KS23B_JAVA8.util;

import KS23B_JAVA8.entity.Product;

@FunctionalInterface
public interface ProductFilter {
    boolean filter(Product product);
}
