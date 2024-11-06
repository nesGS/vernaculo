package com.nesGS.vernaculo.service.serviceImp;

import com.nesGS.vernaculo.model.Calendar;
import com.nesGS.vernaculo.service.CalendarService;

import java.util.Optional;

public class CalendarServiceImpl implements CalendarService {


    @Override
    public Iterable<Calendar> getAllCalendar() {
        return null;
    }

    @Override
    public Optional<Calendar> getCalendarById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Calendar> createCalendar(Calendar calendar) {
        return Optional.empty();
    }

    @Override
    public Optional<Calendar> updateCalendar(Long id, Calendar calendar) {
        return Optional.empty();
    }

    @Override
    public void deleteCalendar(Long id) {

    }
}
