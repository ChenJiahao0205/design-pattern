package pers.chenjiahao.iterator.v6;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/28 21:03
 */
public class NameRepository implements Container {
    public String[] names;

    public NameRepository(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
