package com.park.cloud.common.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by v5njj on 2018/10/12.
 */
public class CacheUtil {

    private static Map<String,CacheData> CACHE_DATA = new ConcurrentHashMap<>();

    public static <T> T getData(String key){
        CacheData<T> data = CACHE_DATA.get(key);
        if(data != null){

            if (data.getExpire() > 0 && data.getSaveTime() < System.currentTimeMillis()){
                clear(key);
                return null;
            }

            return data.getData();
        }

        return null;
    }

    public static <T> void setData(String key,T data,long expire){
        CACHE_DATA.put(key,new CacheData(data,expire));
    }

    public static void clear(String key){
        CACHE_DATA.remove(key);
    }

    public static void clearAll(){
        CACHE_DATA.clear();
    }

    private static class CacheData<T>{
        CacheData(T t,long expire){
            this.data = t;
            this.expire = expire <= 0 ? 0 : expire * 1000;
            this.saveTime = System.currentTimeMillis() + this.expire;
        }
        private T data;

        /**
         * 存活时间
         */
        private long saveTime;

        /**
         * 过期时间 小于等于0标识永久存活
         */
        private long expire;

        public T getData() {
            return data;
        }
        public long getExpire() {
            return expire;
        }
        public long getSaveTime() {
            return saveTime;
        }
    }


}
