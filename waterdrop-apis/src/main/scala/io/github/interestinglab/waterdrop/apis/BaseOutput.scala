package io.github.interestinglab.waterdrop.apis

import org.apache.spark.sql.{Dataset, Row}

trait BaseOutput extends Plugin {

  def preProcess(df: Dataset[Row]): Unit = {}

  def afterProcess(df: Dataset[Row]): Unit = {}

  def process(df: Dataset[Row])
}
