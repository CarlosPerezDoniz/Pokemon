package todocodepokemon;

/**
 *
 * @author Carlos David Pérez Dóniz
 */
public class Squirtie extends Pokemon implements IAgua {

    public Squirtie() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtie y este es mi ataque placaje");  
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Squirtie y este es mi ataque arañazo"); 
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squirtie y este es mi ataque mordisco");
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Hola soy Squirtie y este es mi ataque Hidro Bomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtie y este es mi ataque Pistola Agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtie y este es mi ataque Burbuja");
    }

    @Override
    public void atacarHidroPulso() {
        System.out.println("Hola soy Squirtie y este es mi ataque Hidro Pulso");
    }
    
    
    
}
