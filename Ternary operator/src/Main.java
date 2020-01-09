public static<T, U> Function<T, U> ternaryOperator(
        Predicate<? super T>condition,
        Function<? super T,?extends U>ifTrue,
        Function<? super T,?extends U>ifFalse){


        return(x)->{
        U result=null;

        if(condition.test((T)x)){
        result=ifTrue.apply((T)x);
        }else{
        result=ifFalse.apply((T)x);
        }
        return result;
        };
        }