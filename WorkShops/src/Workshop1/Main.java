package Workshop1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CourseMethods courseMethods = new CourseMethods();
        Student student1 = new Student();
        student1.setId(1);
        student1.setFirstName("Göksel");
        student1.setLastName("Doğan");
        student1.setDescription("Çok azimli bir öğrenci");

        Student student2 = new Student();
        student2.setId(2);
        student2.setFirstName("Görkem");
        student2.setLastName("Doğan");
        student2.setDescription("Çok çalışkan bir öğrenci");
        StudentMethods studentMethods = new StudentMethods();
        studentMethods.addStudent(student1);
        studentMethods.addStudent(student2);
        studentMethods.getStudents();

        Course course1 = new Course();
        course1.setId(1);
        course1.setCourseName("Java Programlama");
        course1.setDescription("java SE ve EE içerir");
        course1.setPictureUrl("deneme.jpg");
        course1.setStudent(student1);

        Course course2 = new Course();
        course2.setId(2);
        course2.setCourseName("C++ Programlama");
        course2.setDescription("C dilini OOP dahil olarak içerir");
        course2.setPictureUrl("arjuvak.jpg");
        course2.setStudent(student2);

        courseMethods.addCourse(course1);
        courseMethods.addCourse(course2);
        courseMethods.getCourses();




        Instructor instructor1 = new Instructor();
        instructor1.setId(1);
        instructor1.setFirstName("Mert");
        instructor1.setLastName("Yılmaz");
        instructor1.setDescription("Çok iyi bir hoca");
        instructor1.setCourse(course1);

        Instructor instructor2 = new Instructor();
        instructor2.setId(2);
        instructor2.setFirstName("Mert");
        instructor2.setLastName("Aktaş");
        instructor2.setDescription("Çok iyi bir hoca");
        instructor2.setCourse(course2);

        InstructorMethods instructorMethods = new InstructorMethods();
        instructorMethods.addInstructor(instructor1);
        instructorMethods.addInstructor(instructor2);
        instructorMethods.getInstructors();

        Category category1 = new Category();
        category1.setId(1);
        category1.setCategoryName("Programlama");
        category1.setDescription("Kod yazdığımız bir alan");

        CategoryMethods categoryMethods = new CategoryMethods();
        categoryMethods.addCategory(category1);
        categoryMethods.getCategories();
    }
}

class Instructor {
    public Instructor() {
    }

    public Instructor(int id, String firstName, String lastName, String description, Course course) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
        this.course = course;
    }

    private int id;
    private String firstName;
    private String lastName;
    private String description;
    private Course course;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDescription() {
        return description;
    }

    public Course getCourse() {
        return course;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}

class InstructorMethods {
    List<Instructor> instructors = new ArrayList<Instructor>();

    public void getInstructors() {
        for (Instructor item : instructors) {
            System.out.println(item.getId() + " / " + item.getFirstName() + " " + item.getLastName());
        }
    }

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }
}

class Category {
    public Category() {

    }

    public Category(int id, String categoryName, String description) {
        this.id = id;
        this.categoryName = categoryName;
        this.description = description;
    }

    private int id;
    private String categoryName;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

class CategoryMethods {
    List<Category> categories = new ArrayList<Category>();

    public void getCategories() {
        for (Category item : categories) {
            System.out.println(item.getId() + " / " + item.getCategoryName());
        }
    }

    public void addCategory(Category category) {

        categories.add(category);
    }
}

class Course {
    public Course() {
    }

    public Course(int id, String courseName, String pictureUrl, String description, Category category, Student student) {
        this.id = id;
        this.courseName = courseName;
        this.pictureUrl = pictureUrl;
        this.description = description;
        this.category = category;
        this.student = student;
    }

    private int id;
    private String courseName;
    private String pictureUrl;
    private String description;
    private Category category;
    private Student student;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}

class CourseMethods {
    List<Course> courses = new ArrayList<Course>();

    public void getCourses() {
        for (Course item : courses) {
            System.out.println(item.getId() + " / " + item.getCourseName()+" / "+item.getStudent().getFirstName());
        }
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}

class Student {
    public Student() {
    }

    public Student(int id, String firstName, String lastName, String description, Course course) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }

    private int id;
    private String firstName;
    private String lastName;
    private String description;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

class StudentMethods {
    List<Student> students = new ArrayList<Student>();

    public void getStudents() {
        for (Student item : students) {
            System.out.println(item.getId() + " / " + item.getFirstName() + " / " + item.getLastName());
        }
    }

    public void addStudent(Student student) {
        students.add(student);
//        Student student1 = new Student();
//        student1.setId(student.getId());
//        student1.setFirstName(student.getFirstName());
//        student1.setLastName(student.getLastName());
//        student1.setCourse(student.getCourse());
//        student1.setDescription(student.getDescription());

    }
}

