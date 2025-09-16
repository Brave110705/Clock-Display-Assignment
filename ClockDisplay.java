import java.util.Date;

public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;
    
    public ClockDisplay() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        Date now = new Date();
        int currentHour = now.getHours();
        int currentMinute = now.getMinutes();
        set_time(currentHour, currentMinute);
    }
    
    public void timeTick() {
        minutes.increment();
        if(minutes.get_value() == 0) {
            hours.increment();
        }
        
        updateDisplay();
    }
    
    public void set_time(int hour, int minute) {
        hours.set_value(hour);
        minutes.set_value(minute);
        updateDisplay();
    }
    
    public String get_time() {
        return displayString;
    }
    
    private void updateDisplay() {
        displayString = hours.get_display_value()+":"+minutes.get_display_value();
    }
}