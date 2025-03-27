package entity;

import java.util.Optional;
import java.util.Scanner;

public class Customer implements IApp {
    private int customerId = 0;
    private String customerName;
    private Optional<String> customerEmail;

    public Customer() {
        this.customerId = ++customerId;
    }

    public Customer(String customerName, Optional<String> customerEmail) {
        this.customerId = ++customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Optional<String> getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(Optional<String> customerEmail) {
        this.customerEmail = customerEmail;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập tên khách hàng: ");
        this.customerName = scanner.nextLine();
        System.out.println("Nhập email khách hàng: ");
        this.customerEmail = Optional.of(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "Mã khách hàng" + customerId + "Tên khách hàng" + customerName + "Email khách hàng" + customerEmail;
    }
}
