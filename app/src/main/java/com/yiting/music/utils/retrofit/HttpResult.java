package com.yiting.music.utils.retrofit;

/**
 * Created by Zhanglibin on 2017/4/24.
 */

public class HttpResult<T> {

    int error_code;
    String message;
    T data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }
}
