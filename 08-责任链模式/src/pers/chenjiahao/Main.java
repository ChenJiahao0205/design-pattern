package pers.chenjiahao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("大家好:)，<script>，欢迎访问 mashibing.com，大家都是996");
        FilterChain filterChain = new FilterChain();
        FilterChain fc2 = new FilterChain();

        filterChain.add(new HTMLFilter()).add(new SensitiveFilter());
        fc2.add(new FaceFilter()).add(new UrlFilter());
        // 链条加链条
        filterChain.add(fc2);
        filterChain.doFilter(msg);
        System.out.println(msg);

    }
}

class Msg{
    String name;
    String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
interface Filter{
    boolean doFilter(Msg m);
}
class HTMLFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        // 处理msg
        String r = msg.getMsg();
        r = r.replace('<','[');
        r = r.replace('>',']');
        msg.setMsg(r);
        return true;
    }
}
class SensitiveFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        // 处理msg
        String r = msg.getMsg();
        r = r.replace("996","955");
        msg.setMsg(r);
        return false;
    }
}
class FaceFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        // 处理msg
        String r = msg.getMsg();
        r = r.replace(":)","^V^");
        msg.setMsg(r);
        return true;
    }
}
class UrlFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        // 处理msg
        String r = msg.getMsg();
        r = r.replace("mashibing.com","http://www.mashibing.com");
        msg.setMsg(r);
        return true;
    }
}
class FilterChain implements Filter{
    List<Filter> filters = new ArrayList<>();
    public FilterChain add(Filter f){
        filters.add(f);
        return this;
    }
    public boolean doFilter(Msg msg){
        for (Filter filter : filters) {
            if (!filter.doFilter(msg)){
                return false;
            }
        }
        return true;
    }
}