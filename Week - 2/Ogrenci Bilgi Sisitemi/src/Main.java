public class Main {
    public static void main(String[] args) {


        Teacher t1 = new Teacher("Mahmut", "555", "TRH");
        Teacher t2 = new Teacher("Ayse", "333", "FZK");
        Teacher t3 = new Teacher("Hasan", "234", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyo", "103", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Suleyman", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(60, 61, 62);
        s1.addSozluNotu(60, 61, 62);
        s1.calcAverage();
        s1.printLessonAverage();


        



    }
}