package lesson2;

public class SwitchApp {
    public static void main(String[] args) {
        //checkOrderStatus("ACCEPTED");
        //checkOrderStatus2("IN_DELIVERY");
        checkOrderStatus("SHIPPED");
        checkOrderStatus2("IN_DELIVERY");
    }

    public static void checkOrderStatus(String orderStatus) {
        if (orderStatus.equals("ACCEPTED")) {
            System.out.println("Принят");
        } else if (orderStatus.equals("DELIVERED")) {
            System.out.println("Доставлен");
        } else {
            System.out.println("Неизвестный статус заказа");
        }
    }

    public static void checkOrderStatus2(String orderStatus) {
        switch (orderStatus) {
            case "ACCEPTED":
            case "DELIVERED": {
                System.out.println("Принят");
                break;
            }
            default: {
                System.out.println("Неизвестный статус заказа");
            }
        }
    }

}
