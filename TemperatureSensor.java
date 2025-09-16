import java.util.Random;

public class TemperatureSensor {
private Random random = new Random();
 
public double getTemperature() {

return 20 + (10 * random.nextDouble());
}
}