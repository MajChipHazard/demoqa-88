import org.junit.jupiter.api.*;

public class AfterAnnotations {

        @AfterAll
        static void afterAll(){
            System.out.println("afterAll()");
        }
        @AfterEach
        void afterEach(){
            System.out.println("    afterEach()");
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
