package org.mybatis.generator.api;

/**
 * Created by Lubiao Zheng
 * Created time 2017/10/19 21:40
 * Description
 */
public class StartDebug {
    public static void main(String[] args) {
        String[] args2 = {"-configfile", "D:\\github\\mybatis-generator-1.3.5\\mybatis-generator-core-1.3.5\\lib\\generatorConfigDebug.xml", "-overwrite"};
        ShellRunner.main(args2);
    }
}
