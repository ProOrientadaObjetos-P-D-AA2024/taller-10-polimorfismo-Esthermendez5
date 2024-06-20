
package juegos_de_roles;


public class magos extends personajes {
    public int poderesMagicos;

    public magos( String nombre, int puntosVida, int subirNivel,int poderesMagicos) {
        super(nombre, puntosVida, subirNivel);
        this.poderesMagicos = poderesMagicos;
    }

    

    public int getPoderesMagicos() {
        return poderesMagicos;
    }

    public void setPoderesMagicos(int poderesMagicos) {
        this.poderesMagicos = poderesMagicos;
    }
    public void hechizos(personajes obj) {
        int puntosAtaque = poderesMagicos * nivelExperiencia;
        obj.defender(puntosAtaque);
    }

    @Override
    public void atacar() {
        System.out.println("El mago lanza un hechizo con poder de " + poderesMagicos);
        
    }

    @Override
    public void defender(int puntosAtaque) {
        System.out.println("El mago se protege con magia");
        int puntosDefensa = poderesMagicos / 3; 
        int ataqueRecibido = puntosAtaque - puntosDefensa;

        if (ataqueRecibido > 0) {
            puntosVida -= ataqueRecibido;
            System.out.println(" Y recibe " + ataqueRecibido + " puntos de daño.");
            if (puntosVida <= 0) {
                System.out.println("El mago ha sido derrotado.");
            }
       
        }
    }
    
}
