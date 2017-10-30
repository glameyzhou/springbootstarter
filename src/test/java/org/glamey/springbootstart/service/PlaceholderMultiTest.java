package org.glamey.springbootstart.service;

import java.util.List;
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
public class PlaceholderMultiTest extends BaseSpringBootTest {

  @Resource
  private PlaceholderMulti placeholderMulti;

  @Test
  public void printField() {
    List<String> multiLines1 = placeholderMulti.getMultiLines1();
    assertEquals(multiLines1.size(), 2);
    log.info("multi lines for List are {}", multiLines1);

    Set<String> multiLines2 = placeholderMulti.getMultiLines2();
    assertEquals(multiLines1.size(), 2);
    log.info("multi lines for set are {}", multiLines2);

    PlaceholderMulti.ExecutorPool executorPool = placeholderMulti.getExecutorPool();
    log.info("executor pool is {}", executorPool);
  }
}