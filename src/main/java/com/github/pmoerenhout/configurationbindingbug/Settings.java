package com.github.pmoerenhout.configurationbindingbug;

import javax.validation.constraints.NotEmpty;

import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import lombok.Getter;
import lombok.Setter;

@Configuration
@Validated
@Getter
@Setter
public class Settings {
  @NotEmpty
  private String simple;
  @NotEmpty
  private String camelCase;

}
