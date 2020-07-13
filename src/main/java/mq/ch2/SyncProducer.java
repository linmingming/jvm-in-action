package mq.ch2;

import com.oracle.jrockit.jfr.Producer;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

public class SyncProducer {

    public static void main(String[] args) throws Exception {
        // I nstantiate with a Producer group name.
        DefaultMQProducer producer = new
                DefaultMQProducer("3year7classrom");
        producer.setNamesrvAddr("localhost:9876");

        producer.start();
        for (int i = 0; i < 100; i++) {
            Message msg = new Message("TopicTest" /* Topic */,
                    " TagA" /* Tag*/,
                    (" Hello RocketMQ " +
                            i).getBytes(RemotingHelper.DEFAULT_CHARSET));
            SendResult sendResult = producer.send(msg);
            System.out.printf("%s%n", sendResult);
        }
            producer.shutdown();
        }
    }
