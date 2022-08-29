package creational.singleton;

public class DemoSafeMultiThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        new Thread(new ThreadFoo()).start();
        new Thread(new ThreadBar()).start();
    }

    static class ThreadFoo implements Runnable{
        @Override
        public void run() {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("foo");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable{
        @Override
        public void run() {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("bar");
            System.out.println(singleton.value);
        }
    }
}
