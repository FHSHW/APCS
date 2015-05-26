class School {
    ArrayList<Student> students;
    ArrayList<Teacher> teachers;

    School(ArrayList<Student> students, ArrayList<Teacher> teachers) {
        this.students = students;
        this.teachers = teachers;
    }

    public String getGradeLevel(int level) {
        StringBuilder sb = new StringBuilder();
        for (Student s : this.students) {
            String st = s.toString();
            if (st.contains("Grade Level: " + level)) sb.append(st);
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Faculty:\n");
        for (Teacher t : this.teachers)
            sb.append(t.toString());

        sb.append("\nStudent Body:\n");

        for (Student s : this.students)
            sb.append(s.toString());

        return sb.toString();
    }
}

