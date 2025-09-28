package br.univille;

public class Publisher {

    public static void main(String[] args) {
        var servidor = "sbdas12025a.servicebus.windows.net";
        var topicName = "topic-das1-a";

        //o sdk do azure procura nesse ambiente a credencial
        DefaultAzureCredential credential = 
           new DefaultAzureCredentialBuilder().build();
        
        // encapsula logica para enviar mensagem
        ServiceBusSenderClient senderClient = 
            new ServiceBusClientBuilder()
            .fullyQualifiedNamespace(servidor)
            .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
           .credential(credential)
            .connectionString(chave)
            .sender()
            .topicName(topicName)
            .buildClient();

    }

}
