package javaThreadAbout;

public class AboutThread {
    public static void main(String[] args) {
        // Analisa a Thread atual
        Thread t = Thread.currentThread();
        System.out.println(t.getName());

        // Criando uma nova Thread
        Thread t1 = new Thread(new MeuRunnable());
        // t1.run(); // apenas executando na mesma thread
        t1.start(); // executando em uma nova thread

        // Runnable como lambda
        Thread t2 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        t2.start();

        // Várias threads
        Thread t3 = new Thread(new MeuRunnable());
        t3.start();
    }
}
