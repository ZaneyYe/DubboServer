package dubbo.demo.service.impl;

import dubbo.demo.service.HelloService;

/**
 * Created by yzy on 2016/8/31.
 */
public class HelloServiceImpl implements HelloService{

    public String getHello(String name) {
        System.out.println(name + "已经到达,欢迎");
        return name + "到达北京！Go";
    }


}
