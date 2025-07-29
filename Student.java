class Student {
    String name;
    int rollNo;
    double marks;

    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "John";
        s.rollNo = 101;
        s.marks = 89.5;
        s.display();
}
}