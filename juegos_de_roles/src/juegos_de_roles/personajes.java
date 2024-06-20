package juegos_de_roles;
public abstract class personajes {
    protected int puntosVida;
    protected int nivelExperiencia;
    protected int subirNivel;
    protected String nombre;

    public personajes(String nombre, int puntosVida, int nivelExperiencia) {
        this.nombre= nombre;
        this.puntosVida = puntosVida;
        this.nivelExperiencia = nivelExperiencia;
        this.subirNivel = 1;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public int getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(int nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public int getSubirNivel() {
        return subirNivel;
    }
    public void setSubirNivel(int subirNivel) {
        this.subirNivel = subirNivel;
    }

    public void subirNivel (int batallasGanadas){
        switch (batallasGanadas) {
                case 1 -> {
                    subirNivel=2;
                    System.out.println(nombre + " Ha subido al nivel " + subirNivel);
                }
                case 2 -> {
                    subirNivel=3;
                    System.out.println(nombre + " Ha subido al nivel " + subirNivel);
                    System.out.println("HA COMPLETADO TODOS LOS NIVELES");
                }
        }
    }
    
            
    public abstract void atacar();
    public abstract void defender(int puntosAtaque);
}


