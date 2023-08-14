package todocodepokemon;

/**
 *
 * @author Carlos David Pérez Dóniz
 */
public class Principal {

    
    public static void main(String[] args) {

        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Squirtie squirtie = new Squirtie();
        Pikachu pikachu = new Pikachu();
        
        charmander.atacarAscuas();
        charmander.atacarAraniazo();
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarMordisco();
        squirtie.atacarAraniazo();
        squirtie.atacarPistolaAgua();
        pikachu.atacarAraniazo();
        pikachu.atacarRayo();
    }
    
}
