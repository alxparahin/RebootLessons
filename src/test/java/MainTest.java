import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
        System.out.println("Before test");
    }

    @AfterEach
    void tearDown() {
        main = null;
        System.out.println("After test");
    }

    @Test
    void main() {
        //Main.main(new String[]{"asd1","arg2"});
        assertEquals(1, main.sP());
        //System.out.println(main+" "+main.sP());
    }
}