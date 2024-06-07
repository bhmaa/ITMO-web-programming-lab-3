import beans.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    private Point point;

    @BeforeEach
    void setUp() {
        point = new Point();
    }

    @Test
    void checkPointInsideFirstRegion() {
        point.setX(-1);
        point.setY(1);
        point.setR(2);
        point.check();
        assertTrue(point.isHit());
    }

    @Test
    void checkPointInsideSecondRegion() {
        point.setX(-1);
        point.setY(-1);
        point.setR(2);
        point.check();
        assertFalse(point.isHit());
    }

    @Test
    void checkPointInsideThirdRegion() {
        point.setX(1);
        point.setY(1);
        point.setR(2);
        point.check();
        assertFalse(point.isHit());
    }

    @Test
    void checkPointOutsideAllRegions() {
        point.setX(3);
        point.setY(3);
        point.setR(2);
        point.check();
        assertFalse(point.isHit());
    }
}
