public class Main {
    public static void main(String[] args) {
        // Aggregation example
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Course course = new Course("Physics");

        course.addStudent(s1);
        course.addStudent(s2);
        course.displayStudents();

        course.removeStudent(s1);
        course.displayStudents();

        // Composition example
        Library library = new Library();
        library.addBook("1984");
        library.addBook("Brave New World");
        library.displayBooks();

        library.removeBook("1984");
        library.displayBooks();
    }
}
