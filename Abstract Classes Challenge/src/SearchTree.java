public class SearchTree implements NodeList {

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null) {
            //This tree was empty,so our item becomes the head of the tree
            this.root = newItem;
            return true;
        }

        //otherwise, start comparing from the head of the tree
        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(newItem);

            if(comparison < 0) {
                // newItem is greater, move right if possible
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                }
                else {
                    //there is no next , so insert at end of list
                    currentItem.setNext(newItem);
                    return true;
                }
            }

            else if(comparison > 0) {
                //newItem is lesser,insert before
                if(currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    //there's no noded ti =o the left, so add at this point
                    currentItem.setPrevious(newItem);
                    return true;
                }
            }

            else {
                //equal, so don't add
                //System.out.println(newItem.getValue() + " is already present , not added.");
                return false;
            }
        }
        return false;

    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null) {
            //System.out.println("Deleting item " + item.getValue());

            ListItem currentItem = this.root;
            ListItem parentItem = currentItem;

            while (currentItem != null) {
                int comparison = currentItem.compareTo(item);
                if (comparison < 0) {
                    parentItem = currentItem;
                    currentItem = currentItem.next();
                } else if (comparison > 0) {
                    parentItem = currentItem;
                    currentItem = currentItem.previous();
                } else {
                    performRemoval(currentItem, parentItem);
                    return true;
                }
            }
        }
        return false;
    }

    private void performRemoval(ListItem item,ListItem parent ) {
        if(item.next() == null){
            if(parent.next() == item) {
                parent.setNext(item.previous());
            } else if(parent.previous()==item) {
                parent.setPrevious(item.previous());
            } else {
                this.root = item.previous();
            }
        } else if(item.previous() == null) {
            if(parent.next() == item) {
                parent.setNext(item.next());
            } else if(parent.previous() == item){
                parent.setPrevious(item.next());
            } else {
                this.root = item.next();
            }
        } else {
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while (current.previous()!=null){
                leftmostParent = current;
                current = current.previous();
            }
            item.setValue(current.getValue());
            if(leftmostParent == item){
                item.setNext(current.next());
            } else {
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void tranverse(ListItem root) {
        //recursive method
        if(root != null){
            tranverse(root.previous());
            System.out.println(root.getValue());
            tranverse(root.next());
        }
    }
}

