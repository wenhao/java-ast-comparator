package ast.comparator;

public class AstClass {

    private int initial;

    public int add(int augend, int addend) {
        int result = augend + addend;
        return result;
    }

    public int minus(int minuend, int subtrahend) {
        int result = minuend - subtrahend;
        return result;
    }
}
