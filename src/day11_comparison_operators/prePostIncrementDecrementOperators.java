package day11_comparison_operators;

public class prePostIncrementDecrementOperators {
    public static void main(String[] args) {
        //PRE-INCREMENT
        int num1 = 10;
        int num2 = ++num1;
        System.out.println("num1 = " + num1); //11
        System.out.println("num2 = " + num2); //11
        //int num1 =10;
        //++num1; //11
        //int num2 = num1; //11
        System.out.println();
        //POST INCREMENT
        int num3 = 4;
        int num4 = num3++;
        System.out.println("num3 = " + num3); //5
        System.out.println("num4 = " + num4); //4
          //int num3 =4;
        //int num4 = num3;
        //num3++;
        //sout(num3); 5
        //sou(num4); 4
        System.out.println();
        int apples = 5;
        int basket = ++apples;
        System.out.println("apples = " + apples); //6
        System.out.println("basket = " + basket); //6
        System.out.println();
        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi); //16
        System.out.println("kiwiBasket = " + kiwiBasket); //15
        System.out.println();
        int cars = 5;
        System.out.println(++cars); //6
        int sedans = 10;
        System.out.println(sedans++);//10
        System.out.println("sedans = " + sedans); //11
        System.out.println();
        int num = 44;
        num++;
        System.out.println(num);//45 ITS SEPARATE LINE 
        ++num;
        System.out.println(num);//46
        num = 20;//ADD 1 1ST/INCREMENT 1ST THEN PRINT VALUE
        System.out.println(++num);//21
        num = 33;
        System.out.println(num++); //33
        System.out.println(num); //34
        System.out.println();
        int myNum =15; //16
        int yourNum2 = ++myNum; //16
        //int yourNum = myNum++: //15
        System.out.println();
        int a = 50; // 51
        int b = 22; // 23
        int c = a++ + ++b; // 50 + 23 = 73 
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println();






    }
}
