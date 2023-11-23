package pl.dyjecinski.techblog.persistence.article;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Article")
class ArticleEntity {
    @XmlElement(name = "id")
    private int id;
    @XmlElement(name = "Title")
    private String title;
    @XmlElement(name = "Description")
    private String description;
    @XmlElement(name = "Content")
    private String content;
    @XmlElement(name = "Conclusion")
    private String conclusion;
    @XmlElement(name = "Author")
    private String author;
    @XmlElement(name = "Tags")
    private String[] tags;
    @XmlElement(name = "Category")
    private String[] category;
    @XmlElement(name = "Comments")
    private String[] comments;
}
