package m.novikov.io.github.themihabyte;

public class MyHashMap {
    public static final int OUT_OF_MEMORY=-99999;
    public static final int NO_SUCH_KEY=-2;
    int[] keys;
    long[] values;

    public MyHashMap() {
        keys=new int[100];
        values=new long[100];
    }

    public long put(Integer key, Long value) {
        long returnValue=0L;
        for (int hashKey=hash(key); hashKey < keys.length; hashKey++) {
            if (values[hashKey] == 0L || keys[hashKey] == key) {
                if (keys[hashKey] == key) {
                    returnValue=values[hashKey];
                }
                values[hashKey]=value;
                keys[hashKey]=key;
                return returnValue;
            }
        }
        return OUT_OF_MEMORY;
    }

    public long get(Integer key) {
        for (int hashKey=hash(key); hashKey < keys.length; hashKey++) {
            if (keys[hashKey] == key) return values[hashKey];
        }
        return NO_SUCH_KEY;
    }

    int size() {
        int size=0;
        for (long i :
                values) {
            if (i != 0) size++;
        }
        return size;
    }

    private int hash(int key) {
        int hashKey=Integer.hashCode(key) % keys.length;
        if (hashKey >= 0) return hashKey;
        else return -hashKey;
    }

    @Override
    public String toString() {
        StringBuilder output=new StringBuilder("{\t");
        for (int i=0; i < keys.length; i++) {
            if (values[i] != 0) {
                output.append(keys[i]).append(" -- ").append(values[i]).append("\t");
            }
        }
        output.append("}");
        return output.toString();
    }
}
