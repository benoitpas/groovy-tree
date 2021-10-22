class Node<T> implements Tree<T> {
    final private T value
    final private Tree<T> left
    final private Tree<T> right

    Node(T value, Tree<T> left, Tree<T> right) {
        this.value = value
        this.left = left
        this.right = right
    }

    @Override
    Tuple2<Tree<Tuple2<T, Integer>>, Integer> addId(Tree<T> tree, Integer index) {
        return null
    }
}