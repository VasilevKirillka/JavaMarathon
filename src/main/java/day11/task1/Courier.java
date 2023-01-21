package day11.task1;

public class Courier implements Worker{
    private int salary;// зп
    private static final int TASK_SALARY=100;
    private Warehouse w;
    private boolean isPayed;

    public Courier(Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    public void doWork(){
        salary+=TASK_SALARY;
        w.incrementDeliveredOrders();
    };
    public void bonus(){
        if(w.getCountDeliveredOrders()<10000){
            System.out.println("Бонус пока не доступен");
            return;
        }

        if(isPayed){
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary+=50000;
        isPayed=true;
    }

    @Override
    public String toString() {
        return "Курьер зарплата " + salary +
                ", бонус= " + isPayed;
    }
}
