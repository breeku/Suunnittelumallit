import java.util.Observable;

public class EventSource extends Observable {
	ClockTimer timer = new ClockTimer();
	
	public EventSource(ClockTimer timer) {
		this.timer = timer;
	}
	
    public void startClock() {
        while (true) {
        	this.timer.tick();
            setChanged();
            notifyObservers(timer.getHour() + ":" + timer.getMinute() + ":" + timer.getSecond());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error Occurred.");
            }
        }
    }
}