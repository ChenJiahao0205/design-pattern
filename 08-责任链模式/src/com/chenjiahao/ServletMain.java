package com.chenjiahao;


import java.util.ArrayList;
import java.util.List;

public class ServletMain {
    public static void main(String[] args) {
        Request request = new Request();
        request.setStr("request");
        Response response = new Response();
        response.setStr("response");
        // 需要建两条链
        // 第一条负责处理request链
        FilterChain requestChain = new FilterChain();
        // 第二条负责处理response链
        FilterChain responseChain = new FilterChain();
        requestChain.add(new HTMLFilter()).add(new SensitiveFilter());
        responseChain.add(new SensitiveFilter()).add(new HTMLFilter());
        requestChain.add(responseChain);
        requestChain.doFilter(request,response,responseChain);
    }
}

interface Filter{
    boolean doFilter(Request request,Response response,FilterChain filterChain);
}

class Request{
    String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Request{" +
                "str='" + str + '\'' +
                '}';
    }
}
class Response{
    String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Response{" +
                "str='" + str + '\'' +
                '}';
    }
}

class HTMLFilter implements Filter {
    @Override
    public boolean doFilter(Request request,Response response,FilterChain filterChain) {
        System.out.println("1");
        return false;
    }
}

class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Request request,Response response,FilterChain filterChain) {
        System.out.println("2");
        return false;
    }
}


class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<>();
    public FilterChain add(Filter f){
        filters.add(f);
        return this;
    }
    public boolean doFilter(Request request,Response response,FilterChain filterChain){
        for (Filter filter : filters) {
            if (!filter.doFilter(request,response,filterChain)){
                return false;
            }
        }
        return true;
    }
}