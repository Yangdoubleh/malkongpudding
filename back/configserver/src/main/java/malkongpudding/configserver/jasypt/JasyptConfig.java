package malkongpudding.configserver.jasypt;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;

@Configuration
public class JasyptConfig {

    @Bean("jasyptStringEncryptor")
    public StringEncryptor stringEncryptor(@Value(value = "${jasypt.secrete-key}") String secreteKey) {
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword(secreteKey);
        config.setAlgorithm("PBEWithMD5AndDES");
        config.setPoolSize(2);
        config.setStringOutputType("base64");
        encryptor.setConfig(config);
        return encryptor;
    }
}