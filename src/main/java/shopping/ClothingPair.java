package shopping;

// extendsPair is the use
// CLothingPair is definition
public class ClothingPair <E extends Sized & Colored> extends Pair<E> {

    public ClothingPair(E left) {
        super(left, left);
    }

    public boolean isMatched()
    {
        return getLeft()==getRight();
    }
}
