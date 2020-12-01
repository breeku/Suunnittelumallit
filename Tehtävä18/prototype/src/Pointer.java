public class Pointer {
    private Integer time;

    public Pointer() {
        this.time = 0;
    }

    public Integer getTime() {
        return this.time;
    }

    public void tick() {
        this.time += 1;
    }

    public void reset() {
        this.time = 0;
    }
}
