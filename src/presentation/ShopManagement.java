package presentation;

import business.CustomerBusiness;
import entity.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopManagement {
    public static List<Customer> customerList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayMenu(scanner);
    }

    public static void displayMenu(Scanner scanner) {
        do {
            System.out.println("****************SHOP MENU****************");
            System.out.println("1. Quản lý khách hàng");
            System.out.println("2. Quản lý đơn hàng");
            System.out.println("3. Thoát");
            System.out.println("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayCustomerMenu(scanner);
                    break;
                case 2:
                    displayOrderMenu(scanner);
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng chọn từ 1-3");
            }
        }while (true);
    }

    public static void displayCustomerMenu(Scanner scanner) {
        do {
            System.out.println("****************CUSTOMER MENU****************");
            System.out.println("1. Danh sách khách hàng");
            System.out.println("2. Thêm mới khách hàng");
            System.out.println("3. Thoát");
            System.out.println("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    CustomerBusiness.displayCustomers();
                    break;
                case 2:
                    CustomerBusiness.addCustomer(scanner);
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng chọn từ 1-3");
            }
        }while (true);
    }

    public static void displayOrderMenu(Scanner scanner) {
        do {
            System.out.println("****************CUSTOMER MENU****************");
            System.out.println("1. Danh sách đơn hàng");
            System.out.println("2. Thêm mới đơn hàng");
            System.out.println("3. Cập nhật trạng thái đơn hàng");
            System.out.println("4. Danh sách đơn hàng quá hạn");
            System.out.println("5. Thống kê số lượng đơn hàng đã giao (Trạng thái true)");
            System.out.println("6. Tính tổng doanh thu các đơn hàng đã giao");
            System.out.println("7. Thoát");
            System.out.println("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Kết thúc chương trình");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng chọn từ 1-7");
            }
        }while (true);
    }
}
