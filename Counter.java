import java.util.Scanner;

public class Counter {

    // 1. Dichiara qui le variabili di istanza private (es. il conteggio)


    // 2. Costruttore (opzionale, ma buona pratica per inizializzare il contatore)
    public Counter() {
        // Inserisci qui la logica di inizializzazione
    }

    // 3. Restituisce il valore attuale del contatore
    public int getCount() {
        // Inserisci qui la tua logica
        return 0; 
    }

    // 4. Incrementa il contatore di 1
    public void increment() {
        // Inserisci qui la tua logica
    }

    // 5. Incrementa il contatore di un valore specifico (Overloading)
    public void increment(int value) {
        // Inserisci qui la tua logica
    }

    // 6. Riporta il contatore a zero
    public void reset() {
        // Inserisci qui la tua logica
    }

    // Non toccare il Main altrimenti la prova non verrà valutata
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
