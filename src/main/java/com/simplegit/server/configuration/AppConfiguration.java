package com.simplegit.server.configuration;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.simplegit.server.controller" })
public class AppConfiguration extends WebMvcConfigurerAdapter {
	private Logger logger = Logger.getLogger(this.getClass());

	@Bean
	public ViewResolver viewResolver() {
		logger.debug("View Resolver is getting initialized");
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Bean(name = "dispatcher")
	public DispatcherServlet dispatcher() {
		logger.debug("Dispatcher Servlet is getting initialized");
		return new DispatcherServlet();
	}

}