package com.zhang.deleted;

import com.zhang.deleted.ByFacBean;
import org.springframework.beans.factory.FactoryBean;

//@Component
public class MyFactoryBean implements FactoryBean<ByFacBean> {
	@Override
	public ByFacBean getObject() throws Exception {
		return new ByFacBean("fcb");
	}

	@Override
	public Class<?> getObjectType() {
		return ByFacBean.class;
	}
}
