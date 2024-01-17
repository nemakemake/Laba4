package src.enums;

import java.util.List;
import java.util.Random;

public enum Weather {
    SUNNY,
    WINDY,
    CLOUDY,
    RAINY;

    private static final List<Weather> VALUES =
            List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Weather randomWeather()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}

