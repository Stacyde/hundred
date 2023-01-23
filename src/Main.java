public class Main {
    public static void main(String[] args) {
        int account = 666;
        int replenishment = 9876;

        int bonus;
        if(replenishment>=1001){
            bonus = replenishment/100;
        }else {
            bonus = 0;
        }
        int sum = account + bonus + replenishment;
        System.out.println("Итоговая сумма равна " + sum);
        System.out.println("Бонус равен " + bonus);

    }
}