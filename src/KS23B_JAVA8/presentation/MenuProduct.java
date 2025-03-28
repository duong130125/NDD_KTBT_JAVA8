package KS23B_JAVA8.presentation;

import KS23B_JAVA8.entity.Product;

import java.util.*;

public class MenuProduct {
    private static List<Product> productList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("********** MENU **********");
            System.out.println("1. Danh sách sản phẩm");
            System.out.println("2. Thêm mới sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xóa sản phẩm theo ID");
            System.out.println("5. Tìm sản phẩm theo tên");
            System.out.println("6. Lọc sản phẩm theo điều kiện");
            System.out.println("7. Sắp xếp sản phẩm theo giá");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> showProducts();
                case 2 -> addProduct();
                case 3 -> updateProduct();
                case 4 -> deleteProduct();
                case 5 -> findProductByName();
                case 6 -> filterProducts();
                case 7 -> sortProducts();
                case 8 -> {
                    System.out.println("Thoát chương trình!");
                    System.exit(0);
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private static void showProducts() {
        productList.forEach(Product::displayData);
    }

    private static void addProduct() {
        Product product = new Product();
        product.inputData(scanner);
        productList.add(product);
    }

    private static void updateProduct() {
        System.out.print("Nhập ID sản phẩm cần cập nhật: ");
        int id = Integer.parseInt(scanner.nextLine());
        Optional<Product> productOpt = productList.stream().filter(p -> p.getProductId() == id).findFirst();

        productOpt.ifPresentOrElse(product -> {
            System.out.print("Nhập tên mới: ");
            product.setProductName(scanner.nextLine());
            System.out.print("Nhập giá mới: ");
            product.setPrice(Float.parseFloat(scanner.nextLine()));
            System.out.print("Nhập danh mục mới: ");
            product.setCategory(scanner.nextLine());
        }, () -> System.out.println("Không tìm thấy sản phẩm!"));
    }

    private static void deleteProduct() {
        System.out.print("Nhập ID sản phẩm cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        productList.removeIf(p -> p.getProductId() == id);
    }

    private static void findProductByName() {
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String name = scanner.nextLine();
        productList.stream()
                .filter(p -> p.getProductName().equalsIgnoreCase(name))
                .forEach(Product::displayData);
    }

    private static void filterProducts() {
        System.out.println("1. Lọc sản phẩm có giá lớn hơn X");
        System.out.println("2. Lọc sản phẩm theo danh mục");
        int option = Integer.parseInt(scanner.nextLine());

        if (option == 1) {
            System.out.print("Nhập giá X: ");
            float price = Float.parseFloat(scanner.nextLine());
            productList.stream().filter(p -> p.getPrice() > price).forEach(Product::displayData);
        } else if (option == 2) {
            System.out.print("Nhập danh mục: ");
            String category = scanner.nextLine();
            productList.stream().filter(p -> p.getCategory().equalsIgnoreCase(category)).forEach(Product::displayData);
        }
    }

    private static void sortProducts() {
        System.out.println("1. Sắp xếp giá tăng dần");
        System.out.println("2. Sắp xếp giá giảm dần");
        int option = Integer.parseInt(scanner.nextLine());

        Comparator<Product> comparator = Comparator.comparing(Product::getPrice);
        if (option == 2) {
            comparator = comparator.reversed();
        }
        productList.sort(comparator);
        showProducts();
    }
}
