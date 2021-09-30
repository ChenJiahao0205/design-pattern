package pers.review;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/1 13:45
 */
public class HtmlFilter implements Filter {
    @Override
    public boolean doFilter(Message m) {
        // 处理msg
        String r = m.getMsg();
        r = r.replace('<','[');
        r = r.replace('>',']');
        m.setMsg(r);
        return true;
    }
}
