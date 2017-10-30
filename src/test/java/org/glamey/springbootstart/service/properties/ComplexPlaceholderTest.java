package org.glamey.springbootstart.service.properties;

import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.glamey.springbootstart.BaseSpringBootTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author zhouyang.zhou. 2017.10.30.17.
 */
@Slf4j
public class ComplexPlaceholderTest extends BaseSpringBootTest {

  @Resource
  private ComplexPlaceholder complexPlaceholder;

  @Test
  public void printField() {
    List<String> multiLines1 = complexPlaceholder.getMultiLines1();
    assertEquals(multiLines1.size(), 2);
    log.info("multi lines for List are {}", multiLines1);

    Set<String> multiLines2 = complexPlaceholder.getMultiLines2();
    assertEquals(multiLines1.size(), 2);
    log.info("multi lines for set are {}", multiLines2);

    Map<String, String> map = complexPlaceholder.getMap1();
    log.info("map are {}", map);

    ComplexPlaceholder.ExecutorPool executorPool = complexPlaceholder.getExecutorPool();
    log.info("executor pool is {}", executorPool);
  }
}