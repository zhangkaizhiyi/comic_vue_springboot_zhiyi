package ink.zhiyi.hello.service.impl;

import ink.zhiyi.hello.domain.Comic;
import ink.zhiyi.hello.mapper.ComicMapper;
import ink.zhiyi.hello.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComicServiceImpl implements ComicService {
    @Autowired
    private ComicMapper comicMapper;

    @Override
    public List<Comic> getAllComic() {
        return comicMapper.getAllComic();
    }

    @Override
    public Comic getComicDetailById(Integer id) {
        return comicMapper.getOneComic(id) ;
    }
}