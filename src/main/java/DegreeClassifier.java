public class DegreeClassifier {
    
    /**
     * Calculate degree classification based on weighted average marks
     * @param marks Student's weighted average marks
     * @return Corresponding degree classification
     */
    public String classify(double marks) {
        if (marks >= 70) {
            return "First-Class";
        } else if (marks >= 60) {
            return "Upper Second-Class (2:1)";
        } else if (marks >= 50) {
            return "Lower Second-Class (2:2)";
        } else if (marks >= 40) {
            return "Third-Class";
        } else {
            return "No Honours";
        }
    }
}