public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.tranverse(list.getRoot());
        String stringData = "5 7 3 9 8 2 1 0 4 6";
        String[] data = stringData.split(" ");
        for (String s : data) {
            list.addItem(new Node(s));
        }

        list.tranverse(list.getRoot());
        list.removeItem(new Node("3"));
        list.tranverse(list.getRoot());

        list.removeItem(new Node("5"));
        list.tranverse(list.getRoot());

        list.removeItem(new Node("0"));
        list.removeItem(new Node("4"));
        list.removeItem(new Node("2"));
        list.tranverse(list.getRoot());





    }
}
