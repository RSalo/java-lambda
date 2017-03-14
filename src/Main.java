public class Main {

    static <T> int counter(T[] vals, StringFunc<T> f, T v) {
        int count = 0;

        for (T val : vals) {
            if (f.funcs(val, v)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count;

        MyStingOps[] weekDay = {new MyStingOps(222)};

        count = counter(weekDay, MyStingOps::sameTemp, new MyStingOps(222));

        System.out.println(count);
    }
}
