import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("Test started");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("Test finished");
    }

    @org.junit.jupiter.api.Test
    void main() {
        Main.main(new String[]{"asd","ewq"});
        assertEquals(1,1);
    }
}