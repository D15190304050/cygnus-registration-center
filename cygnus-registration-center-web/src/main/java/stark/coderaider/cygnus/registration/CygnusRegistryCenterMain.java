package stark.coderaider.cygnus.registration;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"stark.coderaider.cygnus.registration", "stark.dataworks.boot.autoconfig"})
@EnableDubbo
@EnableDiscoveryClient
public class CygnusRegistryCenterMain
{
    public static void main(String[] args)
    {
        SpringApplication.run(CygnusRegistryCenterMain.class);
    }
}
