package Experiment8;
//E8T1
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class ArrayListTest
    {
        public ArrayListTest()
            {
                ArrayList<String> list = new ArrayList<String>();
                list.add("James");
                list.add("Tom");
                list.add("Steven");
                list.add("Alice");
                list.add("Bob");
                list.add("Eve");
                list.add("Marry");
                list.add("Jerry");
                for (int count = 0; count < list.size(); count++)
                    {
                        System.out.print(list.get(count) + "  ");
                    }
                System.out.println();
                int pos=0;
                for (int count = 0; count < list.size(); count++)
                    {
                        System.out.print(list.get(count) + "  ");
                        if (Objects.equals(list.get(count), "Tom"))
                            {
                                pos = count;
                            }
                    }
                list.remove(pos);
                System.out.println();
                Collections.sort(list);
                for (String i : list)
                    {
                        System.out.print(i + "  ");
                    }
            }
        public static void main(String[] args)
            {
                new ArrayListTest();
            }
    }
