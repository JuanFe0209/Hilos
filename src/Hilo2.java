class Hilo2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hilo 2: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}