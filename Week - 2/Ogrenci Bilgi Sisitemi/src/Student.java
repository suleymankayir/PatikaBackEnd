public class Student {

    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;
    double average;

    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.isPass = false;
        this.average = 0.0;

    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }

        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }

    }

    void addSozluNotu(int sozlu1, int sozlu2, int sozlu3) {
        if (c1.name.equals("Tarih")) {
            this.c1.sozlu = sozlu1;
        }

        if (c2.code.equals("102")) {
            this.c2.sozlu = sozlu2;
        }

        if (c3.code.equals("103")) {
            this.c3.sozlu = sozlu3;
        }
    }

    void calcAverage() {

        c1.lessonAverage = (this.c1.sozlu * 0.40) + (this.c1.note * 0.60);
        c2.lessonAverage = (this.c2.sozlu * 0.30) + (this.c2.note * 0.70);
        c3.lessonAverage = (this.c3.sozlu * 0.20) + (this.c3.note * 0.80);
    }

    void printLessonAverage() {
        System.out.println(c1.name + " ders ort : " + this.c1.lessonAverage);
        System.out.println(c2.name + " ders ort : " + this.c2.lessonAverage);
        System.out.println(c3.name + " ders ort : " + this.c3.lessonAverage);
    }

    void printNote() {
        System.out.println(c1.name + " Notu: " + c1.note);
        System.out.println(c2.name + " Notu: " + c2.note);
        System.out.println(c3.name + " Notu: " + c3.note);
    }

    void isPass() {
        this.average = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if (this.average > 55) {
            System.out.println("Sınıfı basari ile gectiniz.");
            this.isPass = true;
        } else {
            System.out.println("Basarisiz oldunuz.");
            this.isPass = false;
        }

    }


}
