package pers.review;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/1 13:54
 */
public class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Message m) {
        // 处理msg
        String r = m.getMsg();
        r = r.replace("996","955");
        m.setMsg(r);
        return true;
    }
}
