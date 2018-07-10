package com.javaee.klenner.mongodb.domain;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GasStation {
	
	private String id = UUID.randomUUID().toString();
    private String name;
}
