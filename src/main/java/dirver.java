public class dirver {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            Thread.sleep(100);
            System.out.println("这个是第" + i + "次输出");

        }

        // 加一点备注试一下pull
        for (int i = 0; i < 100; i++) {
            Thread.sleep(10);
            System.out.println("hello");

        }
    }
}
