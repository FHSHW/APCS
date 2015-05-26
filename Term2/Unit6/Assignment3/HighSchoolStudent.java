class HighSchoolStudent extends Student {
    double gpa;

    HighSchoolStudent(String fName, String lName, int gLevel, double gpa) {
        super(fName, lName, gLevel);
        this.gpa = (gpa >= 0.0 && gpa <= 5.0) ? gpa : 0;
    }

    public String toString() {
        return super.toString() + "\n   GPA: " + gpa + "\n";
    }
}

