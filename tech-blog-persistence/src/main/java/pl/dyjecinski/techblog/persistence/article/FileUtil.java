package pl.dyjecinski.techblog.persistence.article;

import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.IOException;
import java.nio.file.Files;

@Component
class FileUtil {

    public String getFileAsString(String fileName) {
        try {
            return new String(Files.readAllBytes(ResourceUtils.getFile("classpath:" + fileName).toPath()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
