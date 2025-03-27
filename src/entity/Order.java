package entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Order implements IApp {
    private int orderId = 0;
    private Customer customer;
    private LocalDate orderDate;
    private double totalAmount;
    private boolean status;

    public Order() {
        this.orderId = ++orderId;
    }

    public Order(Customer customer, LocalDate orderDate, double totalAmount, boolean status) {
        this.orderId = ++orderId;
        this.customer = customer;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner) {

    }

    @Override
    public String toString() {
        return "Mã Dơn hàng" + orderId + "khách hàng" + customer + "Ngày đặt hàng" + orderDate + "Tổng tiền đơn hàng" + totalAmount + "Trạng thái đơn hàng" + status;
    }
}
