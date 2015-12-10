package simpl.interpreter;

public class NilValue extends Value { //ԭ������public

    public NilValue() { //ԭ����protected
    }

    public String toString() {
        return "nil";
    }

    @Override
    public boolean equals(Object other) {
        
        if (other instanceof NilValue) {
            return true;
        } else {
            return false;
        }
    }
}
