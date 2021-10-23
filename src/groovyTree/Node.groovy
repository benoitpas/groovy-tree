package groovyTree

class Node<T> implements Tree<T> {
    final private T value
    final private Tree<T> left
    final private Tree<T> right

    Node(T value, Tree left, Tree right) {
        this.value = value
        this.left = left
        this.right = right
    }

    @Override
    Tuple2<Tree<Tuple2<T, Integer>>, Integer> addId(Tree<T> tree, Integer index) {
        return null
    }

    @Override
    String toString() {
        StringBuilder sb = new StringBuilder("(");
        def addTo = { v ->
            String s = v.toString();
            if (s != "") {
                sb.append(",");
                sb.append(s);
            }
            return s
        }

        sb.append(value.toString());
        addTo(left);
        addTo(right);
        sb.append(")");
        return sb.toString();
    }
}