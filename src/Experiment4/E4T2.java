package Experiment4;

public class E4T2
{
    public static void main(String[] args)
    {

    }
    static class Course
    {
        String courseNumber = "";
        String courseTitle = "";
        double credits = 0;
        Course(){};
        Course(String courseNumber,String courseTitle,double credits)
        {
            this.courseNumber = courseNumber;
            this.courseTitle = courseTitle;
            this.credits = credits;
        }
        public void setCourseNumber(String courseNumber)
        {
            this.courseNumber = courseNumber;
        }
        public String getCourseNumber()
        {
            return courseNumber;
        }
    }
}
