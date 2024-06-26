package functions;

public class BinToDec {

    //BINARY TO DECIMAL

    public static void binToDec(int binNum){
        int pow=0;
        int decNum=0;
        int myNum=binNum;
        while(binNum>0){
            int lastdigit = binNum%10;
            decNum=decNum+(lastdigit * (int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("decimal of "+myNum+" = "+decNum);
    }

    //DECIMAL TO BINARY

    public static void DectoBin(int decNum){
        int myNum=decNum;
        int pow=0;
        int binNum=0;

        while (decNum>0) {
            int rem = decNum%2;
            binNum=binNum+(rem * (int)Math.pow(10, pow));
            pow++;
            decNum  /= 2;
        }
        System.out.println("binary form of " + myNum +" = "+binNum);
         
    }

    //MAIN METHOD

    public static void main(String[] args) {
        binToDec(101);
        DectoBin(10);
    }
    
}
