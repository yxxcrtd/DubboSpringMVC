package org.young.service.impl;

import org.young.service.TestService;

public class TestServiceImpl implements TestService {

    public String saySomething(String s) {
        return "您输入了：" + s;
    }

}
