import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DegreeClassifierTest {
    private final DegreeClassifier classifier = new DegreeClassifier();
    
    //Test First Class Honours
    @Test
    public void testFirstClass() {
        assertEquals("First-Class", classifier.classify(70.0));  // Lower boundary
        assertEquals("First-Class", classifier.classify(85.0));  // Middle value
        assertEquals("First-Class", classifier.classify(100.0)); // Upper boundary
    }
    
    //Test Upper Second-Class Honours (2:1)
    @Test
    public void testUpperSecondClass() {
        assertEquals("Upper Second-Class (2:1)", classifier.classify(60.0));  // Lower boundary
        assertEquals("Upper Second-Class (2:1)", classifier.classify(65.0));  // Middle value
        assertEquals("Upper Second-Class (2:1)", classifier.classify(69.9));  // Upper boundary
    }
    
    //Test Lower Second-Class Honours (2:2)
    @Test
    public void testLowerSecondClass() {
        assertEquals("Lower Second-Class (2:2)", classifier.classify(50.0));  // Lower boundary
        assertEquals("Lower Second-Class (2:2)", classifier.classify(55.0));  // Middle value
        assertEquals("Lower Second-Class (2:2)", classifier.classify(59.9));  // Upper boundary
    }
    
    //Test Third-Class Honours
    @Test
    public void testThirdClass() {
        assertEquals("Third-Class", classifier.classify(40.0));  // Lower boundary
        assertEquals("Third-Class", classifier.classify(45.0));  // Middle value
        assertEquals("Third-Class", classifier.classify(49.9));  // Upper boundary
    }
    
    //Test No Honours
    @Test
    public void testNoHonours() {
        assertEquals("No Honours", classifier.classify(0.0));    // Extreme value
        assertEquals("No Honours", classifier.classify(30.0));   // Middle value
        assertEquals("No Honours", classifier.classify(39.9));   // Upper boundary
    }
}