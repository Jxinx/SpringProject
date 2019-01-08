package com.github.jxinx.dao;

import com.github.jxinx.utils.RedisUtils;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.Jedis;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * redis dao
 */
@Repository
public class RedisDao {

    private static Jedis jedis = RedisUtils.getJedis();

    /**
     * 操作redis，生成序列号 HT201901010001/GJ20190101001
     * @param type HT/GJ
     * @return 序列号
     */
    public String getSerialNo(String type) {
        //序列号
        String serialNo;

        //HT 20190101 0001
        //拼接序列号中间部分
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());

        StringBuffer buffer = new StringBuffer();

        //拼接序列号前面部分
        if ("HT".equals(type)) {
            buffer = buffer.append("HT").append(date);
        } else if ("GJ".equals(type)) {
            buffer = buffer.append("GJ").append(date);
        }

        //存入redis的key：HT20190101/GJ20190101
        String key = buffer.toString();

        Boolean flag = jedis.exists(key);
        if (!flag) { //当天第一个
            //设置key有效期：24小时
            int seconds = 60 * 60 * 24;
            jedis.setex(key, seconds, "1001");
            //拼接序列号尾部
            serialNo = buffer.append("001").toString();
        } else { //非当天第一个
            //redis value加1
            Long newValue = jedis.incr(key);
            String valueStr = newValue.toString().substring(1);
            //拼接序列号尾部
            serialNo = buffer.append(valueStr).toString();
        }
        return serialNo;
    }
}
