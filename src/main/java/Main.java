import java.util.Arrays;

/**
 * Created by minorius on 20.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        vampire();
        //fibonacci(20);
    }


    private static void vampire(){

        char[] stringResult;
        char[] stringMultiples;

        for(int i = 0; i<100; i++){
            for(int j = 0; j<100; j++){
                int res = i*j;
                if(res/1000>=1){

                    stringMultiples = Integer.toString(i).concat(Integer.toString(j)).toCharArray();
                    stringResult = Integer.toString(res).toCharArray();

                    Arrays.sort(stringMultiples);
                    Arrays.sort(stringResult);

                    if(Arrays.equals(stringResult, stringMultiples)){
                        System.out.println(i + " * " + j + " = " + res);
                    }
                }
            }
        }
    }

    private static void fibonacci(int y){

        int a = 0;
        int b = 1;

        for (int i=0; i<y; i++){

            a=a+b;
            b=a-b;

            System.out.println(a);
        }
    }
}
