public class Main {
    public static void main(String[] args) {
        int ticketCost = 6000;
        int bonusMile = 20;
        System.out.println(ticketCost + " руб" + " : Cтоимость билета");
        System.out.println(bonusMile + " руб" + " = 1 миля");

        int result = ticketCost / bonusMile;
        System.out.println(result + " : Новое количество миль");
    }
}

