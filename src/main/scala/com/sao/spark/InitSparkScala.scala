package com.sao.spark

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by saoprb on 18/09/16.
  */
class InitSparkScala {

}

object Hello {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("MyScalaApp")
    val sc = new SparkContext(conf)
    println("end...")
  }
}