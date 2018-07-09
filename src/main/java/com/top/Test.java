package com.top;

import lombok.extern.slf4j.Slf4j;
import org.I0Itec.zkclient.ZkClient;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description
 *
 * @author 袁幸成【yuanxc@3vjia.com】
 * @since 2018/07/07 10:04
 */
@Slf4j
public class Test {


    public static void main(String[] args) {

        String address = "172.18.3.66:2182,172.18.3.66:2183,172.18.3.66:2184";
        ZkClient zkClient = new ZkClient(address, 60);
        String path = "/soaservices";
        List<String> list = zkClient.getChildren(path);
        int i = 1;
        System.out.println(zkClient.countChildren(path));
        Map<String, List<String>> children = new HashMap<>(16);
        list.forEach(str -> children.put(str, zkClient.getChildren(path + "/" + str)));
        System.out.println();
    }

}
