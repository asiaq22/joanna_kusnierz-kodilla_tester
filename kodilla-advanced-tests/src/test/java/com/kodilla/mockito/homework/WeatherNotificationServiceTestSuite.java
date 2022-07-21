package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherNotificationServiceTestSuite {

    WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
    Client client = Mockito.mock(Client.class);
    Location location = Mockito.mock(Location.class);
    Notification notification = Mockito.mock(Notification.class);


    @Test
    public void subscribedClientShouldReceiveNotificationInLocation() {
        weatherNotificationService.addSubscriber(client, location);

        weatherNotificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotificationEveryLocation() {
        weatherNotificationService.addSubscriber(client, location);
        weatherNotificationService.removeSubscriber(client, location);

        weatherNotificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void locationShouldBeRemoved() {
        weatherNotificationService.removeLocation(location);

        weatherNotificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void everySubscribedClientShouldReceiveNotification() {
        weatherNotificationService.addSubscriber(client, location);

        weatherNotificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);

    }

    @Test
    public void notificationForPeopleInLocationShouldBeSendToSpecificGroupOfPeople() {
        weatherNotificationService.addSubscriber(client, location);

        weatherNotificationService.sendNotificationInLocation(notification);
        Mockito.verify(location, Mockito.times(1)).receive(notification);

    }
}