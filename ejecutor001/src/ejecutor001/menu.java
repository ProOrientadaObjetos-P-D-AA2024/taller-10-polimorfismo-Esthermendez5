
package ejecutor001;
public abstract class menu {
    protected String nombrePlato;
    public double valorInicialMenu;

    public menu(String nombrePlato, double valorInicialMenu) {
        this.nombrePlato = nombrePlato;
        this.valorInicialMenu = valorInicialMenu;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public double getValorInicialMenu() {
        return valorInicialMenu;
    }

    public void setValorInicialMenu(double valorInicialMenu) {
        this.valorInicialMenu = valorInicialMenu;
    }
    public abstract double calcularValorMenu();
    @Override
    public String toString() {
        return String.format("Plato: %s\nValor Inicial: %.2f\nValor del Menu: %.2f", nombrePlato, valorInicialMenu, calcularValorMenu());
    }
    
}
