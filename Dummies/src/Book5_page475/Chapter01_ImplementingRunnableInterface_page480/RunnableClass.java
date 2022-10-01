package Book5_page475.Chapter01_ImplementingRunnableInterface_page480;

class RunnableClass {
    RunnableClass rc = new RunnableClass();
    Thread t = new Thread((Runnable) rc);

    public Thread getT() {
        t.start();
        return t;
    }
}
