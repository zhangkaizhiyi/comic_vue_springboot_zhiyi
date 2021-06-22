package ink.zhiyi.hello.domain;

import java.util.Arrays;
import java.util.List;

public class Comic {
   private String name;
   private String author;
   private String cover;
   private String kind;
   private List<Chapter> chapters;
   private Integer id;
   private String detailUrl;
   private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", cover='" + cover + '\'' +
                ", kind='" + kind + '\'' +
                ", chapters=" + chapters +
                ", id=" + id +
                ", detailUrl='" + detailUrl + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public Comic() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Comic(String name, String author, String cover, String kind, List<Chapter> chapters, Integer id, String detailUrl, String desc) {
        this.name = name;
        this.author = author;
        this.cover = cover;
        this.kind = kind;
        this.chapters = chapters;
        this.id = id;
        this.detailUrl = detailUrl;
        this.desc = desc;
    }
}