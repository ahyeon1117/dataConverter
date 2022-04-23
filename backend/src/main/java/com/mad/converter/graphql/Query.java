package com.mad.converter.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Controller;

@Controller
public class Query implements GraphQLQueryResolver {

  public String test() {
    return "test!!";
  }
}
