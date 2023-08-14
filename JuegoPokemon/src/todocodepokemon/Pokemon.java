package todocodepokemon;

/**
 *
 * @author Carlos David Pérez Dóniz
 */
public abstract class Pokemon {

    protected int numPokedex;
    protected String nombrePokemon;
    protected double pesoPokemon;
    protected String sexo;
    protected int temporadaQueAparece;
    protected String tipo;

    public Pokemon() {
    }

    public Pokemon(int numPokedex, String nombrePokemon, double pesoPokemon, String sexo, int temporadaQueAparece, String tipo) {
        this.numPokedex = numPokedex;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.sexo = sexo;
        this.temporadaQueAparece = temporadaQueAparece;
        this.tipo = tipo;
    }

    public int getNum_pokedex() {
        return numPokedex;
    }

    public void setNum_pokedex(int num_pokedex) {
        this.numPokedex = num_pokedex;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public double getPesoPokemon() {
        return pesoPokemon;
    }

    public void setPesoPokemon(double pesoPokemon) {
        this.pesoPokemon = pesoPokemon;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTemporadaQueAparece() {
        return temporadaQueAparece;
    }

    public void setTemporadaQueAparece(int temporadaQueAparece) {
        this.temporadaQueAparece = temporadaQueAparece;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    protected abstract void atacarPlacaje();

    protected abstract void atacarAraniazo();

    protected abstract void atacarMordisco();

}
