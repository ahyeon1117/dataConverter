package com.mad.converter.dto.input;

import com.mad.converter.enums.ConvertDivisionEnum;
import com.mad.converter.enums.ConvertTypeEnum;
import lombok.Data;

@Data
public class DataInput {

  String src;
  ConvertTypeEnum srcType;
  ConvertTypeEnum targetType;
  ConvertDivisionEnum convertDivisionEnum;
}
