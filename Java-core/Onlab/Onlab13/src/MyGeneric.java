public class MyGeneric <T> {
    public T variable;

    public MyGeneric(T variable) {
        this.variable = variable;
    }

    public T getVariable() {
        return variable;
    }

    public void setVariable(T variable) {
        this.variable = variable;
    }

}
