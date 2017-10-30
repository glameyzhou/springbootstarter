package org.glamey.springbootstart.service;

import javax.annotation.Resource;
import org.glamey.springbootstart.BaseSpringBootTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author zhouyang.zhou. 2017.10.30.17.
 */

public class PlaceholderPropertiesTest extends BaseSpringBootTest {

  @Resource
  private PlaceholderProperties placeholderProperties;

  @Test
  public void printField() {
    assertEquals(placeholderProperties.getAppName(), "SpringBootStarterDemo");
    assertEquals(placeholderProperties.getAppDesc(), "SpringBootStarterDemo is a Spring boot Application");
    assertEquals(placeholderProperties.getUnderlineFirstName(), "underlineName");
    assertEquals(placeholderProperties.getStripingLineFirstName(), "stripingLineName");
  }
}