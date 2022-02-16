package com.github.pmoerenhout.configurationbindingbug;

import javax.validation.Valid;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties(prefix = "kebab-prefix")
@Validated
@Getter
@Setter
public class KebabPrefixProperties {

  @NestedConfigurationProperty
  @Valid
  private Settings settings = new Settings();
}
