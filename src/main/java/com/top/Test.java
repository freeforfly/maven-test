package com.top;

import com.alibaba.fastjson.JSON;
import com.swj.basic.SwjConfig;
import com.swj.basic.annotation.FreewayPath;
import com.swj.basic.helper.PackageHelper;
import com.swj.basic.helper.StringHelper;
import lombok.extern.slf4j.Slf4j;
import org.I0Itec.zkclient.ZkClient;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description
 *
 * @author 袁幸成【yuanxc@3vjia.com】framework
 * @since 2018/07/07 10:04
 */
@Slf4j
public class Test {


    public static void main(String[] args) throws Exception {
        List<Class> classes = PackageHelper.getClass("com.top", true, false);
        for (Class clazz : classes) {
            if (clazz.isAnnotationPresent(FreewayPath.class)) {
                break;
            }
        }
//        String address = "172.18.3.66:2182,172.18.3.66:2183,172.18.3.66:2184";
//        ZkClient zkClient = new ZkClient(address, 60);
//        String path = "/soaservices";
//        List<String> list = zkClient.getChildren(path);
//        int i = 1;
//        System.out.println(zkClient.countChildren(path));
//        Map<String, List<String>> children = new HashMap<>();
//        list.stream().forEach(str -> children.put(str, zkClient.getChildren(path + "/" + str)));
        System.out.println();
    }
}
