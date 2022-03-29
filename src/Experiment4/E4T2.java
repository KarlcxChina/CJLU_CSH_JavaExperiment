package Experiment4;

import java.util.Scanner;

public class E4T2
{
    public static void main(String[] args)
    {
        new CourseTest();
    }
}
class Course
{
    private String courseNumber = "";
    private String courseTitle = "";
    private double credits = 0;
    private double courseHours = 0;
    Course(){};
    Course(String courseNumber,String courseTitle,double credits)
    {
        this.courseNumber = courseNumber;
        this.courseTitle = courseTitle;
        this.credits = credits;
        setCourseHours();
    }
    public void setCourseNumber(String courseNumber)
    {
        this.courseNumber = courseNumber;
    }
    public String getCourseNumber()
    {
        return courseNumber;
    }
    public void setCourseTitle(String courseTitle)
    {
        this.courseTitle = courseTitle;
    }
    public String getCourseTitle()
    {
        return courseTitle;
    }
    public void setCredits(double credits)
    {
        this.credits = credits;
        setCourseHours();
    }
    public double getCredits()
    {
        return credits;
    }
    private void setCourseHours()
    {
        courseHours = credits*16;
    }
    public double getCourseHours()
    {
        return courseHours;
    }
}
class CourseTest
{
    CourseTest()
    {
        System.out.println("input course information (course number, course name, and credits):");
        Scanner in = new Scanner(System.in);
        Course course1 = new Course(in.next(),in.next(),in.nextDouble());
        Course course2 = new Course();
        course2.setCourseNumber("KC1235");
        course2.setCourseTitle("Programming in C");
        course2.setCredits(4.5);
        System.out.println("input course information (course number, course name, credits, and course hours):");
        System.out.println(course1.getCourseNumber()+", "+course1.getCourseTitle()+", "
                +course1.getCredits()+", "+course1.getCourseHours());
        System.out.println(course2.getCourseNumber()+", "+course2.getCourseTitle()+", "
                +course2.getCredits()+", "+course2.getCourseHours());
    }
}