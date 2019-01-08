package com.github.jxinx.test;

import com.github.jxinx.dao.RedisDao;
import com.github.jxinx.utils.RedisUtils;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * test
 */
public class RedisTest {

    private Jedis jedis;

    @Before
    public void getJedis() {
        jedis = RedisUtils.getJedis();
    }

    /**
     * 连接redis服务
     */
    @Test
    public void connectionRedis() {
        //连接本地的Redis服务
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        // 如果有密码，则需要下面权限认证
//        jedis.auth("123456");
        System.out.println("连接成功！");
        // 查看服务是否运行
        System.out.println("服务正在运行：" + jedis.ping());
    }

    /**
     * 测试Redis存储String
     */
    @Test
    public void testString() {
        jedis.set("name", "爱华");
        System.out.println(jedis.get("name"));
        jedis.append("name", "，嘉豪");
        System.out.print(jedis.get("name"));
        // 存储多个键值
        jedis.mset("name", "爱华", "age", "20");
        jedis.incr("age");
        System.out.println(jedis.get("name") + "," + jedis.get("age"));
        jedis.del("name", "age");
        System.out.println(jedis.get("name") + "," + jedis.get("age"));
    }

    /**
     * 测试操作redis生成唯一序列号
     */
    @Test
    public void testGetSerialNo() {
        RedisDao redisDao = new RedisDao();
        String HTSerialNo = redisDao.getSerialNo("HT");
        System.out.println(HTSerialNo);

        String GJSerialNo = redisDao.getSerialNo("GJ");
        System.out.println(GJSerialNo);
    }
}
