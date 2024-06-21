
package ejecutor001;

public class menuNiños extends menu {
    public double valorHelado;
    public double valorPastel;

    public menuNiños(String nombrePlato, double valorInicialMenu,double valorHelado, double valorPastel) {
        super(nombrePlato, valorInicialMenu);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;
    }

    public double getValorHelado() {
        return valorHelado;
    }

    public void setValorHelado(double valorHelado) {
        this.valorHelado = valorHelado;
    }

    public double getValorPastel() {
        return valorPastel;
    }

    public void setValorPastel(double valorPastel) {
        this.valorPastel = valorPastel;
    }
    @Override
    public double calcularValorMenu() {
        return valorInicialMenu + valorHelado + valorPastel;
    }
    @Override
    public String toString() {
        String cadena;
        cadena = String.format("Menu de niños: " + nombrePlato) + "\n"; 
        cadena += String.format("Valor Inicial: " + valorInicialMenu) + "\n";
        cadena += String.format("Valor por la porcion de Helado: " + valorHelado) + "\n"  ;  
        cadena += String.format("Valor por la pocion de pastel: " + valorPastel) + "\n"  ;  
        cadena += String.format("Valor Total:  " + calcularValorMenu()) + "\n"  ;  
        
        return cadena;
    }
    
    
}
