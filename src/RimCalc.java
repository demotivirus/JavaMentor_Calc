public class RimCalc {

    private int fstOp;
    private int scndOp;
    private String symbol;
    private int tmp;

    public void calculate(String str1, String symbol, String str2) throws ArithmeticException{
        fstOp = transpose(str1);
        scndOp = transpose(str2);
        this.symbol = symbol;
        operation();
    }

    private int transpose(String str){
        switch (str){
            case "I": return tmp = 1;
            case "II": return tmp = 2;
            case "III": return tmp = 3;
            case "IV": return tmp = 4;
            case "V": return tmp = 5;
            case "VI": return tmp = 6;
            case "VII": return tmp = 7;
            case "VIII": return tmp = 8;
            case "IX": return tmp = 9;
            case "X": return tmp = 10;
            default: throw new ArithmeticException();
        }
    }

    private void operation(){
        double tmpDivision = 0.0;
        switch (symbol){
            case "+":
                System.out.println(fstOp + scndOp); break;
            case "-":
                System.out.println(fstOp - scndOp); break;
            case "*":
                System.out.println(fstOp * scndOp); break;
            case "/": tmpDivision +=fstOp; tmpDivision /= scndOp;
                System.out.println(tmpDivision); break;
            default: throw new ArithmeticException();
        }
    }
}
