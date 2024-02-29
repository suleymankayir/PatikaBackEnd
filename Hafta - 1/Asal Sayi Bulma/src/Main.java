public class Main {

    public static void main(String[] args) {

        System.out.print("1 ile 100 arasindaki sayilar: ");
        for (int i = 1; i < 100; i++) {
            boolean asalMi = true;

            if (i < 2) {
                continue;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        asalMi = false;
                        break;
                    }
                }
            }
            if (asalMi) {
                System.out.print(i + " ");
            }
        }




    }
}
/*
public class Main {
    public static void main(String[] args) {
        int bolenSayisi=0;

        for( int i=1;i<=100;i++){//1'den 100 e kadar olan sayılar için(bir sonraki açıklama doğru devam)
            for(int j=1;j<=i;j++){ //1'den sayıya kadar olan
                if(i%j==0) { //bölen bulma
                    bolenSayisi += 1;
                }


            }
            if(bolenSayisi==2){//bir sayının pozitif bölen sayısı 2 ise sayı asaldır.
                System.out.print(i+",");
            }
            /*her sayı için kendisine kadar olan sayılarda bölen bulduktan sonra
             sonraki sayı için bölen sayısını sıfırlamalıyız.

            bolenSayisi=0;
                    }
                    }
                    }
 */