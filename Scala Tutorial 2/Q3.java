public class Q3 {
    public static void main(String[] args) {

        int a = 2, b = 3, c = 4, d = 5;
        float k = 4.3f, g = 4.0f;
        
        System.out.println(--b * a + c * d--);  //24
        System.out.println(a++);                //2
        System.out.println(-2 * (g-k)  + c);   //4.6000004
        System.out.println(c = c++);            //4
        System.out.println(c = ++c * a++);      //15

    }
}