package com.msaggik.fourthlessontrainticketsgroup.model;

public class RailwayTicketOld extends RailwayTicket {
    // задание полей
    private float ticketDiscount; // скидка на детский билет

    // создание пустого конструктора
    public RailwayTicketOld() {
    }
    // создание конструктора исходных данных детского билета (стоимость билета, количество билетов, скидка)
    public RailwayTicketOld(float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    // переопределение метода подсчёта стоимости детских билетов
    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount))/100; // нужно умножить количество билетов на стоимость одного билета и на скидку и всё разделить на 100
    }
}