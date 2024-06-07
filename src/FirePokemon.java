class FirePokemon extends SuperPokemon {
    private String weakTo;
    private String strongTo;

    public FirePokemon(String name, int healthPoints, String attack, String sound, String weakTo, String strongTo) {
        super(name, healthPoints, attack, sound);
        this.weakTo = weakTo;
        this.strongTo = strongTo;
    }

    public String getWeakTo() {
        return weakTo;
    }

    public void setWeakTo(String weakTo) {
        this.weakTo = weakTo;
    }

    public String getStrongTo() {
        return strongTo;
    }

    public void setStrongTo(String strongTo) {
        this.strongTo = strongTo;
    }

    @Override
    public String tackle() {
        return "flameTackle";
    }
}
