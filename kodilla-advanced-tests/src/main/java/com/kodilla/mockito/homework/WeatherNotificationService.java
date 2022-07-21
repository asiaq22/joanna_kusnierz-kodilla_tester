package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.Map;

public class WeatherNotificationService {

    private Map<Client, Location> clients = new HashMap<>();

    public void addSubscriber(Client client, Location location) {
        this.clients.put(client, location);
    }

    public void sendNotification(Notification notification) {
        this.clients.forEach((client, location) -> client.receive(notification));
    }

    public void sendNotificationInLocation(Notification notification) {
        this.clients.forEach((client, location) -> location.receive(notification));
    }

    public void removeSubscriber(Client client, Location location) {
        this.clients.remove(client, location);
    }

    public void removeLocation(Location location) {
        this.clients.remove(location);
    }
}
