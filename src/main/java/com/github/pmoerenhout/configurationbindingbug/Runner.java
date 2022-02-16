package com.github.pmoerenhout.configurationbindingbug;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Component
public class Runner implements CommandLineRunner {

  private final SimpleProperties simpleProperties;
  private final KebabPrefixProperties kebabPrefixProperties;

  @Override
  public void run(final String... args) throws Exception {
    log.info("@ConfigurationProperties(prefix = \"simple\")");
    showSettings(simpleProperties.getSettings());
    log.info("");
    log.info("@ConfigurationProperties(prefix = \"kebab-prefix\")");
    showSettings(kebabPrefixProperties.getSettings());
  }

  private void showSettings(final Settings settings){
    log.info("simple    : {}", settings.getSimple());
    log.info("camelCase : {}", settings.getCamelCase());
  }
}
