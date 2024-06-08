import beans.Point;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PointTest {

    private Point point;

    @Before
    public void setUp() {
        point = new Point();
    }

    @Test
    public void checkPointInsideFirstRegion() {
        point.setX(-1);
        point.setY(1);
        point.setR(2);
        point.check();
        assertTrue(point.isHit());
    }

    @Test
    public void checkPointOutsideFirstRegion() {
        point.setX(-3);
        point.setY(1);
        point.setR(2);
        point.check();
        assertFalse(point.isHit());
    }

    @Test
    public void checkPointOnBoundary() {
        point.setX(-2);
        point.setY(1);
        point.setR(2);
        point.check();
        assertTrue(point.isHit());
    }

    @Test
    public void checkPointInsideSecondRegion() {
        point.setX(-0.5);
        point.setY(-0.1);
        point.setR(2);
        point.check();
        assertTrue(point.isHit());
    }

    @Test
    public void checkPointOutsideSecondRegion() {
        point.setX(-1);
        point.setY(-1);
        point.setR(2);
        point.check();
        assertFalse(point.isHit());
    }

    @Test
    public void checkPointInsideThirdRegion() {
        point.setX(0.5);
        point.setY(0.5);
        point.setR(2);
        point.check();
        assertTrue(point.isHit());
    }

    @Test
    public void checkPointOutsideThirdRegion() {
        point.setX(1);
        point.setY(1);
        point.setR(2);
        point.check();
        assertFalse(point.isHit());
    }

    @Test
    public void checkPointOutsideAllRegions() {
        point.setX(-3);
        point.setY(3);
        point.setR(2);
        point.check();
        assertFalse(point.isHit());
    }
}
