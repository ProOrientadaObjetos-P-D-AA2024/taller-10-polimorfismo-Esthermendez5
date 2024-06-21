
package ejecutor001;

public class menuCarta extends menu {
    public double valorGuarnicion;
    public double valorBebida;
    public double porcentajeAdicional; 

    public menuCarta(String nombrePlato, double valorInicialMenu,double valorGuarnicion, double valorBebida, double porcentajeAdicional) {
        super(nombrePlato, valorInicialMenu);
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeAdicional = porcentajeAdicional;
    }
    @Override
    public double calcularValorMenu() {
        double valorMenu = valorInicialMenu * (porcentajeAdicional / 100);
        return valorInicialMenu + valorGuarnicion + valorBebida + valorMenu;
    }
    @Override
    public String toString() {
        String cadena;
        cadena = String.format("Menu a la Carta: " + nombrePlato) + "\n"; 
        cadena += String.format("Valor Inicial: " + valorInicialMenu) + "\n";
        cadena += String.format("Valor por la porcion de guarnicion: " + valorGuarnicion) + "\n"  ;  
        cadena += String.format("Valor por la bebida: " + valorBebida) + "\n"  ;  
        cadena += String.format("Porcentaje adicional: " + porcentajeAdicional) + "\n"  ;  
        cadena += String.format("Valor Total:  " + calcularValorMenu()) + "\n"  ; 
        return cadena;
    }
}
