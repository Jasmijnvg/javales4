class ElectricPokemon extends SuperPokemon {
    private String volt;
    private String charger;


    public ElectricPokemon(String name, int healthPoints, String attack, String sound, String volt, String charger) {
        super(name, healthPoints, attack, sound);
        this.volt = volt;
        this.charger = charger;
    }

    public String getVolt() {
        return volt;
    }

    public void setVolt(String volt) {
        this.volt = volt;
    }

    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    @Override
    public String sleepsIn(){
        return "radiation blocker box";
    }

    public String performElectricAttack(){
        return getName() + " uses" + getAttack();
    }

    public void charge(){
        setVolt("Full");
        System.out.println(getName()+" is now charged");
    }
}
