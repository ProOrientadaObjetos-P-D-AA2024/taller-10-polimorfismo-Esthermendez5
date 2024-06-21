
package ejecutor001;

import java.util.ArrayList;

public class Ejecutor002 {

    public static void main(String[] args) {
        ArrayList<menu> menus = new ArrayList<>();
        menuNiños menu1 = new menuNiños("Pizza", 5.00, 1.00, 1.50);
        menuNiños menu2 = new menuNiños("Papas", 3.50, 1.00, 1.50);
        menuEconomico menu3 = new menuEconomico("Combo 1", 4.00, 25.0);
        menuDia menu4 = new menuDia("Pollo", 5.50, 1.00, 1.50);
        menuCarta menu5 = new menuCarta("Camarones Apanados", 7.0, 1.00, 2.5, 12.0);
        
        // Agregar menús a la lista
        menus.add(menu1);
        menus.add(menu2);
        menus.add(menu3);
        menus.add(menu4);
        menus.add(menu5);

        // Crear objeto de cuenta
        cuenta_por_pagar Cuenta = new cuenta_por_pagar("Esther Mendez", menus, 10.0);

        System.out.println(Cuenta);
        Cuenta.calcularSubtotal();
        Cuenta.calcularTotalCuenta();
    
    }
    
}
