package CollectionsExcercise;

import java.util.Scanner;

/**
 * Created by Marina on 24.8.2017 г..
 */
public class SchedulerDemo {
    public static void main(String[] args) {
        Scheduler scheduler=new Scheduler();
        FeedTheDoge t1=new FeedTheDoge();
        WriteHomework t2=new WriteHomework();
        TreatYourselfWithACake t3=new TreatYourselfWithACake();
        WatchGameOfThrones t4=new WatchGameOfThrones();
        scheduler.push(t1);
        scheduler.push(t2);
        scheduler.push(t3);
        scheduler.push(t4);
        System.out.println(scheduler.getTasks().size());
        scheduler.main();
        System.out.println(scheduler.getTasks().size());

    }
}
