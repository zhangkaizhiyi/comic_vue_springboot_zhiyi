package ink.zhiyi.hello.service;

import ink.zhiyi.hello.domain.Comic;

import java.util.List;

public interface ComicService {
    List<Comic> getAllComic();

    Comic getComicDetailById(Integer id);
}
