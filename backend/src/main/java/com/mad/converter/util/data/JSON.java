package com.mad.converter.util.data;

import com.mad.converter.enums.ConvertTypeEnum;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSON implements ConverterInterface {

  public String dataConverter(String data, ConvertTypeEnum src) {
    String resultData = "";
    switch (src) {
      case JSON:
        // resultData = csvDataToJson(data);
        break;
      case EXCEL:
        // resultData = excelDataToJson(data);
        break;
      case CSV:
        resultData = csvDataToJson(data);
        break;
      default:
        resultData = "Data is null";
        break;
    }
    return resultData;
  }

  public File fileConverter(File file, ConvertTypeEnum src) {
    return file;
  }

  public String csvDataToJson(String data) {
    Map<String, String> result = new HashMap<String, String>();
    String[] splitDatas = data.split("\n");

    List<String> header = Arrays.asList(splitDatas[0].split(","));
    int value = 0;

    for (String splitData : splitDatas) {
      if (
        splitData.contains(
          header.toString().replace("[", "").replace("]", "").replace(" ", "")
        )
      ) {
        for (String key : header) {
          result.put(key, splitData.split(",")[value]);

          value++;
          if (value == header.size()) {
            value = 0;
          }
        }
      }
    }
    // for (String splitData : splitDatas) {
    //   splitData.split(",");
    // }
    // for (int i = 0; i < header.length; i++) {
    //   result.put(header[i], splitDatas[value]);
    //   value++;
    //   if(i == 4) {
    //     i = 0;
    //   }
    // }

    return result.toString();
  }
}
