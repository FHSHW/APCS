class Teacher extends Person {
    String subject;

    Teacher(String fName, String lName, String subject) {
        super(fName, lName);
        this.subject = subject;
    }

    public String toString() {
        return super.toString() + "\n   Subject: " + this.subject + "\n";
    }
}

