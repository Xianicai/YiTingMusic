package com.yiting.music.utils.retrofit.factory;

import com.google.gson.Gson;
import com.yiting.music.utils.UnicodeUtil;

import java.io.IOException;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * Created by Zhanglibin on 2017/11/29.
 */

public class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final Gson gson;
    private final Type type;


    public GsonResponseBodyConverter(Gson gson, Type type) {
        this.gson = gson;
        this.type = type;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        String response = UnicodeUtil.decode(value.string()).trim();
        return gson.fromJson(response, type);

    }
}