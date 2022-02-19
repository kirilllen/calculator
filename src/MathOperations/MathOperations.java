package MathOperations;

public enum MathOperations {
    MULTIPLY(1),
    ADD(0),
    SUBTRACT(0),
    DIVIDE(1);
    int priority;

    MathOperations(int priority){
        this.priority=priority;
    }

    public int getPriority() {
        return priority;
    }
}
