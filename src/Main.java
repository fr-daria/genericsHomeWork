public class Main {
    public static void main(String[] args) {
        MagicBox<String> box = new MagicBox<>();
        box.add("КОШКА");
        box.add("СОБАКА");
        box.add("ПОПУГАЙ");
        box.add("КРЫСА");
        System.out.println((String) box.pick());
    }
}