package com.example.restws.health_3;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "todobuild")
public class ToDoBuildProperties {
private String buildVersion;
}