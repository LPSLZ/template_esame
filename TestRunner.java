import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Il TestRunner crea un'istanza della classe scritta dallo studente
        Counter c = new Counter();

        while (scanner.hasNext()) {
            String comando = scanner.next();
            
            if (comando.equals("INC_UNO")) {
                c.increment();
            } else if (comando.equals("INC_N")) {
                int n = scanner.nextInt();
                c.increment(n);
            } else if (comando.equals("RESET")) {
                c.reset();
            } else if (comando.equals("STAMPA")) {
                System.out.println(c.getCount());
            } else if (comando.equals("FINE")) {
                break;
            }
        }
        scanner.close();
    }
}
