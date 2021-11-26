package OopPractise;

public class Department {
    private String name;
    private Faculty facultyList[] = new Faculty[100];
    private int numOfFaculty = 0;

    public Department(String n){
        name = n;
    }

    public void newFaculty(String name){
        facultyList[numOfFaculty++] = new Faculty(name, this);
    }
}
