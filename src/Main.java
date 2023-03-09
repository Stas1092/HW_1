public class Main {
    public static void main(String[] args) {

        int ticketPrice = 12345;

        int bonusMilePrice = 20;

        int bonusMiles = (ticketPrice / bonusMilePrice);

        System.out.println("Бонусных миль: " + bonusMiles);
    }
}