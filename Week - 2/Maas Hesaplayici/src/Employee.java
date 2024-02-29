public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double paidTax;
    int currentYear = 2021;
    double bonus;
    double raise;
    int legalWorkHour=40;
    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    // to calculate tax
    void calculateTax() {
        if (this.salary > 0 && this.salary < 1000.0) {
            paidTax = 0;
        } else if (this.salary >= 1000.0) {
            paidTax = (this.salary * 0.03);
        }

    }
    // to calculate employee's bonus
    void calculateBonus() {
        if (this.workHours > legalWorkHour) {
            bonus = (this.workHours - legalWorkHour) * 30;

        } else {
            System.out.println("Bonus kazanılacak kadar çalışılmamış");
        }

    }
    // to raise salary
    void raiseSalary() {
        if (currentYear - hireYear < 10) {
            raise += this.salary * 0.05;
        } else if ((currentYear - hireYear) >= 10 && (currentYear - hireYear) < 20) {
            raise += this.salary * 0.10;
        } else if ((currentYear - hireYear) >= 20) {
            raise += this.salary * 0.15;
        }
    }
    // printing employee's info


    public String toString() {
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + paidTax);
        System.out.println("Bonus: " + bonus);
        System.out.println("Maaş Artışı: " + raise);
        System.out.println("Vergi ve Bonuslar ile maas: " + (salary + bonus - paidTax));
        System.out.println("Toplam Maaş: " + (salary + bonus - paidTax + raise));
        return null;
    }


}

