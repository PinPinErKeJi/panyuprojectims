package com.panyu.panyuprojectims.config;


import com.panyu.panyuprojectims.utils.FastJson2JsonRedisSerializer;
import com.panyu.panyuprojectims.utils.RedisTemplate;
import com.panyu.panyuprojectims.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

import java.time.Duration;

//import java.time.Duration;


@Configuration
@PropertySource("classpath:redis.properties")
public class RedisConfig {

    @Value("${redis.hostName}")
    private String hostName;
    
    @Value("${redis.port}")
    private Integer port;
    
//    @Value("${redis.password}")
//    private String password;
    
    @Value("${redis.maxIdle}")
    private Integer maxIdle;
    
    @Value("${redis.timeout}")
    private Integer timeout;
    
    @Value("${redis.maxTotal}")
    private Integer maxTotal;
    
    @Value("${redis.maxWaitMillis}")
    private Integer maxWaitMillis;
    
    @Value("${redis.minEvictableIdleTimeMillis}")
    private Integer minEvictableIdleTimeMillis;
    
    @Value("${redis.numTestsPerEvictionRun}")
    private Integer numTestsPerEvictionRun;
    
    @Value("${redis.timeBetweenEvictionRunsMillis}")
    private long timeBetweenEvictionRunsMillis;
    
    @Value("${redis.testOnBorrow}")
    private boolean testOnBorrow;
    
    @Value("${redis.testWhileIdle}")
    private boolean testWhileIdle;
    
    /*
    * JedisPoolConfig 连接池
    * @return
    */
    @Bean
    public JedisPoolConfig JedisPoolConfig() {
    	JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
    	 // 最大空闲数
        jedisPoolConfig.setMaxIdle(maxIdle);
        // 连接池的最大数据库连接数
        jedisPoolConfig.setMaxTotal(maxTotal);
        // 最大建立连接等待时间
        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
        // 逐出连接的最小空闲时间 默认1800000毫秒(30分钟)
        jedisPoolConfig.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        // 每次逐出检查时 逐出的最大数目 如果为负数就是 : 1/abs(n), 默认3
        jedisPoolConfig.setNumTestsPerEvictionRun(numTestsPerEvictionRun);
        // 逐出扫描的时间间隔(毫秒) 如果为负数,则不运行逐出线程, 默认-1
        jedisPoolConfig.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        // 是否在从池中取出连接前进行检验,如果检验失败,则从池中去除连接并尝试取出另一个
        jedisPoolConfig.setTestOnBorrow(testOnBorrow);
        // 在空闲时检查有效性, 默认false
        jedisPoolConfig.setTestWhileIdle(testWhileIdle);
		return jedisPoolConfig;
    	
    }
    // 单机版配置
  
    @Bean
    public JedisConnectionFactory JedisConnectionFactory(){
        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration ();
        redisStandaloneConfiguration.setHostName(hostName);
        redisStandaloneConfiguration.setPort(port);
       // redisStandaloneConfiguration.setPassword(RedisPassword.of(password));
        JedisClientConfiguration.JedisClientConfigurationBuilder jedisClientConfiguration = JedisClientConfiguration.builder();
        jedisClientConfiguration.connectTimeout(Duration.ofMillis(timeout));
        JedisConnectionFactory factory = new JedisConnectionFactory(redisStandaloneConfiguration,
                jedisClientConfiguration.build());
        return factory;
    }

    //实例化 RedisTemplate 对象
    @Bean
    public RedisTemplate redisTemplate(RedisConnectionFactory redisConnectionFactory) {
    	
    	RedisTemplate redisTemplate = new RedisTemplate();
    	initRedisTemplate(redisTemplate, redisConnectionFactory);
    	return redisTemplate;
    }
    
    //引入自定义序列化
    @Bean
    public RedisSerializer fastredisSerializer() {
    	return new FastJson2JsonRedisSerializer<Object>(Object.class);
    }
    
    //设置数据存入 redis 的序列化方式,并开启事务
    private void initRedisTemplate(RedisTemplate redisTemplate,RedisConnectionFactory factory) {
        //如果不配置Serializer，那么存储的时候缺省使用String，如果用User类型存储，那么会提示错误User can't cast to String！
    	redisTemplate.setKeySerializer(new StringRedisSerializer());
    	redisTemplate.setHashKeySerializer(new StringRedisSerializer());
    	redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
    	redisTemplate.setValueSerializer(fastredisSerializer());
    	
        // 开启事务
        redisTemplate.setEnableTransactionSupport(true);
        redisTemplate.setConnectionFactory(factory);
    }
    
   // 注入封装RedisTemplate
    @Bean(name = "redisUtil")
    public RedisUtil redisUtil(RedisTemplate redisTemplate) {
    	System.out.println("注入成功");
        RedisUtil redisUtil = new RedisUtil();
        redisUtil.setRedisTemplate(redisTemplate);
        return redisUtil;
    }

}
