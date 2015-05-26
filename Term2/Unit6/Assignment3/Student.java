class Student extends Person {
    static int students = 1;
    int studentId;
    int level;

    Student(String fName, String lName, int gLevel) {
        super(fName, lName);
        this.level = (gLevel >= 0 && gLevel <= 12) ? gLevel : 0;
        this.studentId = students++;
    }

    public int getLevel() {
        return this.level;
    }

    public String toString() {
        return super.toString() + "\n   Grade Level: " + this.level + "\n   ID #: " + this.studentId + "\n";
    }
}

