package com.tts.report;

import javax.annotation.Resource;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.env.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

@Configuration
@PropertySource(value = "classpath:elasticsearch.properties")
public class ElasticsearchConfiguration {
	@Resource
	private Environment environment;

	@Bean
	public Client client() {
		TransportClient client = new TransportClient();
		TransportAddress address = new InetSocketTransportAddress(environment.getProperty("elasticsearch.host"),
				Integer.parseInt(environment.getProperty("elasticsearch.port")));
		client.addTransportAddress(address);
		return client;
	}

	@Beanpublic
	ElasticsearchOperations elasticsearchTemplate() {
		return new ElasticsearchTemplate(client());
	}
}
