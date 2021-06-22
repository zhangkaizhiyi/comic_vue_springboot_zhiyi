package ink.zhiyi.hello.domain;

import java.util.Arrays;
import java.util.List;

public class Chapter {
    private  Integer id;
    private  Integer cid;
    private String name;
    private String url;
    private List<Page> pages;

    public Chapter(Integer id, Integer cid, String name, String url, List<Page> pages) {
        this.id = id;
        this.cid = cid;
        this.name = name;
        this.url = url;
        this.pages = pages;
    }

    public Chapter() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", cid=" + cid +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", pages=" + pages +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }
}