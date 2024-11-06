package com.nesGS.vernaculo.service;

import com.nesGS.vernaculo.model.Calendar;

import java.util.Optional;

public interface CalendarService {

    public Iterable<Calendar> getAllCalendar();

    public Optional<Calendar> getCalendarById(Long id);

    public Optional<Calendar> createCalendar(Calendar calendar);

    public Optional<Calendar> updateCalendar(Long id, Calendar calendar);

    public void deleteCalendar(Long id);

}
