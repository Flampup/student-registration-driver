import org.joda.time.DateTime;
public class Main {
    public static void main(String[] args) {
        //declare courses
        Course csit = new Course("Computer Science", new DateTime(2021, 9, 1, 9, 0), new DateTime(2022, 5, 10, 17, 0));
        Course arts = new Course("Arts", new DateTime(2021, 9, 1, 9, 0), new DateTime(2022, 5, 10, 17, 0));
        //declare modules
        Module spanish = new Module("Spanish", "AR121");
        Module maths = new Module("Maths", "MA101");
        Module programming = new Module("Programming", "CT101");
        //add modules to course
        arts.addModule(spanish);
        arts.addModule(maths);
        csit.addModule(maths);
        csit.addModule(programming);
        //declare students
        Student s1 = new Student("Alan", 20, "2001-01-18", "11111", csit);
        Student s2 = new Student("Ruth", 20, "2001-09-04", "11141", csit);
        Student s3 = new Student("Keith", 20, "2000-11-30", "12111", arts);
        //enroll students in course
        csit.addStudent(s1);
        csit.addStudent(s2);
        arts.addStudent(s3);
        //set module courses
        spanish.addCourse(arts);
        maths.addCourse(arts);
        maths.addCourse(csit);
        programming.addCourse(csit);

        //print all information
        System.out.println(csit);
        System.out.println(arts);
        System.out.println(spanish);
        System.out.println(maths);
        System.out.println(programming);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
