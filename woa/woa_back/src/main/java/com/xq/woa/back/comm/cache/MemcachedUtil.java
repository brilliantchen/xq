package com.xq.woa.back.comm.cache;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.danga.MemCached.MemCachedClient;
import com.danga.MemCached.SockIOPool;

@Component
public class MemcachedUtil {
	private Logger logger = LoggerFactory.getLogger(MemcachedUtil.class);
	
	private Properties properties;
	private MemCachedClient cachedClient;
	
	//@PostConstruct
	private void init() {
		try {
			properties = new Properties();
			properties.load(getClass().getResourceAsStream("/memcached.properties"));
			//数据缓存服务器，“,”表示配置多个memcached服务
			String[] servers = properties.getProperty("cache.server").replaceAll(" ", "").split(",");
			SockIOPool pool = SockIOPool.getInstance("dataServer");
			pool.setServers(servers);
			pool.setFailover(true);
			pool.setInitConn(10);
			pool.setMinConn(5);
			pool.setMaxConn(50);
			pool.setMaintSleep(30);
			pool.setNagle(false);
			pool.setSocketTO(3000);
			pool.setBufferSize(1024*1024*5);
			pool.setAliveCheck(true);
			pool.initialize(); /* 建立MemcachedClient实例 */
			cachedClient = new MemCachedClient("dataServer");
		}catch (Exception ex) {
			ex.printStackTrace();
		}
    }
	
	public boolean add(String key, Object value) {
        return cachedClient.add(key, value);
    }
     
    public boolean add(String key, Object value, Integer expire) {
        return cachedClient.add(key, value, expire);
    }
     
    public boolean set(String key, Object value) {
        return cachedClient.set(key, value);
    }
     
    public boolean set(String key, Object value, Integer expire) {
        return cachedClient.set(key, value, expire);
    }
     
    public boolean replace(String key, Object value) {
        return cachedClient.replace(key, value);
    }
     
    public boolean replace(String key, Object value, Integer expire) {
        return cachedClient.replace(key, value, expire);
    }
     
    public Object get(String key) {
        return cachedClient.get(key);
    }
	
}
