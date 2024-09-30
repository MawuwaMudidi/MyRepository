//Create SoccerPlayer class
public class SoccerPlayer {
    //a. Create SoccerPlayers class which will have
    // name, age, team, scoredGoals.
    private String name;
    private int age;
    private String team;
    private int scoredGoals;

    //b. Create 3 Constructor (name, age, team, scoredGoals)
    // (name, age, scoredGoals) (name, age, team)

    public SoccerPlayer(String name, int age, String team, int scoredGoals){
        this.name = name;
        this.age = age;
        this.team = team;
        this.scoredGoals = scoredGoals;
    }
    public SoccerPlayer(String name, int age, int scoredGoals){
        this.name = name;
        this.age = age;
        this.team ="unknown";
        this.scoredGoals = scoredGoals;
    }
    public SoccerPlayer(String name, int age, String team){
        this.name = name;
        this.age = age;
        this.team = team;
        this.scoredGoals = 0;
    }
    //c. Create getter and setter for all variables.

    public String getName() {
        return name;
    }
    public void setName(String name) {this.name = name;}

    public int getAge() {
        return age;
    }
    public void setAge(int age) { this.age = age;}

    public String getTeam() {
        return team;
    }
    public void setTeam(String team) { this.team = team;}

    public int getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(int scoredGoals) { this.scoredGoals = scoredGoals;}

    //d. Override toString function
    @Override
    public String toString() {
        return "SoccerPlayer{" +
                "name='" + name +
                "', age=" + age +
                ", team='" + team +
                "', scoredGoals=" + scoredGoals +
                "}";
    }
    //e. Override equals function to compare scoredGoals and team (just two of them)
    @Override
    public boolean equals(Object player) {
        if (this == player) return true;
        if (!(player instanceof SoccerPlayer)) return false;
        SoccerPlayer best = (SoccerPlayer) player;
        return scoredGoals == best.scoredGoals && team.equals(best.team);
    }
}


