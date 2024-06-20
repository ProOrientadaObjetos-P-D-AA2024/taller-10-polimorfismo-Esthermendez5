
package juegos_de_roles;



public class arqueros extends personajes {
    public int precision;

    public arqueros(String nombre, int puntosVida, int subirNivel,int precision) {
        super(nombre, puntosVida, subirNivel);
        this.precision = precision;
    }

    

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public void habilidadesDistancia(personajes obj) {
        int puntosAtaque = precision * nivelExperiencia;
        obj.defender(puntosAtaque);
    }
   

    @Override
    public void atacar() {
         System.out.println("El arquero dispara una flecha con una precisión de " + precision);
    }

    @Override
    public void defender(int puntosAtaque) {
        System.out.println("El arquero logra esquivar el ataque.");
        int puntosDefensa = precision / 2;
        int ataqueRecibido = puntosAtaque - puntosDefensa;
        if (ataqueRecibido > 0) {
            puntosVida -= ataqueRecibido;
            System.out.println("Y recibe " + ataqueRecibido + " puntos de daño.");
            if (puntosVida <= 0) {
                System.out.println("El arquero  ha sido derrotado.");
            }
        }
    }
}
    

    
