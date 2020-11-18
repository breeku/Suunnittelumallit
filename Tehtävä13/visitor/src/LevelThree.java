public class LevelThree implements HumanState {
    private static LevelThree instance;

    public static HumanState getInstance() {
        return instance != null ? instance : new LevelThree();
    }

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
        System.out.println("Already maxed out!");
    }
}
