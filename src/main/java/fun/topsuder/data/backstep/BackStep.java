package fun.topsuder.data.backstep;

import lombok.extern.slf4j.Slf4j;

/**
 * <span>Form File</span>
 * <p>Description</p>
 * <p>Company:QQ 752340543</p>
 *
 * @author topsuder
 * @version v1.0.0
 * @DATE 2023/5/18-11:27
 * @Description
 * @see fun.topsuder.data.backstep zh-data-senior-developer
 */

@Slf4j
public class BackStep {

    /**
     * 定义最后剩余的萝卜数
     */
    private static int lastCarrotNum = 3;

    /**
     * 定义到达的最后的萝卜数的步数
     */
    private static int days = 8;


    public static void main(String[] args) {
        //调用逆推算法
        backStep(lastCarrotNum, days);
    }

    private static void backStep(int lastCarrotNum, int days) {
        for (int i = 1; i < days; i++) {
            lastCarrotNum = (lastCarrotNum + 1) * 2;
            log.info("第{}天，剩余萝卜数：{}", days-i, lastCarrotNum);

            if (lastCarrotNum < 200) {
                log.info("第{}天，不够吃", days-i);
            } else {
                log.info("第{}天，够吃", days-i);
            }
        }
        log.info("最后一天，萝卜数：{}", lastCarrotNum);

    }

}
