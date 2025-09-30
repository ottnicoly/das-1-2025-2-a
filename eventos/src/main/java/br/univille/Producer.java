package br.univille;

public class Producer {

    public static void main(String[] args){

        var servidor = "sb-das1-2025.servicebus.windows.net";

        String chave = System.getenv("CHAVE");
        String queue = "queue-nicolyott";

        ServiceBusSenderClient senderClient = new ServiceBusClientBuilder()
            .fullyQualifiedNamespace(servidor)
            .connectionString(chave)
            .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
            .sender()
            .queueName(queue)
            .buildClient();

        senderClient.sendMessage(new ServiceBusMessage("1: Testando 1"));
        senderClient.sendMessage(new ServiceBusMessage("2: Testando 2"));
        senderClient.sendMessage(new ServiceBusMessage("3: Testando 3"));
        senderClient.sendMessage(new ServiceBusMessage("4: Testando 4"));
        senderClient.sendMessage(new ServiceBusMessage("5: Testando 5"));

    }
}
