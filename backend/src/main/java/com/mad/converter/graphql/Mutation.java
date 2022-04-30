package com.mad.converter.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.mad.converter.dto.input.DataInput;
import com.mad.converter.dto.input.FileInput;
import com.mad.converter.util.file.FileUtils;
import java.io.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Mutation implements GraphQLMutationResolver {

  @Autowired
  private FileUtils fileUtils;

  public File fileConvert(FileInput fileInput) {
    return fileInput
      .getConvertDivisionEnum()
      .fileAction(
        fileUtils.partToFile(fileInput.getSrc()),
        fileInput.getSrcType(),
        fileInput.getTargetType()
      );
  }

  public String dataConvert(DataInput dataInput) {
    return dataInput
      .getConvertDivisionEnum()
      .dataAction(
        dataInput.getSrc(),
        dataInput.getSrcType(),
        dataInput.getTargetType()
      );
  }
}
