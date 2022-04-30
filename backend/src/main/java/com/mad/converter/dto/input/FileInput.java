package com.mad.converter.dto.input;

import com.mad.converter.enums.ConvertDivisionEnum;
import com.mad.converter.enums.ConvertTypeEnum;
import javax.servlet.http.Part;
import lombok.Data;

@Data
public class FileInput {

  Part src;
  ConvertTypeEnum srcType;
  ConvertTypeEnum targetType;
  ConvertDivisionEnum convertDivisionEnum;
}
