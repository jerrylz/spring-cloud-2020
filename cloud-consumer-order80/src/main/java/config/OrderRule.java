package config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jerrylz
 * @date 2020/4/22
 */
@Configuration
public class OrderRule {

    @Bean
    public IRule getRule(){
        return new RandomRule();
    }
}
