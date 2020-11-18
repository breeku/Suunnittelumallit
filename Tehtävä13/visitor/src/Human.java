public class Human {
    private HumanState human;
    private double experience;
    private Visitor visitor;

    public Human() {
        this.experience = 0;
        this.human = new LevelOne();
        this.visitor = new HumanVisitor();
    }

    public void changeLevel(HumanState human) {
        this.human = human;
    }

    public void attack() {
        human.attack();
        this.experience += 25;
        visitor.Visit(this);
    }

    public void defend() {
        human.defend();
        this.experience += 45;
        visitor.Visit(this);
    }

    public void levelUp() {
        human.levelUp(this);
    }

    public double getExperience() {
        return experience;
    }

    public HumanState getState() {
        return human;
    }
}
