import java.util.Random;

public class Arena {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Arena(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    public void run() {
        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("");
                System.out.println("-----NEW ROUND-----");
                Random random = new Random();
                double hitChance = random.nextDouble();
                if (hitChance < 0.5) {
                    f2.health = f1.hit(f2);
                } else {
                    f1.health = f2.hit(f1);
                }
                if (isWin()) {
                    break;
                }

                printScore();
            }
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor");
        }

    }

    public boolean isWin() {
        if (f1.health <= 0) {
            System.out.println("Maci kazanan " + f2.name);
            return true;
        } else if (f2.health <= 0) {
            System.out.println("Maci kazanan " + f1.name);
            return true;
        }
        return false;
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public void printScore() {

        System.out.println(f1.name + " Kalan can   : " + f1.health);
        System.out.println(f2.name + " Kalan can   : " + f2.health);
    }


}
