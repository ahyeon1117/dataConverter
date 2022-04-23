package com.mad.converter.config;

import graphql.schema.GraphQLScalarType;
import graphql.servlet.ApolloScalars;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphqlConfig {

  @Bean
  public GraphQLScalarType uploadScalarDefine() {
    return ApolloScalars.Upload;
  }
}
