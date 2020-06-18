package org.example.hzerobootusers.controller;

import io.choerodon.core.base.BaseController;
import io.swagger.annotations.Api;

import org.example.hzerobootusers.base.BaseEnums;
import org.example.hzerobootusers.base.ListResult;
import org.example.hzerobootusers.base.Result;
import org.example.hzerobootusers.bean.User;
import org.example.hzerobootusers.swagge.SwaggerApiConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ALL")
@Api(tags = SwaggerApiConfig.USER)
@RestController
public class UserController extends BaseController {

    @GetMapping("/users")
    public ListResult getliset(HttpServletRequest request) {
        List<User> users = Arrays.asList(new User(1, "Arvin", "123400"),
                new User(2, "qy104", "123"),
                new User(3, "HCR", "123"));
        return new ListResult(BaseEnums.SUCCESS, users);
    }

    @GetMapping("/user")
    public Result getUser(HttpServletRequest request) {
        return new Result(BaseEnums.WEBFIND_FAILURE);
    }

}
