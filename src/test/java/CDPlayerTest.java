import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {
    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer(5);
    }

    @Test
    public void hasVolume(){
        assertEquals(0, cdPlayer.getVolume());
    }

    @Test
    public void hasModel(){
        assertEquals("Panasonic", cdPlayer.setModel("Panasonic"));
    }

    @Test
    public void hasNumOfCDs(){
        assertEquals(5, cdPlayer.getNumOfCDs());
    }


}
