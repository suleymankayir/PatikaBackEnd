public class Course {

    Teacher teacher;
    String name;
    int note;
    String prefix;
    String code;
    int sozlu;
    double lessonAverage;

    Course(String name, String code, String prefix) {

        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Ogretmen ve ders bölümleri uyuşmuyor");
        }


    }

    void printTeacher() {
        this.teacher.print();
    }

}
