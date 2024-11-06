package com.nesGS.vernaculo.repository;

import com.nesGS.vernaculo.model.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarRepository extends JpaRepository<Calendar, Long> {
}
