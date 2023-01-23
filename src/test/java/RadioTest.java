import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void stationMaxBoundaries() {
        Radio service = new Radio();

        service.setRadioStationNumber(9);
        service.next();
        service.getRadioStationNumber();

        int expectedStation = 0;
        int actualStation = service.getRadioStationNumber();

        Assertions.assertEquals(expectedStation, actualStation);

    }

    @Test
    public void stationMinBoundaries() {
        Radio service = new Radio();

        service.setRadioStationNumber(0);
        service.prev();
        service.getRadioStationNumber();

        int expectedStation = 9;
        int actualStation = service.getRadioStationNumber();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void nearestMinStationBoundary() {
        Radio service = new Radio();

        service.setRadioStationNumber(1);
        service.prev();
        service.getRadioStationNumber();

        int expectedStation = 0;
        int actualStation = service.getRadioStationNumber();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void nearestMaxStationBoundary() {
        Radio service = new Radio();

        service.setRadioStationNumber(8);
        service.next();
        service.getRadioStationNumber();

        int expectedStation = 9;
        int actualStation = service.getRadioStationNumber();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void maxSoundLimits() {
        Radio service = new Radio();

        for (int i = 0; i <= 10; i = i + 1) {
            service.increaseVolume();
        }
        service.getVolume();

        int expectedVolume = 10;
        int actualVolume = service.getVolume();
    }

    @Test
    public void minSounLimits() {
        Radio service = new Radio();

        service.decreaseVolum();
        service.getVolume();

        int expectedVolume = 0;
        int actualVolume = service.getVolume();
    }

    @Test
    public void nearestMaxSoundBoundaries() {
        Radio service = new Radio();

        for (int i = 0; i <= 9; i = i + 1) {
            service.increaseVolume();
        }
        service.getVolume();

        int expectedVolume = 9;
        int actualVolume = service.getVolume();
    }

    @Test
    public void nearestMinSoundBoundaries() {
        Radio service = new Radio();

        for (int i = 0; i <= 2; i = i + 1) {
            service.increaseVolume();
        }
        service.decreaseVolum();
        service.getVolume();

        int expectedVolume = 1;
        int actualVolume = service.getVolume();
    }
}
