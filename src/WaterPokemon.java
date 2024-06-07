class WaterPokemon extends SuperPokemon {
    private String eats;
    private String drinks;


    public WaterPokemon(String name, int healthPoints, String attack, String sound, String eats, String drinks) {
        super(name, healthPoints, attack, sound);
        this.eats = eats;
        this.drinks = drinks;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    @Override
    public String sleepsIn(){
        return "pineapple house under water";
    }
}
