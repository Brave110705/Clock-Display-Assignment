public class NumberDisplay {
    private int limit;
    private int value;
    
    public NumberDisplay(int max) {
        limit = max;
        value =  0;
    }
    
    public int get_value() {
        return value;
    }
    
    public String get_display_value() {
        if (value < 10) {
            return "0"+value;
        }
        else {
            return ""+value;   
        }
    }
    public void set_value(int temp) {
        if ((temp >= 0) && (temp < limit)) {
            value = temp;
        }
    }
    public void increment() {
        value = (value+1)%limit;
    }
}
