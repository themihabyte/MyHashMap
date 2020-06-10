package m.novikov.io.github.themihabyte;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(-1, 58L);
        myHashMap.put(0, 89L);
        myHashMap.put(1, 556L);
        myHashMap.put(100, 345L);
        myHashMap.put(324523, -2345235L);
        myHashMap.put(101, 154L);

        System.out.println(myHashMap.get(101));
        System.out.println(myHashMap.put(0, 45L));
        System.out.println(myHashMap.get(-30000));
        
        System.out.println(myHashMap);
        System.out.println(myHashMap.size());
    }
}
