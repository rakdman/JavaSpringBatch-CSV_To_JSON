package org.tool.converter;


import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;


@Configuration
@EnableBatchProcessing
public class SpringBatchConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Value("${file.input.path}")
    private Resource[] inputResources;

    @Bean
    public Job readCSVFileJob() {
        return jobBuilderFactory.get("readCSVFilesJob")
                .incrementer(new RunIdIncrementer())
                .start(step())
                .build();
    }


    @Bean
    public Step step() {
        return stepBuilderFactory.get("step").<WorldCupMatchRecord,WorldCupMatchRecord>chunk(20000)
                .reader(multiResourceItemReader())
                .processor(processor())
                .writer(writer()).build();

    }

    public MultiResourceItemReader<WorldCupMatchRecord> multiResourceItemReader() {
        MultiResourceItemReader<WorldCupMatchRecord> resourceItemReader = new MultiResourceItemReader<WorldCupMatchRecord>();
        resourceItemReader.setResources(inputResources);
        resourceItemReader.setDelegate(reader());

        return resourceItemReader;
    }


    @Bean
    public FlatFileItemReader<WorldCupMatchRecord> reader()
    {
        FlatFileItemReader<WorldCupMatchRecord> reader = new FlatFileItemReader<WorldCupMatchRecord>();
        reader.setLinesToSkip(1);
        reader.setLineMapper(new DefaultLineMapper<>() {
            {
                setLineTokenizer(new DelimitedLineTokenizer() {
                    {
                        setNames(new String[] { "year",
                                "datetime",
                                "stage",
                                "stadium",
                                "city",
                                "homeTeamName",
                                "homeTeamGoals",
                                "awayTeamGoals",
                                "awayTeamName",
                                "winConditions",
                                "attendance",
                                "half-timeHomeGoals",
                                "half-timeAwayGoals",
                                "referee",
                                "assistant1",
                                "assistant2",
                                "roundID",
                                "matchID",
                                "homeTeamInitials",
                                "awayTeamInitials" });
                    }
                });
                setFieldSetMapper(new BeanWrapperFieldSetMapper<>() {
                    {
                        setTargetType(WorldCupMatchRecord.class);
                    }
                });

            }
        });

        reader.setRecordSeparatorPolicy(new BlankLineRecordSeparatorPolicy());
        return reader;
    }

    @Bean
    public CustomItemProcessor processor() {
        return new CustomItemProcessor();
    }


    @Bean
    public CustomItemWriter<WorldCupMatchRecord> writer()
    {
        return new CustomItemWriter<WorldCupMatchRecord>();
    }



}
