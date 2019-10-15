import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {
    Radio radio;

    @Before
    public void before(){
        radio = new Radio(50);
    }

    @Test
    public void hasVolume(){
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void hasModel(){
        assertEquals("Sony", radio.setModel("Sony"));
    }

    @Test
    public void hasNumOfStations(){
        assertEquals(50, radio.getNumOfStations());
    }
}
