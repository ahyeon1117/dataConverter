package com.mad.converter.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mad.converter.enums.ConvertDivisionEnum;
import com.mad.converter.enums.ConvertTypeEnum;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;

@Controller
public class Query implements GraphQLQueryResolver {

  public String test() {
    return "test!!";
  }

  public List<String> dataType(ConvertDivisionEnum param) {
    List<String> sources = new ArrayList<>();
    if (param.equals(ConvertDivisionEnum.DATA)) {
      for (ConvertTypeEnum convertTypeEnum : ConvertTypeEnum.values()) {
        sources.add(convertTypeEnum.toString());
        if (sources.contains("EXCEL")) {
          sources.remove("EXCEL");
        }
      }
    } else {
      for (ConvertTypeEnum convertTypeEnum : ConvertTypeEnum.values()) {
        sources.add(convertTypeEnum.toString());
      }
    }

    return sources;
  }
}
