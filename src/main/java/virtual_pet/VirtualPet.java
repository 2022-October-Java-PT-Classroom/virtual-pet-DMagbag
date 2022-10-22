package virtual_pet;

public class VirtualPet {
    private int health;
    private int energy;
    private int rage;
    private int skillLevel;

    public VirtualPet(int health, int energy, int rage, int skillLevel) {
        this.health = health;
        this.energy = energy;
        this.rage = rage;
        this.skillLevel = skillLevel;
    }

    public int getHealth() {
        return health;
    }

    public int getEnergy() {
        return energy;
    }

    public int getRage() {
        return rage;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void ride() {
        energy -= 10;
        rage -= 10;
    }

    public void train() {
        skillLevel += 1;
        energy -= 10;
    }

    public void pet() {
        rage -= 10;
    }

    public void feed() {
        health += 10;
        energy += 10;
    }

    public void putToSleep() {
        energy += 10;
        rage -= 10;
    }

    public void tick() {
        health -= 5;
        energy -= 5;
        rage += 5;
    }

    public void gameInstructions() {
        System.out.println("Welcome to Virtual Pet. Now that you've adopted a dragon, it's time to\n" +
                "take care of your new pet. Your dragon stats include health, energy, rage, and\n" +
                "skill Level. To keep your dragon's health up, you need to feed it. Feeding\n" +
                "it also gives your dragon energy. If you ride your dragon, it gets tired and\n" +
                "its energy level goes down. However, since your dragon enjoys your time together\n" +
                "its rage decreases. You also train your dragon to defend your people's land. Keep\n" +
                "training your dragon to increase its attack and defense skill level. But be careful,\n" +
                "if you train your dragon too often, it gets tired and its energy level decreases.\n" +
                "Petting your dragon calms it and lessons its rage. To increase your dragon's energy,\n" +
                "you must put your dragon to sleep in its cave. This will also calm it and keep its \n" +
                "rage down. As the day goes on, your dragon gets hungry, tired, and irritable affecting\n" +
                "health, energy and rage, respectively. This makes it unhappy and increases its rage.\n" +
                "Now go on and take care of your dragon. Don't forget to feed your dragon or let it \n" +
                "get too tired or your dragon will die. GOOD LUCK!!!!!!!!!!! Oh, and one more thing,\n" +
                "if you can no longer care for your dragon, you must give it up for adoption.\n");
    }

    public void printDragonStats() {
        System.out.println("                \\||/\n" +
                "                |  @___oo\n" +
                "      /\\  /\\   / (__,,,,|\n" +
                "     ) /^\\) ^\\/ _)\n" +
                "     )   /^\\/   _)\n" +
                "     )   _ /  / _)\n" +
                " /\\  )/\\/ ||  | )_)\n" +
                "<  >      |(,,) )__)\n" +
                " ||      /    \\)___)\\\n" +
                " | \\____(      )___) )___\n" +
                "  \\______(_______;;; __;;;\n");

        //Image taken from ASCII Art Archive (https://www.asciiart.eu/mythology/dragons)

        System.out.println("  STATS" +
                "\n---------" +
                "\nHEALTH: " + health +
                "\nENERGY: " + energy +
                "\nRAGE: " + rage +
                "\nSKILL LEVEL: " + skillLevel + "\n");
    }
}