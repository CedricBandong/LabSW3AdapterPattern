public class GradingSystemAdapter {

    private GradingSystem gradingSystem;

    public GradingSystemAdapter(GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }

    public void integrateSystem() {
        gradingSystem.recordGrades();
    }
}