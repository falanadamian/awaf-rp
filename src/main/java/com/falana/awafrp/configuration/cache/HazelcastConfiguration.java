package com.falana.awafrp.configuration.cache;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizeConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastConfiguration {

    @Bean
    public Config hazelcastConfig() {
        return new Config()
                .setInstanceName("firewall")
                .addMapConfig(
                        new MapConfig()
                                .setName("firewallCache")
                                .setMaxSizeConfig(
                                        new MaxSizeConfig(200, MaxSizeConfig.MaxSizePolicy.FREE_HEAP_SIZE))
                                .setEvictionPolicy(EvictionPolicy.LFU)
                                .setTimeToLiveSeconds(2000)
                );
    }
}