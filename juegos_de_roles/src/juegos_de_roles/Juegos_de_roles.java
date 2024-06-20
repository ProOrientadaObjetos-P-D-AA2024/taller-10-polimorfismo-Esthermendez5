
package juegos_de_roles;
import java.util.Scanner;

public class Juegos_de_roles {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        guerreros guerrero = new guerreros("Guerrero", 100,1, 75);
        magos mago = new magos( "Mago",100,1, 80);
        arqueros arquero = new arqueros( "Arquero",100,1, 90);
        boolean salir = false;

        while (!salir) {
            System.out.println("      Batallas     ");
            System.out.println("========================");
            System.out.println(" Elige una opción: ");
            System.out.println("[1] Guerrero vs Mago");
            System.out.println("[2] Guerrero vs Arquero");
            System.out.println("[3] Mago vs Arquero");
            System.out.println("[0] Salir");
            
            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Batalla 1");
                    System.out.println("Guerrero vs Mago");
                    System.out.println("Comienza la batalla:");
                    guerrero.atacar();
                    mago.defender(50);
                    mago.atacar();
                    guerrero.defender(100);
                    guerrero.atacar();
                    mago.defender(75);
                    mago.atacar();
                    guerrero.defender(100);
                    mago.subirNivel(1);
                    break;
                case 2:
                    System.out.println("Batalla 2");
                    System.out.println("Guerrero vs Arquero");
                    System.out.println("Comienza la batalla:");
                    arquero.atacar();
                    guerrero.defender(10);
                    guerrero.atacar();
                    arquero.defender(10);
                    arquero.atacar();
                    arquero.atacar();
                    guerrero.defender(75);
                    guerrero.atacar();
                    arquero.defender(50);
                    arquero.atacar();
                    guerrero.defender(100);
                    arquero.subirNivel(1);
                    break;
                case 3:
                    System.out.println("Batalla final");
                    System.out.println("Arquero vs Mago");
                    System.out.println("Comienza la batalla:");
                    mago.atacar();
                    arquero.defender(45);
                    arquero.atacar();
                    mago.defender(50);
                    mago.atacar();
                    arquero.defender(50);
                    arquero.atacar();
                    mago.defender(50);
                    arquero.atacar();
                    mago.defender(100);
                    arquero.subirNivel(2);
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }
        System.out.println("¡Gracias por jugar!");
      
    }
    
}
