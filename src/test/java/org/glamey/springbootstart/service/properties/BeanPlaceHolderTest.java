package org.glamey.springbootstart.service.properties;

import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.glamey.springbootstart.BaseSpringBootTest;
import org.junit.Test;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author zhouyang.zhou. 2017.10.30.22.
 */
@Slf4j
@EnableConfigurationProperties(value = BeanPlaceHolder.class)
public class BeanPlaceHolderTest extends BaseSpringBootTest {

  @Resource
  private BeanPlaceHolder beanPlaceHolder;

  @Test
  public void printBeanProperties() {
    log.info("bean place holder is {}", beanPlaceHolder);
  }
}