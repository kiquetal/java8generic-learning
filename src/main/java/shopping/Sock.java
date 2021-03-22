package shopping;

public class Sock<E> extends Pair<E> implements Sized{


    public Sock(E left, E right) {
        super(left, right);
    }

    @Override
    public boolean getSized() {
        return false;
    }
}
