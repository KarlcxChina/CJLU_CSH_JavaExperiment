package Experiment8;
//E8T3
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
                return "学号：" + id + ", 姓名=" + name + ", 年龄：" + age ;
            }
    }

public class CollectionsTest
    {
        public CollectionsTest()
            {
                HashMap<String, Student> hMap = new HashMap<String, Student>();
                hMap.put("17H001", new Student("17H001", "唐僧", 40));
                hMap.put("17H002", new Student("17H002", "孙悟空", 2000));
                hMap.put("17H003", new Student("17H003", "猪八戒", 1000));
                hMap.put("17H004", new Student("17H004", "沙僧", 900));
                System.out.println("学号17H003学生信息:");
                System.out.println(hMap.get("17H003"));
                System.out.println();
                System.out.println("所有学生信息:");
                for (String key : hMap.keySet())
                    {
                        System.out.println(hMap.get(key));
                    }
                System.out.println();
                hMap.remove("17H001");
                System.out.println("移除唐僧后所有学生信息:");
                for (String key : hMap.keySet())
                    {
                        System.out.println(hMap.get(key));
                    }
                System.out.println();
                System.out.println("把HashMap变成数组后，所有学生信息:");
                Student[] stuarr = new Student[hMap.size()];
                int count = 0;
                for (String key : hMap.keySet())
                    {
                        stuarr[count] = hMap.get(key);
                        count++;
                    }
                for (Student i : stuarr)
                {
                    System.out.println(i);
                }
            }

        public static void main(String[] args)
            {
                new CollectionsTest();
            }
    }
