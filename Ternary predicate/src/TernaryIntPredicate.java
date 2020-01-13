@FunctionalInterface
public interface TernaryIntPredicate {
boolean test( int a, int b, int c);
};

public static final TernaryIntPredicate allValuesAreDifferentPredicate = (a, b, c)->{

    return a != b && a != c && b != c ? true : false;
};

// Write a lambda expression here