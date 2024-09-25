public class NumberEqualOrNot {
    public static void main(String[] args) {

        int[] number = {10,10,20,10};
        int i = 0;
        while (i<number.length){
            for (int j=i+1 ; j<=number.length-1 ;j++) {
                if (number[i] == number[j]  ) {
                    if ( j== number.length-1) {
                        System.out.print("All number are equal ");
                        break;
                    }
                } else if (number[i] != number[j]  ) {
                    System.out.print("All number are different " );
                    break;
                }
            }

            break;
        }
        for (int k=0 ; k<number.length ; k++){
            if (k==0) {
                System.out.print("[" + number[k]);
            }
            else if(k<number.length-1){
                System.out.print(" , " + number[k]);
            }
            else {
                System.out.print( " , "+number[k] +" ]");
            }
        }

    }
}