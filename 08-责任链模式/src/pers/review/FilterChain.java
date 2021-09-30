package pers.review;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/1 13:47
 */
public class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<>();

    public FilterChain add(Filter f){
        filters.add(f);
        return this;
    }

    @Override
    public boolean doFilter(Message m) {
        for (Filter filter : filters) {
            if (!filter.doFilter(m)){
                return false;
            }
        }
        return true;
    }
}
