package com.ronyreyna.DeclaracionIva.configuration;

import java.util.List;
import javax.management.NotificationListener;
import com.ronyreyna.DeclaracionIva.bach.FacturasProssesor;
import com.ronyreyna.DeclaracionIva.bach.FacturasReader;
import com.ronyreyna.DeclaracionIva.bach.FacturasWriter;
import com.ronyreyna.DeclaracionIva.xml.Factura;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.DefaultBatchConfigurer;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.MapJobRepositoryFactoryBean;
import org.springframework.batch.core.step.tasklet.TaskletStep;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.support.transaction.ResourcelessTransactionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class BachConfiguration extends DefaultBatchConfigurer {

    @Autowired
    private StepBuilderFactory stepFactory;

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Bean
    public ResourcelessTransactionManager resoucelessTransactionManager() {
        return new ResourcelessTransactionManager();
    }

    @Override
    public JobRepository createJobRepository() throws Exception {
        MapJobRepositoryFactoryBean factoryBean = new MapJobRepositoryFactoryBean();
        factoryBean.setTransactionManager(resoucelessTransactionManager());
        return factoryBean.getObject();
    }

    @Bean
    public Job jobFile(JobListener listener, @Qualifier("readFile") Step step) {
        return jobBuilderFactory.get("jobFile")
            .incrementer(new RunIdIncrementer())
            .listener(listener)
            .flow(step)
            .end()
            .build();
    }

    @Bean
    public Step readFile(ItemWriter<Factura> writer){
        return stepFactory.get("readFile").<String, Factura>chunk(10)
            .reader(itemReader())
            .processor(itemProcessor())
            .writer(writer)
            .build();
    }

    @Bean
    public ItemReader<String> itemReader() {
        return new FacturasReader();
    }

    @Bean
    public ItemProcessor<String, Factura> itemProcessor() {
        return new FacturasProssesor();
    }

    @Bean
    public void itemWriter() {
        new FacturasWriter();
    }




}
