package com.sky.context;

public class BaseContext {
//    工具类：用来获取当前线程的用户id
//            ThreadLocal：是thread的局部变量，而不是线程
//    threadlocal的常见方法如下：设置局部变量值，返回局部变量值，移除局部变量
    public static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    public static Long getCurrentId() {
        return threadLocal.get();
    }

    public static void removeCurrentId() {
        threadLocal.remove();
    }

}
