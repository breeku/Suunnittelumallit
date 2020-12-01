public class Clock {
    private Pointer seconds;
    private Pointer minutes;
    private Pointer hours;

    public Clock(Pointer seconds, Pointer minutes, Pointer hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public void tick() {
        if (this.seconds.getTime() == 60) {
            this.seconds.reset();
            if (this.minutes.getTime() == 60) {
                this.minutes.reset();
                this.hours.tick();
            }
            this.minutes.tick();
        }
        this.seconds.tick();
    }

    public Clock copy() {
        Clock clock = new Clock(this.seconds, this.minutes, this.hours);
        return clock;
    }

    public String toString() {
        return seconds.getTime() + "seconds " + minutes.getTime() + "minutes " + hours.getTime() + "hours";
    }
}
