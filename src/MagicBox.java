import java.util.Random;

public class MagicBox<T> {
    protected T item;
    protected T[] items;

    public MagicBox() {
        this.item = item;
        T[] items = (T[]) new Object[4];
    }

    public boolean add(T item) {
        for (int i = 0 ; i < items.length ; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
            return  false;
        }
        return false;
    }

    public <T> T pick() {
        try {
            if (items.equals(null)) {
                System.out.println("коробка не полна и осталось ещё " + " ячеек заполнить");
            }
        } catch (RuntimeException e) {
            System.out.println("коробка не полна и осталось ещё " + " ячеек заполнить");
        }
        Random random = new Random();
        int randomInt = random.nextInt(7); // джава подберёт случайное число от 0 до ЧИСЛО невключительно

        T items1 = (T) items[randomInt];
        return items1;
    }
}


