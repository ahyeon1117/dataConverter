package com.mad.converter.enums;

import com.mad.converter.util.data.CSV;
import com.mad.converter.util.data.ConvertType;
import com.mad.converter.util.data.EXCEL;
import com.mad.converter.util.data.JSON;
import java.io.File;

public enum ConvertDivisionEnum {
  DATA,
  FILE;

  public String dataAction(
    String data,
    ConvertTypeEnum src,
    ConvertTypeEnum target
  ) {
    return databaseSelecter(target).dataExecute(data, src, target);
  }

  public File fileAction(
    File file,
    ConvertTypeEnum src,
    ConvertTypeEnum target
  ) {
    return databaseSelecter(target).fileExecute(file, src, target);
  }

  public ConvertType databaseSelecter(ConvertTypeEnum convertTypeEnum) {
    ConvertType convertType = new ConvertType();
    switch (convertTypeEnum) {
      case CSV:
        convertType.setConverterInterface(new CSV());
        break;
      case JSON:
        convertType.setConverterInterface(new JSON());
        break;
      case EXCEL:
        convertType.setConverterInterface(new EXCEL());
        break;
      default:
        break;
    }

    return convertType;
  }
}
