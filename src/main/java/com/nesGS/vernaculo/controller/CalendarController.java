package com.nesGS.vernaculo.controller;


import com.nesGS.vernaculo.model.Calendar;
import com.nesGS.vernaculo.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/vernaculo/calendar")
public class CalendarController {

    @Autowired
    private CalendarService calendarService;

    @GetMapping
    public Iterable<Calendar> getAllCalendar() {
        return calendarService.getAllCalendar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Calendar> getCalendarById(@PathVariable Long id) {
        Calendar calendar = calendarService.getCalendarById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Calendar not found"));
        return ResponseEntity.ok(calendar);
    }

    @PostMapping
    public ResponseEntity<Calendar> createCalendar(@RequestBody Calendar calendar) {
        Calendar savedCalendar = calendarService.createCalendar(calendar)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Calendar not found"));
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCalendar);
    }

}
