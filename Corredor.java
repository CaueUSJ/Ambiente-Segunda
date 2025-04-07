public class Corredor implements Runnable {

    private static double distanciaTotalDaCorrida = 500;
    private double distanciaTotalPercorrida = 0;

    @Override
    public void run() {

        while(distanciaTotalPercorrida <= distanciaTotalDaCorrida){

            distanciaTotalPercorrida += Math.random() * 50;
            System.out.println(Thread.currentThread().getName() + String.format("%.2f", distanciaTotalPercorrida + " m"));
            
        }

    }

}