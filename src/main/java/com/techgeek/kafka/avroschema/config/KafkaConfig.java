//package com.techgeek.kafka.avroschema.config;
//
//import com.techgeek.kafka.avroschema.schema.generated.StockHistory;
//import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//import org.springframework.kafka.config.KafkaListenerContainerFactory;
//import org.springframework.kafka.core.ConsumerFactory;
//import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
//import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
//
//@Configuration
//public class KafkaConfig {
//
//    @Bean
//    public ConsumerFactory<String, StockHistory> consumerFactory(KafkaProperties properties) {
//        return new DefaultKafkaConsumerFactory<>(properties.buildConsumerProperties());
//    }
//
//    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, StockHistory>> kafkaListenerContainerFactory(KafkaProperties kafkaProps) {
//        ConcurrentKafkaListenerContainerFactory<String, StockHistory> factory =
//                new ConcurrentKafkaListenerContainerFactory<String, StockHistory>();
//        factory.setConsumerFactory(consumerFactory(kafkaProps));
//    }
//
//}
