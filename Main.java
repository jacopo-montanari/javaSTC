import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        /*
            String name = sc.nextLine();
                Lezione 1
            System.out.println("Hello, " + name + "!");
            System.out.println("Welcome to Java.");
            
                Lezione 2
            int a = sc.nextInt();
            int b = sc.nextInt();
            long sum = (long) a+b;
            System.out.println(sum);
            
                Lezione 3
            int total = sc.nextInt();
            int days = total / 86400;
            int remaining = total % 86400;
            int hours = remaining / 3600;
            remaining %= 3600;
            int minutes = remaining / 60;
            int seconds = remaining % 60;

            System.out.println(days + " days " + hours + " hours " + minutes + " minutes " + seconds + " seconds");
        */
            //Lezione 4
            String[] Suddivisione = sc.nextLine().trim().split("\\s+");
            String Cognome = Suddivisione[Suddivisione.length - 1].toUpperCase();
            String Iniziale = Suddivisione[0].substring(0, 1).toUpperCase();
            System.out.println(Cognome + ", " + Iniziale + ".");
        }
    }
}
