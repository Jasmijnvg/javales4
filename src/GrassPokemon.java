class GrassPokemon extends SuperPokemon {
    private String color;
    private int age;

    public GrassPokemon(String name, int healthPoints, String attack, String sound, String color, int age) {
        super(name, healthPoints, attack, sound);
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String tackle() {
        return "spit grass";
    }

    public int ageGrassPokemon() {
        System.out.println("Hooray! " + getName() + " has aged one year");
        return age++;
    }
}
