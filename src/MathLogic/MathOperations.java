package MathLogic;

public enum MathOperations {
    MULTIPLY(1,"*"), //при расширении возможностей (возвездение в степень, скобки) нужно будет указать для них более высокий приоритет
    ADD(0,"+"),
    SUBTRACT(0,"-"),
    DIVIDE(1,"/");
    private int priority;
    private String symbol;

    MathOperations(int priority,String symbol){
        this.priority=priority;
        this.symbol=symbol;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString(){
        return this.symbol;
    }
}
