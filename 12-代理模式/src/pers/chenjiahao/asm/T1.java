package pers.chenjiahao.asm;

/**
 * 光标必须位于类体内，View-Show ByteCode
 */
public class T1 {
    int i = 0;
    public void m(){
        i = i++;
        System.out.println(i);
    }
}
