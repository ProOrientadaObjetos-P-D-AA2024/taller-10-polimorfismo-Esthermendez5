
package ejecutor001;
import java.util.ArrayList;
import java.util.List;

public class cuenta_por_pagar {
    public String nombreCliente;
    public List<menu> listaMenus;
    public double subtotal;
    public double iva;
    public double total; 

    public cuenta_por_pagar(String nombreCliente, List<menu> listaMenus, double iva) {
        this.nombreCliente = nombreCliente;
        this.listaMenus = listaMenus;
        this.iva = iva;
    }
    
    public void calcularSubtotal() {
        subtotal=0;
        for (menu menu : listaMenus) {
            subtotal += menu.calcularValorMenu();
        }
        System.out.printf("Subtotal: %.2f\n", subtotal);
    }
   
    public void calcularIva() {
        iva = subtotal * 0.15; 
    }
    public void calcularTotalCuenta() {
        subtotal = 0;
        for (menu menu : listaMenus) {
            subtotal += menu.calcularValorMenu();
        }
        total = subtotal * (1 + iva / 100);
        System.out.printf("IVA: %.1f%%\n", iva);
        System.out.printf("Total a pagar: %.3f\n", total);
    }
    @Override
    public String toString() {
        String cadena;
        cadena =    String.format("Numero de Factura: 1 \n");
        cadena +=   String.format("Fecha: 26/05/2024\n");
        cadena +=   String.format("Nombre del Cliente: " + nombreCliente) +  "\n";              
        cadena +=   String.format("Cédula: 1106012634\n");
        cadena +=   String.format("Menus solicitados:\n");
        for (int i = 0; i < listaMenus.size(); i++)  {
            cadena  += listaMenus.get(i) + "\n";
        }
        return cadena ;
    }
    
}

