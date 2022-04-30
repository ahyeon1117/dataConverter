package com.mad.converter.util.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.servlet.http.Part;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FileUtils {

  public File partToFile(Part part) {
    File file = null;
    try (
      OutputStream out = new FileOutputStream(file);
      InputStream filecontent = part.getInputStream();
    ) {
      Path tempFilePath = Files.createTempFile(part.getSubmittedFileName(), "");
      file = tempFilePath.toFile();

      int read = 0;
      final byte[] bytes = new byte[1024];

      while ((read = filecontent.read(bytes)) != -1) {
        out.write(bytes, 0, read);
      }
    } catch (FileNotFoundException fne) {
      log.error(fne.getMessage());
    } catch (IOException ie) {
      ie.printStackTrace();
    }

    return file;
  }
}
