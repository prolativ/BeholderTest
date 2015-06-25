package utilities

/**
 * Created by Masa on 6/7/15.
 */
object TimerUtilites {

  /**
   * 1秒ごとに指定した処理を実行
   * @param callback
   */
  def executePerSecond(callback: () => Unit) {
    while (true) {
      callback(); Thread sleep 1000
    }
  }

  /**
   * 一定間隔で指定した処理を実行
   * @param callback
   * @param period
   */
  def executePerPeriod(callback: () => Unit, period: Int) {
    while (true) {
      callback(); Thread sleep period
    }
  }

  /**
   * 一定間隔で指定した処理を実行
   * @param callback 実行したい処理
   * @param period　実行間隔
   * @param executeCount 実行回数
   */
  def executePerPeriod(callback: () => Unit, period: Int, executeCount: Int): Unit = {
    for (i: Int <- 1 to executeCount) {
      callback(); Thread sleep period
    }
  }

}
