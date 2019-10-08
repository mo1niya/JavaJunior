package lesson14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InternalAccount {
    private static final Logger logger = LoggerFactory.getLogger(InternalAccount.class);
    public float getSum() {
        return sum;
    }
    public void setSum(float sum) {
        this.sum = this.sum + sum;
        if (this.sum > 0){
            logger.info("Счет пополнен");
        }
    }
    private float sum;

}
