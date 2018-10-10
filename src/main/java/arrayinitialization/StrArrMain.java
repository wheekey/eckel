package arrayinitialization;

public class StrArrMain {
    public static void main(String[] args) {
        StrArr[] refs = new StrArr[10];
        for (int i =0; i< refs.length; i++)
        {
            refs[i] = new StrArr(i);
        }
        System.out.println(refs);
    }
}
