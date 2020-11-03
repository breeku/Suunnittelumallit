import java.util.Observer;

public class App {
    public static void main(String[] args) throws Exception {
        ClockTimer timer = new ClockTimer();
        EventSource eventSource = new EventSource(timer);
        DigitalClock clock = new DigitalClock();
        eventSource.addObserver(clock);
        eventSource.startClock();
	}
}
