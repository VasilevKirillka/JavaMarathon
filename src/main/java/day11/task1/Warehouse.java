package day11.task1;

public class Warehouse {
    private int countPickedOrders; // кол-во собраннных заказов
    private int countDeliveredOrders; // кол-во доставленных заказов

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void incrementPickedOrders(){
        countPickedOrders++;
    }
    public void incrementDeliveredOrders(){
        countDeliveredOrders++;
    }

    @Override
    public String toString() {
        return "Склад: Количество собранных заказов: " +
                 + countPickedOrders +
                " Количество доставленных заказов: " + countDeliveredOrders;
    }

}
