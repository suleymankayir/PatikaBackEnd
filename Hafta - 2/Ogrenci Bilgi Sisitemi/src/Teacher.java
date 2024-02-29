import java.sql.SQLOutput;

public class Teacher {

    String name;
    String mbno;
    String branch;



    Teacher(String name, String mbno, String branch){
        this.name = name;
        this.mbno = mbno;
        this.branch = branch;
    }

    void print(){
        System.out.println("Name: " + this.name);
        System.out.println("Mobile phone number: " + this.mbno);
        System.out.println("Branch: " + this.branch);

    }


}
