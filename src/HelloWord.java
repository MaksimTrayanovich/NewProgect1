public class HelloWord {

    //public - видят все, static - не нужен обьект нашего класса,
    //void - ничего не возвращает,
    //main - говорит что это старт нашего приложения
    //psvm - чтобы не писать руками

    public static void main(String[] args) {
    int minValue = 3;
    int maxValue = 5;
        System.out.println( minValue == maxValue );
        System.out.println( minValue != maxValue );
        System.out.println( minValue < maxValue );
        System.out.println( minValue > maxValue );
        System.out.println( minValue <= maxValue );
        System.out.println( minValue >= maxValue );
        boolean isEqual = minValue == maxValue;
        System.out.println(minValue > 0 && maxValue < 10);

        minValue+=6;
        minValue-=2;
        minValue*=2;
        minValue/=6;
        System.out.println(minValue);
        System.out.println(maxValue);
//        short myShort = firstByteExample;
//        byte secondByte = (byte)myShort;
//        char letter = 'a';
//        int myeLetter = 30;
//        float myFloatNumber = 2.5f;
//
//        boolean isTrue = true ;
//        boolean isFalse = false ;
//
//        System.out.println(isTrue);
//        System.out.println(myeLetter);
//
//        int aa = 5;
//        int bb = 3;
//        System.out.println((double) aa/bb);
//        System.out.println(aa%bb);
//        aa++;
//        aa--;
//        ++aa;
//        --aa;
//
//        int t = 7;
//
//        System.out.println(t++);
//        aa = aa + 1;
//        System.out.println(t);
//
//        //sout - not to write by hands
//        System.out.println("Hello word!!");>

    }
}
