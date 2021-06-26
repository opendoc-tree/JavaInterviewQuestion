import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int rollNo;
    String name;
    int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

// used to sort Student by age
class AgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student t1, Student t2) {
        // this by default create ascending order
        return t1.age-t2.age;

        // this by default create descending order
        //return t2.age-t1.age;
    }
}

// used to sort Student by name
class NameComparator implements Comparator<Student>{
    @Override
    public int compare(Student t1, Student t2) {
        // this by default create ascending order
        return t1.name.compareTo(t2.name);

        // this by default create descending order
        //return t2.name.compareTo(t1.name);
    }
}

public class comparator_example {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"Abc",22));
        list.add(new Student(2,"Xyz",20));
        list.add(new Student(3,"Loc",23));

        System.out.println("### Sort by Age ###");
        Collections.sort(list,new AgeComparator());
        list.forEach(System.out::println);

        System.out.println();
        System.out.println("=================================");
        System.out.println();

        System.out.println("### Sort (reverse order) by Age ###");
        Collections.sort(list,Collections.reverseOrder(new AgeComparator()));
        list.forEach(System.out::println);

        System.out.println();
        System.out.println("=================================");
        System.out.println();

        System.out.println("### Sort by Name ###");
        Collections.sort(list,new NameComparator());
        list.forEach(System.out::println);
    }
}
