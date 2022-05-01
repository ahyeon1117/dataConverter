package com.mad.converter.util.data;

import com.mad.converter.enums.ConvertTypeEnum;
import java.io.File;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
public class ConvertType {

  private ConverterInterface converterInterface;

  public String dataExecute(String data, ConvertTypeEnum src) {
    if (converterInterface == null) {
      log.info("converterInterface setting is null");
      return null;
    } else {
      return converterInterface.dataConverter(data, src);
    }
  }

  public File fileExecute(File file, ConvertTypeEnum src) {
    if (converterInterface == null) {
      log.info("converterInterface setting is null");
      return null;
    } else {
      return converterInterface.fileConverter(file, src);
    }
  }
}
