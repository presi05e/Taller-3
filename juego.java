import java.util.Scanner;

public class juego {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("🎯 ===== JUEGO ADIVINA EL NUMERO ===== 🎯");

            System.out.print("Ingrese el valor minimo (n): ");
            int n = sc.nextInt();

            System.out.print("Ingrese el valor maximo (m): ");
            int m = sc.nextInt();

            int numeroSecreto = (int)(Math.random() * (m - n + 1)) + n;

            int intento = 0;

            System.out.println("\nAdivina el numero entre " + n + " y " + m);

            while (true) {

                System.out.print("Tu intento: ");
                intento = sc.nextInt();

                if (intento == numeroSecreto) {

                    System.out.println("🎉 ¡Correcto! Adivinaste el numero 🎉");
                    break;

                } else if (intento < numeroSecreto) {

                    System.out.println("🔼 El numero es MAYOR");

                } else {

                    System.out.println("🔽 El numero es MENOR");
                }
            }

        } catch (Exception e) {

            System.out.println("❌ Error: ingrese solo numeros");
        }
    }
}