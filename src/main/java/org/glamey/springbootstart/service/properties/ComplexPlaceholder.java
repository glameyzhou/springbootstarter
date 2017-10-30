package org.glamey.springbootstart.service.properties;

import java.util.List;
import java.util.Map;
import java.util.Set;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html <p/>
 *
 * 这种方式需要写所有字段的get set方法
 *
 * @author zhouyang.zhou. 2017.10.30.17.
 */
@Configuration
@ConfigurationProperties(prefix = "propertiesPrefix")
@Data
public class ComplexPlaceholder {
  private List<String> multiLines1;
  private Set<String> multiLines2;
  private Map<String, String> map1;
  ExecutorPool executorPool;

  @Data
  public static class ExecutorPool {
    private int corePoolSize;
    private int maxPoolSize;
    private int queueSize;
  }
}
