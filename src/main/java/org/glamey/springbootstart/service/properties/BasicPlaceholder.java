package org.glamey.springbootstart.service.properties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author zhouyang.zhou. 2017.10.30.17.
 */
@Component
@Getter
@Setter
@ToString
public class BasicPlaceholder {

  @Value("${app.name}")
  private String appName;

  @Value("${app.description}")
  private String appDesc;

  @Value("${app.first_name}")
  private String underlineFirstName;

  @Value("${app.first-name}")
  private String stripingLineFirstName;

}
