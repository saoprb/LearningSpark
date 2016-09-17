package com.sao.java;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

/**
 * Created by saoprb on 18/09/16.
 */
public class InitSparkJava {

    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setMaster("local").setAppName("MyJavaAppScala");
        JavaSparkContext sc = new JavaSparkContext(conf);
        System.out.println("end...");
    }
}
