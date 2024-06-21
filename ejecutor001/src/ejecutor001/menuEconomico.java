
package ejecutor001;


public class menuEconomico extends menu {
    public double porcentajeDescuento;

    public menuEconomico(String nombrePlato, double valorInicialMenu,double porcentajeDescuento) {
        super(nombrePlato, valorInicialMenu);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
    @Override
    public double calcularValorMenu() {
        double descuento = valorInicialMenu * (porcentajeDescuento / 100);
        return valorInicialMenu - descuento;
    }
    @Override
    public String toString() {
        String cadena;
        cadena = String.format("Menu Economico: " + nombrePlato) + "\n"; 
        cadena += String.format("Valor Inicial: " + valorInicialMenu) + "\n";  
        cadena += String.format("Porcentaje de descuento: " + porcentajeDescuento) + "\n"  ;  
        cadena += String.format("Valor Total:  " + calcularValorMenu()) + "\n"  ;  
        
        return cadena;
    }
    
    
}
