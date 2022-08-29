package creational.singleton;

public class ThreadSafeSingleton {
    // The field must be declared volatile so that double check lock would work
    // correctly.
    private static volatile ThreadSafeSingleton instance;
    public String value;

    private ThreadSafeSingleton(String value){
        this.value = value;
    }

    public static ThreadSafeSingleton getInstance(String value){
        // The approach taken here is called double-checked locking (DCL). It
        // exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating separate
        // instances as a result.
        //
        // It may seem that having the `result` variable here is completely
        // pointless. There is, however, a very important caveat when
        // implementing double-checked locking in Java, which is solved by
        // introducing this local variable.

        ThreadSafeSingleton result = instance;

        if (result != null){
            //start by verifying if we need to create the object in the first place and only in that case we would acquire the lock.
            return result;
        }

        synchronized (ThreadSafeSingleton.class){
            if (instance == null){//perform the same check again as soon as we enter the synchronized block, in order to keep the operation atomic
                instance = new ThreadSafeSingleton(value);
            }

            return instance;
        }
    }
}
