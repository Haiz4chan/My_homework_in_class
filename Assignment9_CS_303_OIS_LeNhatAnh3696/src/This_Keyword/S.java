
package This_Keyword;


public class S {
    void m(){
        System.out.println("method us invoked");
    }
    void n(){
        this.m();
    }
    void p(){
        n();
    }
    public static void main(String[] args) {
        S s1 =new S();
        s1.p();
    }
}
