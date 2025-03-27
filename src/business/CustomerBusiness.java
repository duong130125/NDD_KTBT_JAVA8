package business;

import presentation.ShopManagement;
import java.util.Scanner;


public class CustomerBusiness {
    public static void addCustomer(Scanner scanner) {
        ShopManagement.customerList.inputData(scanner);
    }

    public static void displayCustomers() {

    }
}
