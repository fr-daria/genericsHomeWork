import java.util.Random;

public class MagicBox<T> {

    protected T[] items;


    public MagicBox(int size) {
        items = (T[]) new Object[size];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public <T> T pick() {
        //try {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("коробка не полна и осталось ещё " + " ячеек заполнить");
            }
        }

        Random random = new Random();
        int randomInt = random.nextInt(items.length);

        return (T) items[randomInt];
    }
}


