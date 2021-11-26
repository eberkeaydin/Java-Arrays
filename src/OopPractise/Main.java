package OopPractise;

public class Main {
    public static void main(String[] args){
        Department department1 = new Department("Database Management");
        department1.newFaculty("Computer Science");

        Faculty fac1 = new Faculty("CS", department1);

        System.out.println( " " + fac1.getDepartment());
    }
}
