package ink.zhiyi.hello.controller;
import ink.zhiyi.hello.domain.*;
import ink.zhiyi.hello.mapper.ComicMapper;
import ink.zhiyi.hello.resource.JsonData;
import ink.zhiyi.hello.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
@RequestMapping("/comic")
public class ComicController {
    @Autowired
    private ComicService comicService;
    @Autowired
    private ComicMapper comicMapper;

    //    获得所有漫画
    @GetMapping("/getAllComic")
    public Result getAllComic(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Comic> allComic = comicService.getAllComic();
        return new Result("查询成功",200,allComic.subList(0,10));
    }



    //    查询漫画详情
    @GetMapping("/getComicDetailById/{id}")
    public Result getComicDetailById(@PathVariable Integer id, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Chapter> allChaptersById = comicMapper.getAllChaptersById(id);
        Comic comic = comicService.getComicDetailById(id);
        return new Result("查询成功",200,comic);
    }


    @GetMapping("/getPages")
    public Result getPages(Integer cid,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Page> pages = comicMapper.getPages(cid);
        return new Result("查询成功",200,pages);
    }



    //    添加漫画
    @GetMapping("/insert")
    public void insetComic(){

        Integer CID = 1;
        Comic[] data = JsonData.getData();
        for (Comic comic:data) {
            String[] split = comic.getAuthor().split("：");
            String str = split[split.length -1];
            comic.setAuthor(str);
            comicMapper.insertComic(comic);
            for(Chapter chapter:comic.getChapters()){
                chapter.setCid(CID);
                CID = CID+1;
                comicMapper.insertChapter(chapter);
                for (Page page:chapter.getPages()) {
                    comicMapper.insertPage(page);
                }
            }
        }
    }

}