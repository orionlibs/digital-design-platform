package com.orion.digital_design_platform.core.abstraction;

import java.io.Serializable;

public interface Enumeration extends Serializable {
	String get();


	boolean is(Enumeration other);


	boolean isNot(Enumeration other);
}