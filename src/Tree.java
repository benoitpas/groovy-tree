import groovy.lang.Tuple2;

interface Tree<T> {
    Tuple2<Tree<Tuple2<T,Integer>>,Integer> addId(Tree<T> tree, Integer index);
}
