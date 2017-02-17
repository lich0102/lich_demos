package samples;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by licanhui on 2016/12/29.
 */
@Configuration
@EnableWebMvc
public class Myconfig    extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
        super.addResourceHandlers(registry);
    }
}
