

public class CustomLinkedList<Element> {

    private Node<Element> first;
    private Node<Element> last;
    private int size = 0;

    public void add(Element element) {
        Node<Element> node;
        if (first == null) {
            node = new Node<>(element, null, null);
            first = node;
        } else {
            node = new Node<>(element, null, last);
            last.next = node;
        }
        last = node;
        size++;
    }

    public void addFirst(Element element) {
        Node<Element> newNode = new Node<>(element,first,null);
        if(first != null){
            first.prev = newNode;
        }else {
            last = newNode;
        }
        first = newNode;
        size++;

    }

    public int size() {
        return size;
    }

    public Element get(int index) {
        return getNoteByIndex(index).item;
    }

    public Node<Element> getNoteByIndex(int index) {
        Node<Element> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    public Element getFirst() {
        return first.item;
    }

    public Element getLast() {
        return last.item;
    }




    public void delete(int index) {
        Node<Element> currentNode = getNoteByIndex(index);
        if (index == 0) {
            first = currentNode.next;
        } else if (index == size - 1) {
            last = currentNode.prev;
        } else {
            Node<Element> nodeBefore = currentNode.prev;
            Node<Element> nodeAfter = currentNode.next;
            nodeBefore.next = nodeAfter;
            nodeAfter.prev = nodeBefore;
        }
        size--;

    }



    private static class Node<Element> {
        Element item;
        Node<Element> next;
        Node<Element> prev;

        public Node(Element item, Node<Element> next, Node<Element> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }

    }


}
