package com.example.restws.health_1;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "todo")
public class ToDoProperties {
private String path;
}