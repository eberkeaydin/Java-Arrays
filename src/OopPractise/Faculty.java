package OopPractise;

public class Faculty {
    private Department dept;
    private String name;


    public Faculty(String n, Department d){
        name = n;
        dept = d;
    }

    public Department getDepartment(){
        return dept;
    }

}
