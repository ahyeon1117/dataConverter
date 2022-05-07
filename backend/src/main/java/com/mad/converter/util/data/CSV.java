package com.mad.converter.util.data;

import com.mad.converter.enums.ConvertTypeEnum;
import java.io.File;

public class CSV implements ConverterInterface {

  public String dataConverter(String data, ConvertTypeEnum src) {
    return data;
  }

  public File fileConverter(File file, ConvertTypeEnum src) {
    return file;
  }

  public String jsonDataToCsv(String data) {
    String result = "";

    return result;
  }
}
