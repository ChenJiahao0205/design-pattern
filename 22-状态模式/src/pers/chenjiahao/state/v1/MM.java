package pers.chenjiahao.state.v1;

/**
 * 当增加新的状态时非常不方便
 */
public class MM {
    String name;
    private enum MMState{
        HAPPY1(1),
        SAD2(2);
        int value;
        MMState state;

        MMState(int value) {
            this.value = value;
        }
    }


    public void smile(){

    }
    public void cry(){

    }
    public void say(){

    }
}