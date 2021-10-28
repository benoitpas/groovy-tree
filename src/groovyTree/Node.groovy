package groovyTree

import groovy.transform.Immutable

// Cannot be declared @Immutable because all fields (including value) would need be to immutable

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
    boolean equals(o) {
        if (this.is(o)) return true
        if (getClass() != o.class) return false

        def node = (Node<T>) o
        this.value == node.value && left == node.left && right == node.right
    }

        @Override
    Tuple2<Tree<Tuple2<T, Integer>>, Integer> addId(Integer index) {
        Tuple2<Tree<Tuple2<T,Integer>>,Integer> newLeft = left.addId(index)
        Tuple2<Tree<Tuple2<T,Integer>>,Integer> newRight = right.addId(newLeft.second)

        return new Tuple2<Tree<Tuple2<T, Integer>, Integer>>(
                new Node(new Tuple2<T, Integer>(value, newRight.second),
                        newLeft.first,
                        newRight.first),
                newRight.second + 1);
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