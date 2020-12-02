package com.zhang.deleted;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

public class MyEvent extends ApplicationEvent  implements Serializable {

	public static final long  serialVersionUID=123456L;
	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public MyEvent(Object source) {
		super(source);
	}
}
