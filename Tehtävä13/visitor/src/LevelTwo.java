public class LevelTwo implements HumanState {

    @Override
    public void attack() {
        System.out.println("attack");
    }

    @Override
    public void defend() {
        System.out.println("defend");
    }

    @Override
    public void levelUp(Human human) {
        human.changeLevel(new LevelThree());
    }
}