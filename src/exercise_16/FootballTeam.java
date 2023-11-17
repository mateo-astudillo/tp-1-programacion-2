package exercise_16;

import java.util.ArrayList;

public class FootballTeam {
    private String name;
    private String country;
    private Goalkeeper goalkeeper;
    private final Defender[] defenders;
    private final Midfielder[] midfielders;
    private final Forward[] forwards;
    private final ArrayList<Player> substitutes;

    public FootballTeam(String name, String country) {
        this.setName(name);
        this.setCountry(country);
        this.goalkeeper = new Goalkeeper();
        this.defenders = new Defender[4];
        this.midfielders = new Midfielder[4];
        this.forwards = new Forward[2];
        this.substitutes = new ArrayList<Player>();
    }

    public void addGoalkeeper(Goalkeeper goalkeeper) {
        if (!(this.goalkeeper == null)) {
            this.goalkeeper = goalkeeper;
        }
        goalkeeper.setStarter(false);
        this.substitutes.add(goalkeeper);
    }

    public void addDefender(Defender defender) {
        int counter = 0;
        for (Defender d : this.defenders) {
            if (d.isStarter())
                counter += 1;
            if (counter >= d.max) {
                defender.setStarter(false);
                this.substitutes.add(defender);
                return;
            }
        }
        this.defenders[counter] = defender;
    }

    public void addMidfielder(Midfielder midfielder) {
        int counter = 0;
        for (Midfielder m : this.midfielders) {
            if (m.isStarter())
                counter += 1;
            if (counter >= m.max) {
                midfielder.setStarter(false);
                this.substitutes.add(midfielder);
                return;
            }
        }
        this.midfielders[counter] = midfielder;
    }

    public void addForwards(Forward forward) {
        int counter = 0;
        for (Forward f : this.forwards) {
            if (f.isStarter())
                counter += 1;
            if (counter >= f.max) {
                forward.setStarter(false);
                this.substitutes.add(forward);
                return;
            }
        }
        this.forwards[counter] = forward;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
