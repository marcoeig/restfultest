package at.eiglets.restfultest.web;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;

public class MappingJacksonHttpMessageConverterProcessor implements
		BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		if(bean.getClass().isAssignableFrom(MappingJacksonHttpMessageConverter.class)) {
			final MappingJacksonHttpMessageConverter m = (MappingJacksonHttpMessageConverter)bean;
		}
		return bean;
	}

}
