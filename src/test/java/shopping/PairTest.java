package shopping;

import org.junit.jupiter.api.Test;

public class PairTest {

    @Test
    public void testPair()
    {
        Pair<String> myStringPair=new Pair<>("a","second");

        System.out.println(myStringPair);

        ClothingPair<Sock>clothingPair = new ClothingPair<>(new Sock("a","b"));



    }

}
