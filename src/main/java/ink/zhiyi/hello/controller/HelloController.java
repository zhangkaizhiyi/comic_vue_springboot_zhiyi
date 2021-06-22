package ink.zhiyi.hello.controller;

import ink.zhiyi.hello.domain.Result;
import ink.zhiyi.hello.domain.User;
import ink.zhiyi.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;


// RestController相当于不跳转，只返回数据
@RestController
@RequestMapping("/user")
public class HelloController {

    @Autowired
    private UserService userService;



    @GetMapping("/{id}")
    public Result getUser(@PathVariable Integer id, HttpServletResponse response , HttpServletRequest request){
//        Enumeration<String> headerNames = request.getHeaderNames();
//        while(headerNames.hasMoreElements()){
//            String key = headerNames.nextElement();
//            String value = request.getHeader(key);
//            System.out.println(key+":"+value);
//        }

        response.setHeader("Access-Control-Allow-Origin", "*");
        User user = userService.getUser(id);
        // Result 对数据进行封装
        return new Result("查询成功",200,user);
    }






}
