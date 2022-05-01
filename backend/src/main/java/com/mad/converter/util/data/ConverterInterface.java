package com.mad.converter.util.data;

import com.mad.converter.enums.ConvertTypeEnum;
import java.io.File;

public interface ConverterInterface {
  public String dataConverter(
    String data,
    ConvertTypeEnum src
  );

  public File fileConverter(
    File file,
    ConvertTypeEnum src
  );
}
