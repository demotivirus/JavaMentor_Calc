public class RimCalc {

    private int fstOp;
    private int scndOp;
    private String symbol;
    private int tmp;
    private String math;
    private int res1;
    private int res2;

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
        String revSymb = "";
        if(tmp == 0)
            new ArithmeticException();
        switch (symbol){
            case "+":
                tmp = fstOp + scndOp; break;
            case "-":
                tmp = fstOp - scndOp;
                if (tmp < 0){
                    tmp *= -1;
                    System.out.println("-" + logick());
                    return;
                }
                break;
            case "*":
                tmp = fstOp * scndOp; break;
            case "/":
                tmp = fstOp / scndOp; break;
            default: throw new ArithmeticException();
        }

        if(tmp == 0)
            throw new ArithmeticException();
        else if (tmp > 0)
            System.out.println(logick());
    }

    private String logick(){
        String str = "";
        res1 = tmp / 10;
        res2 = tmp % 10;
        if(tmp > 10)
            str = arithmeticLogickI() + arithmeticLogickII();
        else str += arithmeticLogickII();
        return str;
    }

    private String arithmeticLogickI(){
        switch (res1){
            case 1: return math = "X";
            case 2: return math = "XX";
            case 3: return math = "XXX";
            case 4: return math = "XL";
            case 5: return math = "L";
            case 6: return math = "LX";
            case 7: return math = "LXX";
            case 8: return math = "LXXX";
            case 9: return math = "XC";
            case 10: return math = "C";
            default: throw new ArithmeticException();
        }
    }

    private String arithmeticLogickII(){
        switch (res2){
            case 0: return math = "";
            case 1: return math = "I";
            case 2: return math = "II";
            case 3: return math = "III";
            case 4: return math = "IV";
            case 5: return math = "V";
            case 6: return math = "VI";
            case 7: return math = "VII";
            case 8: return math = "VIII";
            case 9: return math = "IX";
            case 10: return math = "X";
            default: throw new ArithmeticException();
        }
    }
}
