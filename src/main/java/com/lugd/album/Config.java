package com.lugd.album;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
@EnableCouchbaseRepositories
public class Config extends AbstractCouchbaseConfiguration {

	@Value("${couchbase.cluster.ip}")
	private String ip;

	@Value("${couchbase.cluster.bucket}")
	private String bucketName;

	@Value("${couchbase.cluster.password}")
	private String bucketPassword;

	public String getBucketName() {
		return bucketName;
	}

	@Override
	protected String getBucketPassword() {
		return bucketPassword;
	}
	@Override
	protected List<String> getBootstrapHosts() {
		return Arrays.asList(ip);
	}

}