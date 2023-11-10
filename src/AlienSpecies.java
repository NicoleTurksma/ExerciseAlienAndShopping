class AlienSpecies {
    private String name;
    private String homePlanet;
    private String specialAbility;

    public AlienSpecies(String name, String homePlanet, String specialAbility) {
        this.name = name;
        this.homePlanet = homePlanet;
        this.specialAbility = specialAbility;
    }

    // Getter methods for properties
    public String getName() {
        return name;
    }

    public String getHomePlanet() {
        return homePlanet;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }
}
