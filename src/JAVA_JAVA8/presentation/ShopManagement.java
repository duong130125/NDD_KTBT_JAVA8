package JAVA_JAVA8.presentation;

import JAVA_JAVA8.business.CustomerBusiness;
import JAVA_JAVA8.business.IOrderBusiness;
import JAVA_JAVA8.business.OrderBusiness;
import JAVA_JAVA8.entity.Customer;
import JAVA_JAVA8.entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopManagement {
    public static final List<Customer> listCustomers = new ArrayList<Customer>();
    public static final List<Order> listOrders = new ArrayList<>();

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
                    System.out.println("Quay lại menu chính.");
                    scanner.close();
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
                    OrderBusiness.displayOrders();
                    break;
                case 2:
                    OrderBusiness.addOrder(scanner);
                    break;
                case 3:
                    OrderBusiness.updateOrderStatus(scanner);
                    break;
                case 4:
                    System.out.println("Danh sách đơn hàng quá hạn: " + OrderBusiness.getOrderOverdue());
                    break;
                case 5:
                    System.out.println("Số lượng đơn hàng đã giao: " + OrderBusiness.getOrderDelivied().size());
                    break;
                case 6:
                    System.out.println("Tổng doanh thu: " + IOrderBusiness.getTotalRevenue());
                    break;
                case 7:
                    System.out.println("Quay lại menu chính.");
                    scanner.close();
                    break;
                default:
                    System.err.println("Vui lòng chọn từ 1-7");
            }
        }while (true);
    }
}
