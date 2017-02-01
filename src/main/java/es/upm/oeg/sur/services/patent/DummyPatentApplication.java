package es.upm.oeg.sur.services.patent;

import com.google.common.base.Predicates;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EnableSwagger2
public class DummyPatentApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DummyPatentApplication.class);
    }

    @Bean
    public Docket patentApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("patent-search-api")
                .apiInfo(getApiInfo())
                .select()
                .paths(Predicates.not(PathSelectors.regex("/error"))) // Exclude Spring error controllers
                .build();
    }

    @Bean
    UiConfiguration uiConfig() {
        return new UiConfiguration(
                "validatorUrl",// url
                "full",       // docExpansion          => none | list
                "alpha",      // apiSorter             => alpha
                "schema",     // defaultModelRendering => schema
                UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS,
                false,        // enableJsonEditor      => true | false
                true,         // showRequestHeaders    => true | false
                60000L);      // requestTimeout => in milliseconds, defaults to null (uses jquery xh timeout)
    }

    /***
     * Provide API information
     * @return ApiInfo of the dummy patent service.
     */
    private ApiInfo getApiInfo() {

        Contact contact = new Contact("Ontology Engineering Group", "http://www.oeg-upm.net/", "nmihindu@fi.upm.es");
        ApiInfo apiInfo = new ApiInfo("Dummy Patent Service", "A dummy service to be used for testing the patent service.",
                "0.0.1", "http://www.oeg-upm.net/", contact, "Apache Licence", "https://www.apache.org/licenses/LICENSE-2.0" );

        return apiInfo;
    }


}
