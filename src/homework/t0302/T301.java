package homework.t0302;
public class T301 {

    public static void main(String[] args) {
        testStringMemory(10000);
        testStringMemory(50000);
        testStringMemory(100000);
        testStringBuilderMemory(10000);
        testStringBuilderMemory(50000);
        testStringBuilderMemory(100000);
    }

    public static void testStringMemory(int count) {
        long startTime = System.currentTimeMillis(), endTime;
        Runtime run;
        long startMem, endMem;
        run = Runtime.getRuntime();
        run.gc();
        startMem = getMemory(run);
        String str = new String("a");
        for (int i = 0; i < count; i++)
            str = str.concat("0");

        endMem = getMemory(run);
        endTime = System.currentTimeMillis();
        System.out.println(count + "次 String  \t" + "記憶體使用:" + (endMem - startMem) + " \t 花費時間：" + (endTime - startTime));
        str = null;
    }
    public static void testStringBuilderMemory(int count) {
        long startTime = System.currentTimeMillis(), endTime;

        Runtime run;
        long startMem, endMem;
        run = Runtime.getRuntime();
        run.gc();
        startMem = getMemory(run);
        StringBuilder str = new StringBuilder("a");
        for (int i = 0; i < count; i++) {
            str = str.append("0");
        }
        endMem = getMemory(run);
        endTime = System.currentTimeMillis();
        System.out.println(count + "次 StringBuilder \t" + "記憶體使用:" + (endMem - startMem) + " \t 花費時間：" + (endTime - startTime));
        str = null;
    }
    private static long getMemory(Runtime run) {
        long total = run.totalMemory();
        long free = run.freeMemory();
        return total - free;
    }
}
