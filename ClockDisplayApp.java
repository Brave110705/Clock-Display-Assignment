import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class ClockDisplayApp {
    public static void main(String[] args) throws InterruptedException {
    ClockDisplay clock = new ClockDisplay();
    CalendarDisplay calendarDisplay = new CalendarDisplay();
    TemperatureSensor sensor = new TemperatureSensor();
     
    while (true) {
        clock.timeTick();
    
        System.out.println("=================================");
        System.out.println("CLOCK DISPLAY APP");
        System.out.println("Waktu : " + clock.get_time());
        System.out.println("Tanggal : " + calendarDisplay.getDate());
        System.out.printf("Suhu : %.2f °C%n", sensor.getTemperature());
        System.out.println("=================================\n");
    
        Thread.sleep(1000);
    }
    
}
}