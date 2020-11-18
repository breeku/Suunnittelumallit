public class HumanVisitor implements Visitor {

    @Override
    public void Visit(Human human) {
        HumanState state = human.getState();
        if (state instanceof LevelOne) {
            if (human.getExperience() > 25) {
                human.levelUp();
                System.out.println("level up");
            }
        } else if (state instanceof LevelTwo) {
            if (human.getExperience() > 50) {
                human.levelUp();
                System.out.println("level up");
            }
        } else if (state instanceof LevelThree) {
            if (human.getExperience() > 100) {
                human.levelUp();
                System.out.println("level up");
            }
        }
    }
}
