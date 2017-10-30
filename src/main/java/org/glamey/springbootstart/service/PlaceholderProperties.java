package org.glamey.springbootstart.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author zhouyang.zhou. 2017.10.30.17.
 */
@Component
@Getter
public class PlaceholderProperties {

  @Value("${app.name}")
  private String appName;

  @Value("${app.description}")
  private String appDesc;

  @Value("${app.first_name}")
  private String underlineFirstName;

  @Value("${app.first-name}")
  private String stripingLineFirstName;

}
