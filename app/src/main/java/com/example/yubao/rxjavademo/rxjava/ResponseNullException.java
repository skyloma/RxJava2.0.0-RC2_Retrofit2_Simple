package com.example.yubao.rxjavademo.rxjava;

/**
 * 自定义异常类-api接口调用 返回的response model为null或者List size为0
 * Created by yubaokang on 2016/9/13.
 */
public class ResponseNullException extends Exception {

    /**
     * Constructs a {@code ResponseNullException} with no detail message.
     */
    public ResponseNullException() {
        super();
    }

    /**
     * Constructs a {@code ResponseNullException} with the specified
     * detail message.
     *
     * @param s the detail message.
     */
    public ResponseNullException(String s) {
        super(s);
    }
}
