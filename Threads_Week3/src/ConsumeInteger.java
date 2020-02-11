public class ConsumeInteger extends Thread {

    private HoldIntegerSynchronized cHold;

    public ConsumeInteger( HoldIntegerSynchronized h ){
        super( "ConsumeInteger" );
        cHold = h;
    }

    public void run(){
        int val, sum = 0;

        do {
            // sleep for a random interval
            try {
                Thread.sleep( (int) ( Math.random() * 3000 ) );
            } catch( InterruptedException e ) {
                System.err.println( e.toString() );
            }

            val = cHold.getSharedInt();
            sum += val;
        } while ( val != 10 );

        System.err.println(
                getName() + " retrieved values totaling: " + sum +
                        "\nTerminating " + getName() );
    }
}