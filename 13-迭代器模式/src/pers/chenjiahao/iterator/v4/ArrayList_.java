package pers.chenjiahao.iterator.v4;

/**
 * 相比数组，这个容器不用考虑边界问题，可以动态扩展
 */
class ArrayList_ implements Collection_ {
    Object[] objects = new Object[10];
    // index 是 objects中下一个空的位置在哪，或者说，目前容器有多少个元素
    private int index = 0;
    public void add(Object o){
        if (index == objects.length){
            Object[] newObjects = new Object[objects.length*2];
            System.arraycopy(objects,0,newObjects,0,objects.length);
            objects = newObjects;
        }
        objects[index] = o;
        index++;
    }
    public int size(){
        return index;
    }
}
