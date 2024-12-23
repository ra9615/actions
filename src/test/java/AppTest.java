import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private App app = new App();

    @Test
    public void sum() {
        int result = app.sum(2, 3);

        assertEquals(5, result);
    }

    @Test
    public void minus() {
        int result = app.minus(5, 4);

        assertEquals(1, result);
    }

    @Test
    public void multi() {
        int result = app.multi(2, 3);

        assertEquals(6, result);
    }

}