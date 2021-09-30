package pers.chenjiahao.observer.v2;

/**
 * 面向对象的傻等
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        // 没哭就一直等
        while (!child.isCry()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Observing.........");
        }
    }
}

class Child{
    private boolean cry = false;
    public boolean isCry(){
        return cry;
    }
    public void wakeUp(){
        System.out.println("waked up! Crying wuwuwuwuwu.....");
        cry = true;
    }
}
