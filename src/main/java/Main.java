import com.ekuore.ekuoreprofortelemedicine.Engine;
import com.ekuore.ekuoreprofortelemedicine.SecurityType;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Engine engine = Engine.getInstance();
        engine.configureConnection(SecurityType.OPEN, "ssid", "password", 1, 1);
    }
}