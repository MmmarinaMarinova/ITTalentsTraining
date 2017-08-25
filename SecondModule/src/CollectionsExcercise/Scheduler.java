package CollectionsExcercise;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Marina on 24.8.2017 г..
 */
public class Scheduler{
    private Queue<Task> tasks=new LinkedList<>();


    void push(Task task){
        if(task!=null){
            this.tasks.offer(task);
        }
    }

    void main(){
        while(!tasks.isEmpty()){
            Task currentTask=this.tasks.poll();
            currentTask.doWork();
        }
    }

    public Collection<Task> getTasks() {
        return Collections.unmodifiableCollection(this.tasks);
    }
}
