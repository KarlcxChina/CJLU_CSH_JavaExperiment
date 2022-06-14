package Experiment8;

import java.util.HashMap;

class Student
    {
        private String id;
        private String name;
        private int age;

        public Student(String id, String name, int age)
            {
                this.id = id;
                this.name = name;
                this.age = age;
            }

        public Student()
            {
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public String getName()
            {
                return name;
            }

        public void setAge(int age)
            {
                this.age = age;
            }

        public int getAge()
            {
                return age;
            }

        public void setId(String id)
            {
                this.id = id;
            }

        public String getId()
            {
                return id;
            }

        @Override
        public String toString()
            {
                return "Student{" +
                        "id='" + id + '\'' +
                        ", name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
    }

public class CollectionsTest
    {
        public CollectionsTest()
            {
                HashMap<String,Student> hMap = new HashMap<String,Student>();
                Student stu=new Student("17H001","唐僧",40);
                hMap.put("ts",stu);
                stu.setId("17H002");
                stu.setName("孙悟空");
                stu.setAge(2000);
                hMap.put("swk",stu);
                stu.setId("17H003");
                stu.setName("猪八戒");
                stu.setAge(1000);
                hMap.put("zbj",stu);
                stu.setId("17H003");
                stu.setName("沙僧");
                stu.setAge(900);
                hMap.put("ss",stu);
            }
    }
