import javafx.scene.paint.Stop;

public class StopWatch {
    private long startTime, endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) throws InterruptedException {
        StopWatch stopWatch = new StopWatch();

        Thread.sleep(5000);
        Thread.sleep(2000);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
