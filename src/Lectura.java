import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe el nombre de tu película favorita:");
        String pelicula = teclado.nextLine();

        System.out.println("Escribe la fecha de lanzamiento:");
        int fechaDeLanzamiento = teclado.nextInt();

        System.out.println("Dinos qué nota le das a la película:");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
