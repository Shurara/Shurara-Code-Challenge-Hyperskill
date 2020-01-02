(left,right)->{
        long result=0;
        if(left==right){
        result=left;
        }else{
        result=LongStream.rangeClosed(left,right)
        .reduce(1,(a,b)->a*b);
        }

return result;
        };
