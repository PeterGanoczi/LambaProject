package sk.itsovy.ganoczi.lamba;

public class Student {

    interface randomStudent{
        String activity(String name);
    }

    public String makeStudent(String name, randomStudent rnd){
        return rnd.activity(name);
    }
}
