package com.orion.digital_design_platform.core.tuple;

import java.io.Serializable;
import java.util.List;

public interface Tuple extends Serializable {
	Object get(int index);


	Object[] getAsArray();


	List<Object> getAsList();


	boolean isEmpty();
}