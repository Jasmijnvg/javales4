public class SuperPokemon {
    private String name;
    private int healthPoints;
    private String attack;
    private String sound;

    public String tackle(){
        return "tackle";
    }

    public String sleepsIn(){
        return "bed";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public SuperPokemon(String name, int healthPoints, String attack, String sound) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.attack = attack;
        this.sound = sound;
    }

    public int attack(){
        System.out.println(this.name+ " was attacked");
        return healthPoints--;
    }

    public int healthPointsAfterAttack(){
        System.out.println("Oh no "+getName()+" was attacked! Healthpoints are now "+healthPoints);
        return healthPoints--;
    }

}
