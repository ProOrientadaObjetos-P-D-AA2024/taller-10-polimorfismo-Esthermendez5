
package ejecutor001;

public class menuDia extends menu {
    public double valorPostre;
    public double valorBebida;

    public menuDia(String nombrePlato, double valorInicialMenu,double valorPostre, double valorBebida) {
        super(nombrePlato, valorInicialMenu);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
    }

    public double getValorPostre() {
        return valorPostre;
    }

    public void setValorPostre(double valorPostre) {
        this.valorPostre = valorPostre;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }
    @Override
    public double calcularValorMenu() {
        return valorInicialMenu + valorPostre + valorBebida;
    }
    @Override
    public String toString() {
        String cadena;
        cadena = String.format("Menu del Dia: " + nombrePlato) + "\n"; 
        cadena += String.format("Valor Inicial: " + valorInicialMenu) + "\n";
        cadena += String.format("Valor del Postre: " + valorPostre) + "\n"  ;  
        cadena += String.format("Valor por la bebida: " + valorBebida) + "\n"  ;  
        cadena += String.format("Valor Total:  " + calcularValorMenu()) + "\n"  ;  
        
        return cadena;
    }

}
