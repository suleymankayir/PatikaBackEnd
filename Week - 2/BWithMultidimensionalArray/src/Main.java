public class Main {


    public static void main(String[] args) {

    int [] [] bArr= new int[7][4];

        for (int i = 0; i < bArr.length ; i++) {
            for (int j = 0; j < bArr[i].length; j++) {
                if (i==0 || j ==0){
                    System.out.print(" * "); // 1 space to right
                } else if (i==3 || j == 3){
                    System.out.print(" * ");
                } else if (i==6){
                    System.out.print(" * "); // 1 space to left
                } else {
                    System.out.print("   "); // 3 space for every time runs
                }

            }
            System.out.println(); // for next line
        }

    }
}