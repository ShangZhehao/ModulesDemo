package com.modules.custom;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * 当前类注释:测试原生Toast模块
 * 项目名：android
 * 包名：com.modules.custom
 * 作者：江清清 on 16/3/31 10:18
 * 邮箱：jiangqqlmj@163.com
 * QQ： 781931404
 * 来源：<a href="http://www.lcode.org">江清清的技术专栏</>
 */
public class ToastCustomModule extends ReactContextBaseJavaModule {

    private static final String DURATION_SHORT="SHORT";
    private static final String DURATION_LONG="LONG";
    public ToastCustomModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }
    @Override
    public String getName() {
        return "ToastCustomAndroid";
    }
    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constants = new HashMap<>();
        constants.put(DURATION_SHORT, Toast.LENGTH_SHORT);
        constants.put(DURATION_LONG, Toast.LENGTH_LONG);
        return constants;
    }

    /**
     * 该方法用于给JavaScript进行调用
     * @param message
     * @param duration
     */
    @ReactMethod
    public void show(String message, int duration) {
        Toast.makeText(getReactApplicationContext(), message, duration).show();
    }
}