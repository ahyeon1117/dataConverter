package com.mad.converter.util.data;

import com.mad.converter.enums.ConvertTypeEnum;
import java.io.File;

public class EXCEL implements ConverterInterface {

  public String dataConverter(
    String data,
    ConvertTypeEnum src,
    ConvertTypeEnum target
  ) {
    return data;
  }

  public File fileConverter(
    File file,
    ConvertTypeEnum src,
    ConvertTypeEnum target
  ) {
    return file;
  }
}
