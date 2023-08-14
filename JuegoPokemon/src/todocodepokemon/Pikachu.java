package todocodepokemon;

/**
 *
 * @author Carlos David Pérez Dóniz
 */
public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }
    

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque mordisco");
    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque Impac Trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque Puño Trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Hola soy Pikachu y este es mi ataque Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Hola soy Pikachu y este es mi ataque Rayo Carga");
    }
    
    
    
}
