package com.nesGS.vernaculo.service.serviceImpl;

import com.nesGS.vernaculo.model.Calendar;
import com.nesGS.vernaculo.repository.CalendarRepository;
import com.nesGS.vernaculo.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class CalendarServiceImpl implements CalendarService {


    @Autowired
    private CalendarRepository calendarRepository;

    @Transactional
    @Override
    public Iterable<Calendar> getAllCalendar() {
        return calendarRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Calendar> getCalendarById(Long id) {
        return calendarRepository.findById(id);
    }

    @Override
    public Optional<Calendar> createCalendar(Calendar calendar) {
        Calendar newCalendar = calendarRepository.save(calendar);
        return Optional.of(newCalendar);
    }

    @Override
    public Optional<Calendar> updateCalendar(Long id, Calendar updatedCalendar) {
        updatedCalendar.setId(id);
        Calendar savedCalendar = calendarRepository.save(updatedCalendar);
        return Optional.of(savedCalendar);
    }

    @Override
    public void deleteCalendar(Long id) {
        calendarRepository.deleteById(id);

    }
}
