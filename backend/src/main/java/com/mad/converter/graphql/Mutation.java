package com.mad.converter.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.mad.converter.enums.ConvertDivisionEnum;
import com.mad.converter.enums.ConvertTypeEnum;
import java.io.File;
import org.springframework.stereotype.Controller;

@Controller
public class Mutation implements GraphQLMutationResolver {

  public File fileTest(
    File file,
    ConvertTypeEnum src,
    ConvertTypeEnum target,
    ConvertDivisionEnum convertDivisionEnum
  ) {
    return convertDivisionEnum.fileAction(file, src, target);
  }

  public String dataTest(
    String data,
    ConvertTypeEnum src,
    ConvertTypeEnum target,
    ConvertDivisionEnum convertDivisionEnum
  ) {
    return convertDivisionEnum.dataAction(data, src, target);
  }
}
