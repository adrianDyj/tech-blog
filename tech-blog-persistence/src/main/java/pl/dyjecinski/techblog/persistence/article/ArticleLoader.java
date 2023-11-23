package pl.dyjecinski.techblog.persistence.article;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.StringReader;

@Service
@AllArgsConstructor
class ArticleLoader {

    private FileUtil fileUtil;

    public ArticleWrapper loadArticles() {
        String articlesAsString = fileUtil.getFileAsString("data/articles/articles.xml");
        return (ArticleWrapper) unmarshalXml(articlesAsString);
    }

    private Object unmarshalXml(String xml) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ArticleWrapper.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return unmarshaller.unmarshal(new StringReader(xml));
        } catch (JAXBException e) {
            throw new IllegalArgumentException("Error while converting xml to object", e);
        }
    }
}
