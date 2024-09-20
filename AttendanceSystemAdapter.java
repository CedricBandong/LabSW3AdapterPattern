public class AttendanceSystemAdapter {
    private AttendanceSystem attendanceSystem;

    public AttendanceSystemAdapter(AttendanceSystem attendanceSystem) {
        this.attendanceSystem = attendanceSystem;
    }

    public void integrateSystem() {
        attendanceSystem.markAttendance();
    }
}