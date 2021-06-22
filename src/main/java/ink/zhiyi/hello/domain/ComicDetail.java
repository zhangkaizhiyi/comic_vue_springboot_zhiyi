package ink.zhiyi.hello.domain;

import java.util.Arrays;

public class ComicDetail {
    private Integer id;
    private String desc;
    private String score;
    private String author;
    private String status;
    private String[] categorys;
    private String[] episodes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ComicDetail{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", score='" + score + '\'' +
                ", author='" + author + '\'' +
                ", status='" + status + '\'' +
                ", categorys=" + Arrays.toString(categorys) +
                ", episodes=" + Arrays.toString(episodes) +
                '}';
    }

    public ComicDetail() {
    }

    public ComicDetail(Integer id, String desc, String score, String author, String status, String[] categorys, String[] episodes) {
        this.id = id;
        this.desc = desc;
        this.score = score;
        this.author = author;
        this.status = status;
        this.categorys = categorys;
        this.episodes = episodes;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getCategorys() {
        return categorys;
    }

    public void setCategorys(String[] categorys) {
        this.categorys = categorys;
    }

    public String[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(String[] episodes) {
        this.episodes = episodes;
    }
}