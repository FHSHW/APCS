class Person {
    String firstName;
    String lastName;

    Person(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    public String toString() {
        return this.lastName + ", " + this.firstName + "\n";
    }
}

