package shopping;

public class Sock<E> extends Pair<E> implements Sized,Colored{


    public Sock(E data) {
        super(data,data);
    }

    @Override
    public boolean getSized() {
        return false;
    }

    @Override
    public boolean hasColor() {
        return false;
    }
}
