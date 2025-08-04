import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAnnotations {
    @BeforeAll
    static void beforeAll(){
        System.out.println("beforeAll()");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("    beforeEach()");
    }
    @Test
    void firstTest(){
        System.out.println("        firstTest()");
    }
    @Test
    void secondTest(){
        System.out.println("        secondTest()");
    }
}
