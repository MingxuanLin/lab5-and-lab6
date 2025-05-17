import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DegreeClassifierTest {
    private final DegreeClassifier classifier = new DegreeClassifier();
    
    //Test First Class Honours here
    @Test
    public void testFirstClass() {
        assertEquals("First-Class", classifier.classify(70.00));  // Lower boundary
        assertEquals("First-Class", classifier.classify(85.00));  // Middle value
        assertEquals("First-Class", classifier.classify(100.00)); // Upper boundary
    }
    
    //Test Upper Second-Class Honours (2:1)
    @Test
    public void testUpperSecondClass() {
        assertEquals("Upper Second-Class (2:1)", classifier.classify(60.00));  // Lower boundary
        assertEquals("Upper Second-Class (2:1)", classifier.classify(65.00));  // Middle value
        assertEquals("Upper Second-Class (2:1)", classifier.classify(69.99));  // Upper boundary
    }
    
    //Test Lower Second-Class Honours (2:2)
    @Test
    public void testLowerSecondClass() {
        assertEquals("Lower Second-Class (2:2)", classifier.classify(50.00));  // Lower boundary
        assertEquals("Lower Second-Class (2:2)", classifier.classify(55.00));  // Middle value
        assertEquals("Lower Second-Class (2:2)", classifier.classify(59.99));  // Upper boundary
    }
    
    //Test Third-Class Honours
    @Test
    public void testThirdClass() {
        assertEquals("Third-Class", classifier.classify(40.00));  // Lower boundary
        assertEquals("Third-Class", classifier.classify(45.00));  // Middle value
        assertEquals("Third-Class", classifier.classify(49.99));  // Upper boundary
    }
    
    //Test No Honours
    @Test
    public void testNoHonours() {
        assertEquals("No Honours", classifier.classify(0.00));    // Extreme value
        assertEquals("No Honours", classifier.classify(30.00));   // Middle value
        assertEquals("No Honours", classifier.classify(39.99));   // Upper boundary
    }
}

// try to use github.