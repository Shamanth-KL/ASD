package queue;
import java.util.*;
class EmptyQueueException extends Exception {
    EmptyQueueException(){               // constructor which does nothing
    }

    EmptyQueueException(String message){ // constructor with error message handling
        super(message);
    }
}
