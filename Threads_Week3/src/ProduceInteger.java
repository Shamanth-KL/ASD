public class ProduceInteger extends Thread {

    private HoldIntegerSynchronized pHold;

    public ProduceInteger( HoldIntegerSynchronized h ){
        super( "ProduceInteger" );
        pHold = h;
    }

    public void run(){
        for ( int count = 1; count <= 10; count++ ) {
            // sleep for a random interval
            try {
                Thread.sleep( (int) ( Math.random() * 3000 ) );
            } catch( InterruptedException e ) {
                System.err.println( e.toString() );
            }

            pHold.setSharedInt( count );
        }

        System.err.println( getName() +
                " finished producing values" +
                "\nTerminating " + getName() );
    }
}