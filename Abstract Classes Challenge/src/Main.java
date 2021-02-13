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

        System.out.println("************************");


        SearchTree tree = new SearchTree(null);
        tree.tranverse(tree.getRoot());
        String string = "5 7 3 9 8 2 1 0 4 6";
        String[] data1 = stringData.split(" ");
        for (String s : data1) {
            tree.addItem(new Node(s));
        }

        tree.tranverse(tree.getRoot());
        tree.removeItem(new Node("3"));
        tree.tranverse(tree.getRoot());

        tree.removeItem(new Node("5"));
        tree.tranverse(tree.getRoot());

        tree.removeItem(new Node("0"));
        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("2"));
        tree.tranverse(tree.getRoot());




    }
}
