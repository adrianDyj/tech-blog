package pl.dyjecinski.techblog.persistence.article;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@XmlRootElement(name="Customer")
class ArticleWrapper {
    @XmlElement(name="Title")
    private String title;
    @XmlElement(name="Version")
    private String version;
    @XmlElement(name="Article")
    @XmlElementWrapper(name="Articles")
    private List<ArticleEntity> articles;
}
