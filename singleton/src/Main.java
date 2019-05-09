
class MyThread implements Runnable {
    ChocolateBilerSingleton instance;
    Thread t;
    String name;
    MyThread (String tname){
        name = tname;
        instance = ChocolateBilerSingleton.getInstance();
        t = new Thread(this, name);
        t.start();
    }
    public void run() {
        System.out.println(name + " entering.");
        instance.fill();
        instance.boil();
        instance.drain();
        System.out.println(name + " exiting.");
    }
}
class MultiThread {
    public static void main(String args[]) {
        MyThread t1 = new MyThread("Threat 1");
        MyThread t2 =  new MyThread("Threat 2");
        MyThread t3 =  new MyThread("Threat 3");
    }
}