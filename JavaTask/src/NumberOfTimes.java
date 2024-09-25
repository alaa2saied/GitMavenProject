public class NumberOfTimes {
    public static void main(String[] args) {
        String word = "good luck";
        int sum = 0;
        char[] stringToChar = word.toCharArray();
        for (int i = 0; i< stringToChar.length ; i++){

            if (stringToChar[i] =='o'){
                sum++;
            }
        }
        System.out.println("Number of \"o\" in this text ( "+word+" ) : "+sum);
    }
}
