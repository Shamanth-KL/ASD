public class SharedCell {

    public static void main( String args[] ){
        HoldIntegerSynchronized h =
                new HoldIntegerSynchronized();
        ProduceInteger p = new ProduceInteger( h );
        ConsumeInteger c = new ConsumeInteger( h );

        p.start();
        c.start();
    }
}