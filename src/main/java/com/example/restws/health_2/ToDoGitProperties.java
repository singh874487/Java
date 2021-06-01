package com.example.restws.health_2;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "todogit")
public class ToDoGitProperties {
private String path;
}