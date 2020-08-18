package labs_examples.datastructures.hashmap.labs;

import java.util.function.BiConsumer;

public class myBiConsumer implements BiConsumer<String, Abook> {
    public void accept(String k, Abook v)
    {
        System.out.print("Key = " + k);
        System.out.print("\t Value = " + v);
        System.out.println();
    }
}
