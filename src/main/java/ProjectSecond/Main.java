package ProjectSecond;

import ru.pflb.mq.dummy.implementation.ConnectionImpl;
import ru.pflb.mq.dummy.implementation.DestinationImpl;
import ru.pflb.mq.dummy.implementation.ProducerImpl;
import ru.pflb.mq.dummy.implementation.SessionImpl;




public  class Main {
    public static void main(String[] args) {
        ConnectionImpl connection = new ConnectionImpl();
        connection.start();
        connection.createSession(true);
        SessionImpl session = new SessionImpl();
        String str = "HomeworkSession";
        DestinationImpl destination = new DestinationImpl(str);
        ProducerImpl producer = new ProducerImpl(destination);
        String[] listing = {"Раз", "Два", "Три"};
        for (String value : listing) {
            producer.send(value);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException err) {
                err.printStackTrace();
            }
        }
        session.close();
        connection.close();
    }
}
