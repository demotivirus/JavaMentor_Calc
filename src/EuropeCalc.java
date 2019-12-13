public class EuropeCalc {

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
            case "1": return tmp = 1;
            case "2": return tmp = 2;
            case "3": return tmp = 3;
            case "4": return tmp = 4;
            case "5": return tmp = 5;
            case "6": return tmp = 6;
            case "7": return tmp = 7;
            case "8": return tmp = 8;
            case "9": return tmp = 9;
            case "10": return tmp = 10;
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
