package CollectionsExcercise;


import java.util.*;

/**
 * Created by Marina on 24.8.2017 г..
 */
public class Demo {

    public static void main(String[] args) {
        Comparator<Person> comparePeopleById=new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.id==o2.id){
                    return 0;
                }else{
                    return o1.id<o2.id? -1:1;
                }
            }
        };

        TreeSet<Person> people=new TreeSet<>(comparePeopleById);
        Random random=new Random();
        for (int i = 1; i <= 500; i++) {
            String name="Person "+i;
            String address="Sofia "+i;
            int age=random.nextInt(100)+1;
            int money=random.nextInt(1000);
            int weight=random.nextInt(150)+1;
            int height=random.nextInt(220)+30;
            Person person=new Person();
            people.add(person);
        }

        /*System.out.println(people.size());
        for (Person p: people) {
            System.out.println(p.toString());
        }*/

        Person p1=new Person();
        Person p2=new Person();
        Person p3=new Person();
        HashMap<Person,String> personNeighbourhood=new HashMap<>();
        personNeighbourhood.put(p1,"Studentski");
        personNeighbourhood.put(p2,"Nadejda");
        personNeighbourhood.put(p3,"Borovo");

        for (Map.Entry<Person,String> entry : personNeighbourhood.entrySet()        ) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

    }
}
