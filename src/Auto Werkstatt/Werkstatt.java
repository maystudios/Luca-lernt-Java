public class Werkstatt
{

    Auto car1 = new Auto();
    Auto car2 = new Auto(5);

    Werkstatt() {
        car1.print("Car 1");
        car2.print("Car 2");
    }

    public static void main(String[] args) {
        Werkstatt werkstatt = new Werkstatt();
    }
}