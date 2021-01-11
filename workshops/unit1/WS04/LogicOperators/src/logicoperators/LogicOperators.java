package logicoperators;

public class LogicOperators {

    public static void main(String[] args) {
        
     
     int x = 12;
        if (x != 12) {
            System.out.println("x is equals to 12");
        } else {
            System.out.println("x is NOT equal to 12");
        }

        boolean y = x != 12;
        System.out.println("x != 10 --> " + (y));
        System.out.println("x == 10 --> " + (x == 12));
        System.out.println("x = 5 -->   " + (x = 5));
        System.out.println("x > 5 -->  " + (x > 5));
        System.out.println("x >= 5 --> " + (x >= 5));

        boolean comparison = false;
        boolean comparison2 = false;
        boolean comparison3 = false;
        comparison = x != 12;
        System.out.println("comparison -> " + comparison);

        comparison2 = x >= 5;
        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);
        System.out.println("comparison2 -> " + comparison2);

        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);

        System.out.println("odd numbers -> && ");
        System.out.println("=================================================");
        boolean p;
        boolean q;

        p = true;
        q = true;
        System.out.println(" ( " + p + " ^ " + q + " ) " + (p && q));
        System.out.println(" ( " + p + " ^ " + !q + " ) " + (p && !q));
        System.out.println(" ( " + !p + " ^ " + q + " ) " + (!p && q));
        System.out.println(" ( " + !p + " ^ " + !q + " ) " + (!p && !q));
    }
    
}
