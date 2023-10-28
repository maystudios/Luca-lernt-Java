public class Auto {

    private int reifenAnzahl = 0;

    Auto() {

    }

    Auto(int p_reifenAnzahl) {
        reifenAnzahl = p_reifenAnzahl;
    }

    public void print(String name) {
        System.out.println(name + "   " + reifenAnzahl);
    }
}