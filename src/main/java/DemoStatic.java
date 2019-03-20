public class DemoStatic {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.showData();
        Student s2 = new Student();
        s2.showData();

    }
}

class Student {
    int a;
    static int b;

    Student() {
        b++;
    }

    public void showData() {
        System.out.println("Value of a= " + a);
        System.out.println("Value of b= " + b);
    }
}

