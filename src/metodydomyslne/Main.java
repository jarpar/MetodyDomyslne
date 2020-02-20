package metodydomyslne;

public class Main {
    public static void main(String[] args) {
    }
}

interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}

