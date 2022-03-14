import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;

    @Before
    public void before(){
        bear = new Bear("Kuma", 27, 95.62);
    }

    @Test
    public void hasName(){
        assertEquals("Kuma", bear.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(27, bear.getAge());
    }

    @Test
    public void hasWeight(){
        assertEquals(95.62, bear.getWeight(), 0.0);
    }

    @Test
    public void readyToHibernateIfChonky(){
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void notReadToHibernateIfSmol(){
        Bear thinBear = new Bear("Yogi", 16, 59.45);
        assertEquals(false, thinBear.readyToHibernate());
    }
}
