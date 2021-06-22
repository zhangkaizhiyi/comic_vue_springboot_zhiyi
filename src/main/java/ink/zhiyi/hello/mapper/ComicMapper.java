package ink.zhiyi.hello.mapper;

import ink.zhiyi.hello.domain.Chapter;
import ink.zhiyi.hello.domain.Comic;
import ink.zhiyi.hello.domain.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ComicMapper {
    int delectAllComic();
    int delectAllPage();
    int delectAllChapter();



    int insertComic(Comic comic);
    int insertPage(Page page);
    int insertChapter(Chapter chapter);


//    查询
    List<Comic> getAllComic();
//    根据ID查询一部漫画
    Comic getOneComic(Integer id);
    List<Chapter> getAllChaptersById(Integer id);
    Integer getChapterIdByName(String name);

    List<Page> getPages(Integer id);

 }
