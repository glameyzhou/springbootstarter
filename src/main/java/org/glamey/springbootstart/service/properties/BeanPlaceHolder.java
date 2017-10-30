package org.glamey.springbootstart.service.properties;

import javax.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

/**
 * @author zhouyang.zhou. 2017.10.30.22.
 */

@Validated
@Data
@ConfigurationProperties(prefix = "beanPlaceHolder")
public class BeanPlaceHolder {
  @NotNull
  private String name;
  private String email;
  private Address address;

  @Data
  public static class Address {
    private String detail;
    private String postCode;
  }
}
