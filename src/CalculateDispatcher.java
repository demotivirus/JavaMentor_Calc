import java.util.Scanner;

public class CalculateDispatcher{

    private Scanner scn;
    private RimCalc rimCalc;
    private EuropeCalc europeCalc;
    private String str1;

    public CalculateDispatcher(){
        scn = new Scanner(System.in);
        rimCalc = new RimCalc();
        europeCalc = new EuropeCalc();
    }

    public void start() throws ArithmeticException{
        while(scn.hasNextLine()){
            str1 = scn.next();
            String str2;
            String symbol;

            if(rimBoolean()){
                symbol = scn.next();
                str2 = scn.next();
                rimCalc.calculate(str1, symbol, str2);
            }
            else if(europeBoolean()){
                symbol = scn.next();
                str2 = scn.next();
                europeCalc.calculate(str1, symbol, str2);
            }
            else throw new ArithmeticException();
        }
        scn.close();
    }

    private boolean rimBoolean(){
        return (str1.equals("I")||str1.equals("II")||str1.equals("III")||str1.equals("IV")||str1.equals("V")
                ||str1.equals("VI")||str1.equals("VII")||str1.equals("VIII")||str1.equals("IX")||str1.equals("X"));
    }

    private boolean europeBoolean(){
        return (str1.equals("1")||str1.equals("2")||str1.equals("3")||str1.equals("4")||str1.equals("5")
                ||str1.equals("6")||str1.equals("7")||str1.equals("8")||str1.equals("9")||str1.equals("10"));
    }
}
