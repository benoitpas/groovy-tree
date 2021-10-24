package groovyTree;

import groovy.lang.Tuple2;

interface Tree<T> {
    Tuple2<Tree<Tuple2<T,Integer>>,Integer> addId(Integer index);
}
