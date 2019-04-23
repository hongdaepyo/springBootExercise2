package com.nhn.edu.springboot.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 * TODO(1) application.property 에서 dooray.hook-url 을 문자열로 받을 수 있도록 속성을 선언하세요.
 * TODO(1) application.propertyからdooray.hook-urlをもらえるように,プロパティを宣言してください。
 */
@ConfigurationProperties(prefix = "dooray")
public class DoorayProperties {
	private String hookUrl;

	public String getHookurl() {
		return hookUrl;
	}

	public void setHookurl(String hookurl) {
		this.hookUrl = hookurl;
	}
}
