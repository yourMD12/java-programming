package day10_shorthand_operators;

public class IncrementDecrement {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++;
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i = " + i);
        
        int linesOfCode = 15;
        System.out.println("lines of code = " + linesOfCode);
        linesOfCode++; //++linesOfCode;
        linesOfCode += 1;
        linesOfCode = linesOfCode + 1;
        System.out.println("linesOfCode = " + linesOfCode);

        linesOfCode--; //--lineOfCode;
        linesOfCode -= 1;
        linesOfCode = linesOfCode - 1;
        System.out.println("linesOfCode = " + linesOfCode);
        
        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter); //switch to the next letter
        letter ++;
        ++letter;
        System.out.println("letter = " + letter);//it will be d
        letter--;
        letter--;
        letter--;
        letter--;
        System.out.println("letter = " + letter);


int a = 3+4;
int b = (3+4);
        System.out.println("5+2 = " + a);
        System.out.println("5+2 = " + b);



        
        
    }
}
