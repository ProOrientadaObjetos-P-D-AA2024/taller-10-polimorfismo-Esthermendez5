
package juegos_de_roles;


public class guerreros extends personajes {
    public int fuerza;

    public guerreros( String nombre, int puntosVida, int subirNivel,int fuerza) {
        super(nombre, puntosVida, subirNivel);
        this.fuerza = fuerza;
    }

    

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    public void habilidadesCuerpo(personajes obj){
         int puntosAtaque = fuerza * nivelExperiencia;
        obj.defender(puntosAtaque);
    }

    @Override
    public void atacar() {
        System.out.println("El guerrero realiza un ataque con una fuerza de " + fuerza);
        
    }
    
    @Override
    public void defender(int puntosAtaque) {
        System.out.println( "El guerrero se defiende con su escudo.");
        int puntosDefensa = fuerza / 2; 
        int ataqueRecibido = puntosAtaque - puntosDefensa;

        if (ataqueRecibido > 0) {
            puntosVida -= ataqueRecibido;
            System.out.println("Y recibe " + ataqueRecibido + " puntos de daño.");
            if (puntosVida <= 0) {
                System.out.println("El guerrero ha sido derrotado.");
            }
        }      
   }   
    
    
}
