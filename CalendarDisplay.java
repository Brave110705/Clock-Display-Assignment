import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarDisplay {
    public String getDate() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd MMMM yyyy");
    return dateFormat.format(new Date());
    }
}