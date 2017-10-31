package org.glamey.springbootstart;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Slf4j
@EnableWebMvc
@SpringBootApplication
public class SpringbootstartApplication {

  public static void main(String[] args) {
    /**
     * modify the default spring config file name,
     * OR
     * assign the spring config location like spring.config.location=classpath:/default.yml,classpath:/override.yml,file:./
     */
    System.setProperty("spring.config.name", "application");

    SpringApplication application = new SpringApplication(SpringbootstartApplication.class);


    // close the spring boot starter banner,and to custom the banner
    //application.setBannerMode(Banner.Mode.OFF);

    //屏蔽命令行中的参数
    //application.setAddCommandLineProperties(false);

    application.run(args);

    /*
    ConfigurableApplicationContext context = application.run(args);
    //exit
    int exit = SpringApplication.exit(context);
    log.info("spring boot exit code is {}", exit);

    */
  }

  class ExitCodeApplication {

    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
      return new ExitCodeGenerator() {
        @Override public int getExitCode() {
          log.info("spring boot exit by gracefully, the exit code is {}", 42);
          return 42;
        }
      };
    }
  }


  @Component class NoWebRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
      log.info("This is the no web runner(command line runner)...");

    }
  }
}
