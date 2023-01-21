package day11.task1;

public class Picker implements Worker {
    private int salary;// зп
    private static final int TASK_SALARY=80;
    private Warehouse w;
    private boolean isPayed;


    public Picker(Warehouse w) {
        this.w = w;
    }



    public int getSalary() {
        return salary;
    }


    public void doWork(){
        salary+=TASK_SALARY;
        w.incrementPickedOrders();

    }
    public void bonus(){
        if(w.getCountPickedOrders()<10000){
            System.out.println("Бонус пока не доступен");
            return;
        }

        if(isPayed){
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary+=70000;
        isPayed=true;
    }

    @Override
    public String toString() {
        return "Сборщик зарплата " + salary +
                ", бонус= " + isPayed;
    }
}
