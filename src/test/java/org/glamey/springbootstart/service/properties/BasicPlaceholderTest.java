package org.glamey.springbootstart.service.properties;

import javax.annotation.Resource;
import org.glamey.springbootstart.BaseSpringBootTest;
import org.glamey.springbootstart.service.properties.BasicPlaceholder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author zhouyang.zhou. 2017.10.30.17.
 */

public class BasicPlaceholderTest extends BaseSpringBootTest {

  @Resource
  private BasicPlaceholder basicPlaceholder;

  @Test
  public void printField() {
    assertEquals(basicPlaceholder.getAppName(), "SpringBootStarterDemo");
    assertEquals(basicPlaceholder.getAppDesc(), "SpringBootStarterDemo is a Spring boot Application");
    assertEquals(basicPlaceholder.getUnderlineFirstName(), "underlineName");
    assertEquals(basicPlaceholder.getStripingLineFirstName(), "stripingLineName");
  }
}