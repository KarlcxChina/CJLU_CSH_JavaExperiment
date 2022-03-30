package Experiment4;
//E4T3
public class Student
{
    private String stuNumber;
    private String stuName;
    private int stuAge;
    private static int totalNum = 0;
    Student()
    {
        totalNum+=1;
    }
    Student(String stuNumber,String stuName,int stuAge)
    {
        totalNum+=1;
        this.stuAge = stuAge;
        this.stuName = stuName;
        this.stuNumber = stuNumber;
    }
    static int getTotalNum()
    {
        return totalNum;
    }
    static void setTotalNum(int totalNum)
    {
        Student.totalNum = totalNum;
    }
    public int getStuAge()
    {
        return this.stuAge;
    }
    public void setStuAge(int stuAge)
    {
        this.stuAge = stuAge;
    }
    public String getStuName()
    {
        return stuName;
    }
    public void setStuName(String stuName)
    {
        this.stuName = stuName;
    }
    public String getStuNumber()
    {
        return stuNumber;
    }
    public void setStuNumber(String stuNumber)
    {
        this.stuNumber = stuNumber;
    }
    public void outputStuInf()
    {
        System.out.println(this.getStuNumber()+", "+ this.getStuName()+", "+this.getStuAge() + ", total="+Student.getTotalNum());
    }
    public static void changeValue(int age)
    {
        age = 111;
    }
    public static void changeValue(Student s)
    {
        s.stuAge = 222;
    }
    public static void main(String[] args)
    {
        Student st1 = new Student("s001","孙悟空",500);
        st1.outputStuInf();
        Student st2 = new Student("s002","唐僧",50);
        st2.outputStuInf();
        Student.setTotalNum(35);
        st1.outputStuInf();
        st2.outputStuInf();
        Student st3 = new Student();
        st3.setStuNumber("s003");
        st3.setStuName("tom");
        st3.setStuAge(19);
        st3.outputStuInf();
        int newAge = 20;
        changeValue(newAge);
        System.out.println("newAge:"+newAge);
        changeValue(st2);
        System.out.println("age of st2: "+st2.getStuAge());
    }
}
