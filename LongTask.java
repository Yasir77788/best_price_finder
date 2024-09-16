package best_price_finder;

public class LongTask {

    public static void simulate(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new IllegalStateException();
        }
    }

    public static void simulate(int delay){
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            throw new IllegalStateException();
        }
    }
}
